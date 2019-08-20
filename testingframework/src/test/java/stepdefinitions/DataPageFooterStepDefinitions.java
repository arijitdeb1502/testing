package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.Footer;
import testingframework.Base;

import datamaps.FooterLinks;

public class DataPageFooterStepDefinitions extends Base {

	@Given("^User moves on to the \"([^\"]*)\" page for validating footer$")
	public void user_moves_on_to_the_page_for_validating_footer(String dataPageUrl) throws Throwable {
		driver=initializeDriver();
  		driver.get(dataPageUrl);
	}

	@Then("^validate all the following link texts are present in the footer$")
	public void validate_all_the_following_link_texts_are_present_in_the_footer(List<FooterLinks> linkTexts) throws Throwable {
        
		Footer f=new Footer(driver);
	    int index=0;
	    
	    for (WebElement link:f.getAllLinksFromFooter()) {
			Assert.assertEquals(linkTexts.get(index++).getLinkText(),link.getText());
	    } 
	}
	
	@Then("^validate all the links present in the footer is clickable$")
	public void validate_all_the_links_present_in_the_footer_is_clickable() throws Throwable {
		
		Footer f=new Footer(driver);
		
		for (WebElement link:f.getAllLinksFromFooter()) {
			assertTrue(isClickable(link));
		}
	
	}
	
	@Then("^validate all the social links are clickable$")
	public void validate_all_the_social_links_are_clickable() throws Throwable {
		Footer f=new Footer(driver);
		
		for (WebElement link:f.getAllLinksFromFooterElemSocial()) {
			assertTrue(isClickable(link));
		}
		
	}
	
	@Then("^validate all the social class texts are like the following$")
	public void validate_all_the_social_class_texts_are_like_the_following(List<FooterLinks> textsFromSocialClass) throws Throwable {
		Footer f=new Footer(driver);
	    int index=0;
	    
	    for (WebElement socialClassText:f.getAllParaElemsFromFooterElemSocial()) {
			Assert.assertEquals(textsFromSocialClass.get(index++).getLinkText(),socialClassText.getText());
	    } 
	}
	
	@Then("^close the browser after validation is completed for all the footer features$")
	public void close_the_browser_after_validation_is_completed_for_all_the_footer_features() throws Throwable {
		unInitializeDriver();
	}
}
