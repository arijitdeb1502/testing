package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import datamaps.RadioButtonUrls;
import datamaps.radioButtonVsUrlVsStarCnt;
import pageobjects.ReposPerProgrammingLanguagePage;
import testingframework.Base;

public class ReposPerProgrammingLanguageBodyStepDefinitions extends Base {
	
	@Given("^User is on the \"([^\"]*)\" page to validate all the features of it$")
	public void user_is_on_the_page_to_validate_all_the_features_of_it(String baseUrl) throws Throwable {
	    
		initializeDriver();
	    driver.get(baseUrl);
	}

	@Then("^user finds the \"([^\"]*)\" header text$")
	public void user_finds_the_header_text(String txtValue) throws Throwable {
		
		ReposPerProgrammingLanguagePage rPerProgPage = new ReposPerProgrammingLanguagePage(driver);
		
		Assert.assertEquals(rPerProgPage.getPageHeaderElement().getText(),txtValue );
	    
	}

	@Then("^the header text is in hex color code \"([^\"]*)\"$")
	public void the_header_text_is_in_hex_color_code(String expColorCode) throws Throwable {
		
		ReposPerProgrammingLanguagePage rPerProgPage = new ReposPerProgrammingLanguagePage(driver);
		String actualColorCode=getColorMapToRgba(rPerProgPage.getPageHeaderElement().getCssValue("color"));
		String expectedColorCode=getColorMapToRgba(expColorCode);
		Assert.assertEquals(actualColorCode,expectedColorCode);
	
	}

	@Then("^the header text font is in \"([^\"]*)\"$")
	public void the_header_text_font_is_in(String expHeaderFontFamily) throws Throwable {
		
		ReposPerProgrammingLanguagePage rPerProgPage = new ReposPerProgrammingLanguagePage(driver);
		String actualFontFamily=rPerProgPage.getPageHeaderElement().getCssValue("font-family").replace("\"", "");
		Assert.assertEquals(actualFontFamily,expHeaderFontFamily);
		
	}
	
	@Then("^user finds the count of total radio buttons in the page to be \"([^\"]*)\"$")
	public void user_finds_the_count_of_total_radio_buttons_in_the_page_to_be(String expRadioButtonCount) throws Throwable {

		ReposPerProgrammingLanguagePage rPerProgPage = new ReposPerProgrammingLanguagePage(driver);
		Integer actualRadioButtonCnt=rPerProgPage.getAllRadioButtonElements().size();
		

		Assert.assertEquals(Integer.toString(actualRadioButtonCnt), expRadioButtonCount);
		
	}
	
	@Then("^try clicking on the following radio buttons and check the new urls as mentioned$")
	public void try_clicking_on_the_following_radio_buttons_and_check_the_new_urls_as_mentioned(List<RadioButtonUrls> RadioTextVsNewUrls) throws Throwable {
		
		ReposPerProgrammingLanguagePage rPerProgPage = new ReposPerProgrammingLanguagePage(driver);

		
		for(RadioButtonUrls map:RadioTextVsNewUrls) {
			
			
			rPerProgPage.getRadioButton(map.getRadioButtons()).click();
			
			String expectedNewUrl=map.getNewUrls();
			String actualNewUrl=driver.getCurrentUrl();
			Assert.assertEquals(actualNewUrl, expectedNewUrl);
		
		}
			
		
		
	}

	
	@Then("^test if the user clicks on the \"([^\"]*)\" radio button the following url and stats are displayed$")
	public void test_if_the_user_clicks_on_the_radio_button_the_following_url_and_stats_are_displayed(String progLanguage, List<radioButtonVsUrlVsStarCnt> expStatDetails) throws Throwable {
	    
		ReposPerProgrammingLanguagePage rPerProgPage = new ReposPerProgrammingLanguagePage(driver);
		rPerProgPage.getRadioButton(progLanguage).click();

		int index=0;		
		List<String> actualResult=rPerProgPage.getDetailsOfRepPerProgLang();
		
				
		for(radioButtonVsUrlVsStarCnt expResult:expStatDetails ) {
			String actUrl=actualResult.get(index).split(" ")[0];
			String actLinkTxt=actualResult.get(index).split(" ")[1];
			String actStarCnt=actualResult.get(index++).split(" ")[2].substring(1);
			
			String expUrl=expResult.getUrl();
			String expLinkTxt=expResult.getLinkTextOfUrl();
			String expStarCnt=expResult.getStartCnt();
		
			Assert.assertEquals(actUrl, expUrl);
			Assert.assertEquals(actLinkTxt, expLinkTxt);
			Assert.assertEquals(actStarCnt, expStarCnt);	
		}
				
	}
	
	@Then("^test if the user clicks on the \"([^\"]*)\" radio button nothing is displayed$")
	public void test_if_the_user_clicks_on_the_radio_button_nothing_is_displayed(String progLanguage) throws Throwable {
		ReposPerProgrammingLanguagePage rPerProgPage = new ReposPerProgrammingLanguagePage(driver);
		rPerProgPage.getRadioButton(progLanguage).click();

		int index=0;		
		List<String> actualResult=rPerProgPage.getDetailsOfRepPerProgLang();
		
		Assert.assertEquals(actualResult.size(),0);
	}
	
	
	@Then("^close the browser opened to test Validate all features of repos per programming language body$")
	public void close_the_browser_opened_to_test_Validate_all_features_of_repos_per_programming_language_body() throws Throwable {
	    unInitializeDriver();
	}


}
