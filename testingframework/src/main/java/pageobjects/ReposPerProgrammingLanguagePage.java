package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReposPerProgrammingLanguagePage {
	
	WebDriver driver;
	
	By pageHeaderElement=By.cssSelector("h3");
	By allRadioButtonElements=By.cssSelector("input[type='radio']");
	By allRadioLabelElements=By.cssSelector("label[id*='language']");
	By divElemOfReposPerProgLanguage=By.cssSelector("div[id='repos-per-programming-language'] > p");
	By allAnchorElem=By.tagName("a");
	
	public ReposPerProgrammingLanguagePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public List<WebElement> getAllAnchorElementsOfRepPerProg() {
		return driver.findElements(divElemOfReposPerProgLanguage);
	}
	
	public List<String> getDetailsOfRepPerProgLang(){
		
		List<String> actualResult=new ArrayList<String>();
		
		for(WebElement elem:getAllAnchorElementsOfRepPerProg()) {
			String tmp=elem.findElement(allAnchorElem).getAttribute("href")+" "+elem.getText();
			actualResult.add(tmp);
		}
		
		return actualResult;
	}
	
	public WebElement getPageHeaderElement() {
		return driver.findElement(pageHeaderElement);
	}
	
	public List<WebElement> getAllRadioButtonElements(){
		return driver.findElements(allRadioButtonElements);
	}
	
	public List<WebElement> getAllRadioLabelElements(){
		return driver.findElements(allRadioLabelElements);
	}
	
	public WebElement getRadioButton(String dispText) {
		
		WebElement radioButtonElem=null;
		
		for(WebElement rButton:getAllRadioLabelElements()) {
			if(rButton.getText().toLowerCase().contains(dispText.toLowerCase())) {
				radioButtonElem=rButton;
				break;
			}
		}
		
		return radioButtonElem;
		
	}

}
