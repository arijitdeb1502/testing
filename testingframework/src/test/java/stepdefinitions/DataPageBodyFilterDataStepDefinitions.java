package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.DataPage;
import testingframework.Base;

public class DataPageBodyFilterDataStepDefinitions extends Base {
	
	@Given("^User moves on to the \"([^\"]*)\" page for validating input search filter data$")
	public void user_moves_on_to_the_page_for_validating_input_search_filter_data(String dataPageUrl) throws Throwable {
		driver=initializeDriver();
		driver.get(dataPageUrl);
	}

	@When("^the user texts the following search as \"([^\"]*)\"$")
	public void the_user_texts_the_following_search_as(String searchText) throws Throwable {
	    DataPage d=new DataPage(driver);
	    d.getSearchDataInput().sendKeys(searchText);
	}

	@Then("^validate that data-index filteres by the \"([^\"]*)\" will be displayed$")
	public void validate_that_data_index_filteres_by_the_will_be_displayed(String searchText) throws Throwable {
		
		DataPage d=new DataPage(driver);
		int index=0;
		for(WebElement elem:d.getAllFilteredDataExpected(searchText)) {
			Assert.assertEquals(elem,d.getAllFilteredDataActual().get(index++));
		}
		
	}

	@Then("^close the browser which was opened for validating input search filter data$")
	public void close_the_browser_which_was_opened_for_validating_input_search_filter_data() throws Throwable {

		unInitializeDriver();
	
	}

	

}
