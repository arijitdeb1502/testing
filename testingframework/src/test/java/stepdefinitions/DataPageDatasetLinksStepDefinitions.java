package stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.DataPage;
import testingframework.Base;

public class DataPageDatasetLinksStepDefinitions extends Base{
	
	@Given("^User is on the \"([^\"]*)\" page to validate the links$")
	public void user_is_on_the_page_to_validate_the_links(String dataPageUrl) throws Throwable {
		driver=initializeDriver();
		driver.get(dataPageUrl);
	}

	@When("^User clicks on the \"([^\"]*)\" link$")
	public void user_clicks_on_the_link(String dataLink) throws Throwable {
		DataPage d=new DataPage(driver);
		d.getDataSetLink(dataLink).click();
	}

	@Then("^validate that the User is navigated to \"([^\"]*)\" page$")
	public void validate_that_the_User_is_navigated_to_page(String url) throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(),url);
	}

	@Then("^validate that the title of that page is \"([^\"]*)\"$")
	public void validate_that_the_title_of_that_page_is(String title) throws Throwable {
		Assert.assertEquals(driver.getTitle(),title);
		driver.close();
	}

}
