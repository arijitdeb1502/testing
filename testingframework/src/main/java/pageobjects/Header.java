package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
	
	public WebDriver driver;
	
	By headerElem=By.cssSelector("header");
	By h1TagElem=By.cssSelector("header > div > h1");
	By splashClassElem=By.cssSelector("header > div > div");
	By hrefElements=By.cssSelector("a[href*='webuild']");
	By subTitleElem=By.cssSelector("p[class='subtitle']");
	By subTitleStrongTaggedElem=By.cssSelector("p[class='subtitle'] > strong");
	By listSocialClassAllLinks=By.cssSelector("ul[class='list-social']");
	By linkElem=By.cssSelector("a");
	
	
	public Header(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> getAllSocialLinksInHeader(){
		WebElement listSocialClass=driver.findElement(listSocialClassAllLinks);
		return listSocialClass.findElements(linkElem);
	}
	
	public WebElement getHeaderElem() {
		return driver.findElement(headerElem);
	}
	
	public WebElement getSplashClassElem() {
		return driver.findElement(splashClassElem);
	}
	
	public WebElement getH1TagElem() {
		return driver.findElement(h1TagElem);
	}
	
	public WebElement getLinkElemInHeader(String linkText) {
		
		List<WebElement> links=driver.findElements(hrefElements);
		WebElement retLink=null;
		
		for (WebElement link:links) {
			
			if(link.getText().contains(linkText)) {
				retLink=link;
				break;
			}
			
		}
		
		return retLink;
		
	}
	
	public WebElement getSubTitleElem() {
		return driver.findElement(subTitleElem);
	}
	
	public WebElement getStrongTaggedSubtitle(String textVal) {
		
		List<WebElement> strongTaggedSubtitles=driver.findElements(subTitleStrongTaggedElem);
		WebElement retSubTitle=null;
		
		for (WebElement strongTaggedSubtitle:strongTaggedSubtitles) {
			
			if(strongTaggedSubtitle.getText().equals(textVal)) {
				retSubTitle=strongTaggedSubtitle;
				break;
			}
			
		}
		
		return retSubTitle;
		
	}
	
	
}
