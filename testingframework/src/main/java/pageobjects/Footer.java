package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {
	
	public WebDriver driver;
	
	By footerElem=By.cssSelector("footer");
	By footerLinks=By.cssSelector("a");
	By footerElemSocial=By.cssSelector("ul[class='social']");
	By footerElemParaSocial=By.cssSelector("li > p");
	
	
	public List<WebElement> getAllParaElemsFromFooterElemSocial(){
		
		WebElement footer=getFooterElemSocial();
		
		return footer.findElements(footerElemParaSocial);
		
	}
		
	public Footer(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFooterElemSocial() {
		return driver.findElement(footerElemSocial);
	}
	
	public List<WebElement> getAllLinksFromFooterElemSocial(){
		
		WebElement footer=getFooterElemSocial();
		
		return footer.findElements(footerLinks);
		
	}
	
	public WebElement getFooterElem() {
		return driver.findElement(footerElem);
	}
	
	public List<WebElement> getAllLinksFromFooter(){
		
		WebElement footer=getFooterElem();
		
		return footer.findElements(footerLinks);
		
	}
	
	

}
