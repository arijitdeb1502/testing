package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.DataPage;
import testingframework.Base;

public class DataPageDatasetUpdateStatisticsDefinitions extends Base{
	
	
	@Given("^User is on the \"([^\"]*)\" page$")
	public void user_is_on_the_page_to_validate_the_following_step(String dataPageUrl) throws Throwable {
		driver=initializeDriver();
  		driver.get(dataPageUrl);
	}
	
	@Then("^validate the \"([^\"]*)\" count for \"([^\"]*)\" is \"([^\"]*)\"$")
	public void validate_the_count_for_is(String action, String year, String counts) throws Throwable {
		DataPage d=new DataPage(driver);
		Assert.assertEquals(d.getParaElem(action, year).getText(),counts);
	}
	
	
	@Then("^validate the style of box element is \"([^\"]*)\"$")
	public void validate_the_style_of_box_element_is(String style) throws Throwable {
		
		DataPage d=new DataPage(driver);
		List<String> expectedStyles=new ArrayList<String>();

		for(String s:d.getAllBoxesStyle()) {
			expectedStyles.add(style);
		}
		
		Assert.assertEquals(expectedStyles, d.getAllBoxesStyle());
	}
	
	@Then("^validate the text inside statistics details of \"([^\"]*)\" for \"([^\"]*)\" is like \"([^\"]*)\"$")
	public void validate_the_text_inside_statistics_details_of_for_is_like(String action, String year, String textVal) throws Throwable {
		
		DataPage d=new DataPage(driver);
		String actualText=d.getTextStatisticsElement(action, year).getText();
		String expectedText=textVal+" "+year;		
		Assert.assertEquals(expectedText,actualText);
		
	}

	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   
		unInitializeDriver();
	
	}


}
