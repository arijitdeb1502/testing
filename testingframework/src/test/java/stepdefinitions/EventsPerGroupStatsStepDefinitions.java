package stepdefinitions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import datamaps.DeveloperCategoryVsCount;
import datamaps.PageTitles;
import datamaps.TimeStamp;
import pageobjects.EventsPerGroupPage;
import testingframework.Base;

public class EventsPerGroupStatsStepDefinitions extends Base {
	
	@Given("^User is on the \"([^\"]*)\" page to validate number of event per group statistics as displayed$")
	public void user_is_on_the_page_to_validate_number_of_event_per_group_statistics_as_displayed(String baseUrl) throws Throwable {
		initializeDriver();
 	    driver.get(baseUrl);
	}
	
	@Then("^validate that all the following groups contains the mentioned memeber counts actually$")
	public void validate_that_all_the_following_groups_contains_the_mentioned_memeber_counts_actually(List<DeveloperCategoryVsCount> catVsCnt) throws Throwable {
		EventsPerGroupPage evGrpPage = new EventsPerGroupPage(driver);
		
		
		for(DeveloperCategoryVsCount val:catVsCnt) {
			String ecpectedCnt=val.getMemberCnt();
			String actualCnt=evGrpPage.getGraphBarHrefElement(val.getGrpName()).getText();
			Assert.assertEquals(actualCnt, ecpectedCnt);
		}
	}
	
	@Then("^click on all the links of active user groups to validate the windows with following page titles are opened in a separate tab$")
	public void click_on_all_the_links_of_active_user_groups_to_validate_the_windows_with_following_page_titles_are_opened_in_a_separate_tab(List<PageTitles> pageTitles) throws Throwable {
	    EventsPerGroupPage evrGrp = new EventsPerGroupPage(driver);
	    
	    for(WebElement link:evrGrp.getHrefInsideBarClassElements()) {
	    	link.click();
	    }
	    
	    Set<String> allWindows=driver.getWindowHandles();
	    Iterator<String> it=allWindows.iterator();
	    
	    int index=0;
	    while(it.hasNext()) {
	    	
	    	driver.switchTo().window(it.next());
	    	
	    	String actualTitle=driver.getTitle();
	    	String expectedTitle=pageTitles.get(index++).getPageTitle();
	    	
	    	Assert.assertEquals(actualTitle, expectedTitle);
	    	
	    }
	}
	
	
	@Then("^mouse over to each of the active user group link$")
	public void mouse_over_to_each_of_the_active_user_group_link(List<TimeStamp> expUpdatedTs) throws Throwable {
		EventsPerGroupPage evrGrp = new EventsPerGroupPage(driver);
		Actions action=new Actions(driver);
		int index=0;
		for(WebElement target:evrGrp.graphLabelElements()) {
			
			action.moveToElement(target).build().perform();
			String actualUpdatedTs=evrGrp.getHoverInsideBarClassElements().get(index).getText();
			String expectedUpdatedTs=expUpdatedTs.get(index++).getUpdatedTimeStamp();
			Assert.assertEquals(actualUpdatedTs, expectedUpdatedTs);

		}
	}
	
	@Then("^close the browser openned to validate number of event per group statistics$")
	public void close_the_browser_openned_to_validate_number_of_event_per_group_statistics() throws Throwable {
		unInitializeDriver();
	}

}
