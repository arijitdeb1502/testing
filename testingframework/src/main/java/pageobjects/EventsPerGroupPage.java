package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventsPerGroupPage {
	
	public WebDriver driver;
	
	By h3Element = By.cssSelector("h3");
	By divBarElements = By.cssSelector("div[class='bar']");
	By graphBarElements = By.cssSelector("div[class='graph-bar']");
	By hrefInsideBarClassElements = By.cssSelector("a[href*='meetup']");
	By hoverInsideBarClassElements = By.cssSelector("div[class='graph-hover']");
	By graphLabelElements = By.cssSelector("div[class='graph-label']");
	By achorTagElem = By.cssSelector("a");
	
	
	public EventsPerGroupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> graphLabelElements() {
		return driver.findElements(graphLabelElements);
	}
	
	public WebElement getHeader3Elem() {
		return driver.findElement(h3Element);
	}
	
	public List<WebElement> getHrefInsideBarClassElements() {
		return driver.findElements(hrefInsideBarClassElements);
	}
	
	public List<WebElement> getHoverInsideBarClassElements() {
		return driver.findElements(hoverInsideBarClassElements);
	}
	
	public List<WebElement> graphBarElements() {
		return driver.findElements(graphBarElements);
	}
	
	public WebElement getGraphLevelHrefElement(String linkText) {

		List<WebElement> graphLevelHrefList=new ArrayList<WebElement>();
		graphLevelHrefList=getHrefInsideBarClassElements();
		WebElement retHref = null;
		
		for (WebElement hrefElem:graphLevelHrefList) {
			if(hrefElem.getText().contains(linkText)) {
				retHref=hrefElem;
				break;
			}
		}
		
		return retHref;
	
	}
	
	
	public WebElement getGraphBarHrefElement(String linkText) {

		List<WebElement> graphLevelHrefList=new ArrayList<WebElement>();
		graphLevelHrefList=driver.findElements(divBarElements);
		WebElement retLabel = null;
		
		for (WebElement divBar:graphLevelHrefList) {
			if(divBar.findElement(graphLabelElements).findElement(achorTagElem).getText().contains(linkText)) {
				retLabel=divBar.findElement(graphBarElements);
				break;
			}
		}
		
		return retLabel;
	}
	

}
