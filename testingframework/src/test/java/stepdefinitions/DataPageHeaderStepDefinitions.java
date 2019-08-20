package stepdefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.Header;
import testingframework.Base;

public class DataPageHeaderStepDefinitions extends Base {
	
	@Given("^User moves on to the \"([^\"]*)\" page for validating header$")
	public void user_moves_on_to_the_page_for_validating_header(String dataPageUrl) throws Throwable {
		driver=initializeDriver();
		driver.get(dataPageUrl);
	}
	
	@Then("^validate the background-color of the header in hex is \"([^\"]*)\"$")
	public void validate_the_background_color_of_the_header_in_hex_is(String expectedHexColor) throws Throwable {
		
		Header h=new Header(driver);
		String expectedRgbaColor=getColorMapToRgba(expectedHexColor);		
		Assert.assertEquals(h.getHeaderElem().getCssValue("background-color"), expectedRgbaColor);
		
	}
	
	@Then("^validate that the \"([^\"]*)\" element contains the string \"([^\"]*)\"$")
	public void validate_that_the_element_contains_the_string(String h1Elem, String dispValue) throws Throwable {
		Header h=new Header(driver);
		Assert.assertEquals(h.getH1TagElem().getText(),dispValue);
	}

	@Then("^validate that the SPLASH class within header contains the string \"([^\"]*)\"$")
	public void validate_that_the_SPLASH_class_within_header_contains_the_string(String dispValue) throws Throwable {
		Header h=new Header(driver);
		Assert.assertEquals(h.getSplashClassElem().getText(),dispValue);
	}

	@Then("^click on the link with text \"([^\"]*)\"$")
	public void click_on_the_link_with_text(String linkText) throws Throwable {
		Header h=new Header(driver);
		h.getLinkElemInHeader(linkText).click();
	}

	@Then("^validate that it is rendered to \"([^\"]*)\" site$")
	public void validate_that_it_is_rendered_to_site(String url) throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(),url);
		driver.navigate().back();
	}
	
	@Then("^validate the subtitle element text to be \"([^\"]*)\"$")
	public void validate_the_subtitle_element_text_to_be(String expText) throws Throwable {
		Header h=new Header(driver);
		Assert.assertEquals(h.getSubTitleElem().getText(),expText);
	}
	
	
	@Then("^also validate that \"([^\"]*)\" text in subtitle is strongly tagged$")
	public void also_validate_that_text_in_subtitle_is_strongly_tagged(String textVal) throws Throwable {
		
		Header h=new Header(driver);
		Assert.assertEquals(h.getStrongTaggedSubtitle(textVal).getText(),textVal);
	
	}

	@Then("^then close the browser that was opened to validate header$")
	public void then_close_the_browser_that_was_opened_to_validate_header() throws Throwable {
		unInitializeDriver();
	}

}
