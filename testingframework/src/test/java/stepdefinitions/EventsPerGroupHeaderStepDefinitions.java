package stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import pageobjects.Header;
import testingframework.Base;
import datamaps.HeaderLinkVsUrlMap;

public class EventsPerGroupHeaderStepDefinitions extends Base  {
	
	
	@Then("^all the links of header will contain the the following link texts$")
	public void all_the_links_of_header_will_contain_the_the_following_link_texts(List<HeaderLinkVsUrlMap> expectedMaps) throws Throwable {
		Header h=new Header(driver);
	    int index=0;
	    
	    for (WebElement link:h.getAllSocialLinksInHeader()) {
	    	Assert.assertEquals(link.getText().trim(),expectedMaps.get(index).getLinkText());
	    	Assert.assertEquals(link.getAttribute("href"), expectedMaps.get(index++).getUrl());
	    }
	}


}
