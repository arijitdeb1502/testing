package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreFooterOther {
	
	public WebDriver driver;
	By infoClassElement=By.cssSelector("p[class='info']");
	By infoClassAchorTagElements=By.cssSelector("a[href*='github']");
	By explainClassElements=By.cssSelector("div[class='container'] > div[class='explain']");
	By paraElements=By.cssSelector("div[class='info']");
	By paraElem=By.cssSelector("p");
	By unOrderedListItems=By.cssSelector("ul");
	By anchorElem=By.cssSelector("a");
	
	public PreFooterOther(WebDriver driver) {
		this.driver = driver;
	}
	
//	public List<WebElement> getAnchorELementsFromPreFooter(){
//		
//		List<WebElement> aElements=new ArrayList<WebElement>();
//		List<WebElement> lists=getContainerClassElements();
//		
//		
//		for (WebElement elem:lists) {
//		
//			aElements.add(elem.findElement(anchorElem));	
//			
//		}
//		
//		return aElements;
//	}
	
	public List<WebElement> getExplainClassParaLements(){
		
		List<WebElement> paraElements=new ArrayList<WebElement>();
		
		for (WebElement elem:getExplainClassElements()) {
		
			paraElements.add(elem.findElement(paraElem));	
			
		}
		
		return paraElements;
	}
	
	
	public List<WebElement> getExplainClassUlLements(){
		
		List<WebElement> ulElements=new ArrayList<WebElement>();
		
		for (WebElement elem:getExplainClassElements()) {
		
			ulElements.add(elem.findElement(unOrderedListItems));	
			
		}
		
		return ulElements;
	}
	
	
	public WebElement getInfoClassElem() {
		return driver.findElement(infoClassElement);
	}
	
	public List<WebElement> getExplainClassElements(){
		
		return driver.findElements(explainClassElements);
		
	}
	
	
	public List<WebElement> getInfoClassAchorTagElements(){
		
		return getInfoClassElem().findElements(infoClassAchorTagElements);
		
	}
	
}
