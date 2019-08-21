package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.PreFooterOther;
import testingframework.Base;
import datamaps.FooterLinks;

public class EventsPerGroupPreFooterStepDefinitions extends Base {
	
	@Given("^User is on the \"([^\"]*)\" page to validate pre footer container features$")
	public void user_is_on_the_page_to_validate_pre_footer_container_features(String baseUrl) throws Throwable {
	    initializeDriver();
	    driver.get(baseUrl);
	}
	
	@Then("^validate that text inside infoClass contains \"([^\"]*)\"$")
	public void validate_that_text_inside_infoClass_is(String expText) throws Throwable {
	    
		PreFooterOther preFootOth = new PreFooterOther(driver);
	    Assert.assertTrue(preFootOth.getInfoClassElem().getText().contains(expText));
	   
	}
	
	@Then("^validate that link text inside infoClass contains the following$")
	public void validate_that_link_text_inside_infoClass_contains_the_following(List<FooterLinks> linkTexts) throws Throwable {
	    
		PreFooterOther preFootOth= new PreFooterOther(driver);
		int index=0;
		
		for(WebElement lElem:preFootOth.getInfoClassAchorTagElements()) {
			Assert.assertEquals(linkTexts.get(index++).getLinkText(), lElem.getText());
	    }
		
	}

	@Then("^there is a \"([^\"]*)\" inside the line break of  infoClass$")
	public void there_is_a_inside_the_line_break_of_infoClass(String txt) throws Throwable {
		PreFooterOther preFootOth= new PreFooterOther(driver);
		Assert.assertTrue(preFootOth.getInfoClassElem().getText().contains(txt));
	}

	@Then("^validate that the links inside infoClass Elements are clickable$")
	public void validate_that_the_links_inside_infoClass_Elements_are_clickable() throws Throwable {
		PreFooterOther preFootOth= new PreFooterOther(driver);
		for ( WebElement anchor:preFootOth.getInfoClassAchorTagElements()) {
		
			Assert.assertTrue(isClickable(anchor));
			
		}
		

	}
	
	@Then("^validate that para in the explain div class contains the following$")
	public void validate_that_para_in_the_explain_div_class_contains_the_following(List<FooterLinks> data) throws Throwable {
		PreFooterOther preFootOth= new PreFooterOther(driver);
		int index=0;
		for(WebElement paraEl:preFootOth.getExplainClassParaLements()) {
			
			Assert.assertEquals(paraEl.getText(),data.get(index++).getLinkText());
		
		}
	}

	
	@Then("^validate that unordered list in the prefooter contains the following texts$")
	public void validate_that_unordered_list_in_the_prefooter_contains_the_following_texts(List<FooterLinks> data) throws Throwable {
		PreFooterOther preFootOth= new PreFooterOther(driver);
		int index=0;
		for(WebElement listEl:preFootOth.getExplainClassUlLements()) {
			
			Assert.assertEquals(listEl.getText().replace("\n",":"),data.get(index++).getLinkText());

		}	
		
	}
	
	@Then("^validate that following text in pre footer are linktext$")
	public void validate_that_following_text_in_pre_footer_are_linktext(List<FooterLinks> expData) throws Throwable {
	
		PreFooterOther preFootOth= new PreFooterOther(driver);
		int index=0;
		
		for(WebElement anchor:preFootOth.getAnchorELementsFromPreFooter()) {
			
			Assert.assertEquals(anchor.getText(),expData.get(index++).getLinkText());		
			
		}
		
	}

	@Then("^close the browser openned to validate pre footer features for Events Per Group Page$")
	public void close_the_browser_openned_to_validate_pre_footer_features_for_Events_Per_Group_Page() throws Throwable {
	    unInitializeDriver();
	}

}
