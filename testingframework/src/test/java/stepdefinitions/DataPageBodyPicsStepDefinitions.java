package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.DataPage;
import testingframework.Base;
import datamaps.DataPagePics;

public class DataPageBodyPicsStepDefinitions extends Base {
	
	@Given("^User moves on to the \"([^\"]*)\" page for validating body pictures$")
	public void user_moves_on_to_the_page_for_validating_body_pictures(String dataPageUrl) throws Throwable {
		driver=initializeDriver();
		driver.get(dataPageUrl);
	}
	
	
	@Then("^validate the following pictures$")
	public void validate_the_following_pictures(List<DataPagePics> picMappers) throws Throwable {
		
		DataPage d=new DataPage(driver);
		
		for(DataPagePics dp:picMappers) {
		
			Assert.assertEquals(d.getAllPicturePaths(dp.getTextVal()).get(0).getAttribute("d"),dp.getPicCode());
			
		}
		
	}
	
	@Then("^close the browser which was opened for validating body pictures$")
	public void close_the_browser_which_was_opened_for_validating_body_pictures() throws Throwable {
	    unInitializeDriver();
	}


}
