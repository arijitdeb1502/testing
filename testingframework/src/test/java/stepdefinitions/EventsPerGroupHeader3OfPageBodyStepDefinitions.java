package stepdefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.EventsPerGroupPage;
import testingframework.Base;

public class EventsPerGroupHeader3OfPageBodyStepDefinitions extends Base {
	
	@Given("^User is on the \"([^\"]*)\" page to validate Page Body header Featues$")
	public void user_is_on_the_page_to_validate_Page_Body_header_Featues(String baseUrl) throws Throwable {
	     initializeDriver();
	     driver.get(baseUrl);
	}

	@Then("^validate that the text of the h(\\d+) element is \"([^\"]*)\"$")
	public void validate_that_the_text_of_the_h_element_is(int arg1, String expectedText) throws Throwable {
	    
		EventsPerGroupPage ePgrPage = new EventsPerGroupPage(driver);
	    Assert.assertEquals(expectedText, ePgrPage.getHeader3Elem().getText());
	    
	}

	@Then("^validate that the h element text color in hex is \"([^\"]*)\"$")
	public void validate_that_the_h_element_text_color_in_hex_is(String expHexColorCode) throws Throwable {
		EventsPerGroupPage ePgrPage = new EventsPerGroupPage(driver);
		Assert.assertEquals(getColorMapToRgba(expHexColorCode),ePgrPage.getHeader3Elem().getCssValue("color"));
	}

	@Then("^validate that the h element font size is \"([^\"]*)\"$")
	public void validate_that_the_h_element_font_size_is(String expFontSize) throws Throwable {
		EventsPerGroupPage ePgrPage = new EventsPerGroupPage(driver);
		Assert.assertEquals(expFontSize,ePgrPage.getHeader3Elem().getCssValue("font-size"));
	}

	@Then("^validate that the h elelemnt font weight is \"([^\"]*)\"$")
	public void validate_that_the_h_elelemnt_font_weight_is(String expFontWeight) throws Throwable {
		EventsPerGroupPage ePgrPage = new EventsPerGroupPage(driver);
		Assert.assertEquals(expFontWeight,ePgrPage.getHeader3Elem().getCssValue("font-weight"));
	}

	@Then("^validate that the h elelemnt font family is \"([^\"]*)\"$")
	public void validate_that_the_h_elelemnt_font_family_is(String expectedFontFamily) throws Throwable {
		EventsPerGroupPage ePgrPage = new EventsPerGroupPage(driver);
		Assert.assertEquals(expectedFontFamily,ePgrPage.getHeader3Elem().getCssValue("font-family").replace("\"", ""));
	}

	@Then("^close the browser after validating the header feature of body$")
	public void close_the_browser_after_validating_the_header_feature_of_body() throws Throwable {
	    unInitializeDriver();
	}
	

}
