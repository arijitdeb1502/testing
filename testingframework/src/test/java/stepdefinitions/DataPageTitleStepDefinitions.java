package stepdefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingframework.Base;

public class DataPageTitleStepDefinitions extends Base{
	
	@Given("^User is present on the \"([^\"]*)\" page$")
	public void user_is_on_the_page(String dataPageUrl) throws Throwable {
		
		driver=initializeDriver();
		driver.get(dataPageUrl);
		
	}

	@Then("^validate the title of current page is \"([^\"]*)\"$")
	public void validate_the_title_of_current_page_is(String expectedTitle) throws Throwable {
		
		String actualTitle=driver.getTitle();		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		unInitializeDriver();
	
	}
	
	

}
