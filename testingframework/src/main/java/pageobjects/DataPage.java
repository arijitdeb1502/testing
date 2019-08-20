package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataPage {
	
	public WebDriver driver;
	
	By allDataSetLinks=By.cssSelector("a[href*='dataset']");
	By allParaElemOfAllStats=By.cssSelector("p[id*='total']");
	By allBoxElementsStyle=By.cssSelector("ul[class='boxes'] > li[style*=background]");
	By allClassSm=By.cssSelector("p[class='sm']");
	By dispPicture=By.cssSelector("span > svg > path");
	By searchDataInput=By.cssSelector("input[id='search']");
	By allDataIndexedForSearch=By.cssSelector("li[class='searchable']");

	
	public DataPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> getAllFilteredDataExpected(String searchTxt){
		
		List<WebElement> filteredElements=new ArrayList<WebElement>();
		
		for(WebElement elem:driver.findElements(allDataIndexedForSearch)) {
			
			if(elem.getAttribute("data-index").contains(searchTxt)) {
		
				filteredElements.add(elem);
			}
			
		}
		
		return filteredElements;
		
	}
	
	
	public List<WebElement> getAllFilteredDataActual(){
				
		List<WebElement> actualFilteredData=new ArrayList<WebElement>();
		
		for(WebElement elem:driver.findElements(allDataIndexedForSearch)) {
 			if(!elem.getText().equals("")) {
 				actualFilteredData.add(elem);
 			}
		}
		
		return actualFilteredData;

	}
	
	
	public WebElement getSearchDataInput(){
		return driver.findElement(searchDataInput);
	}

	public List<WebElement> getAllPicturePaths(String hrefText){
		
		WebElement hrefElem=getDataSetLink(hrefText);
		return hrefElem.findElements(dispPicture);

	}
	
	private List<WebElement> getAllSmClass() {
		
		return driver.findElements(allClassSm);
		
	}

	public WebElement getTextStatisticsElement(String action,String year) {

		WebElement paraEl=null;
		
		for (WebElement p:getAllSmClass()) {
			if(p.getText().contains(year)&&p.getText().contains(action)) {
				paraEl=p;
				break;
			}
			
		}
		
		return paraEl;
		
	}
	
	private List<WebElement> getAllBoxes(){
		return driver.findElements(allBoxElementsStyle);
	}
	
	public List<String> getAllBoxesStyle(){
		
		List<String> styles=new ArrayList<String>();
		
		for(WebElement box:getAllBoxes()) {
			styles.add(box.getAttribute("style"));
		}
		
		return styles;
		
	}
	
	private List<WebElement> getAllDataSetLinks() {
		return driver.findElements(allDataSetLinks);
	}
	
	public WebElement getDataSetLink(String linkText) {
		
		WebElement linkEl=null;
		
		for (WebElement l:getAllDataSetLinks()) {
			
			if(l.getText().equals(linkText)) {
				linkEl=l;
				break;
			}
			
		}
		
		return linkEl;
		
	}
	
	private List<WebElement> getAllParaElemOfAllStats(){
		return driver.findElements(allParaElemOfAllStats);
	}
	
	public WebElement getParaElem(String action,String year) {
		
		WebElement paraEl=null;
		
		for (WebElement p:getAllParaElemOfAllStats()) {
			
			if(p.getAttribute("id").contains(year)&&p.getAttribute("id").contains(action)) {
				paraEl=p;
				break;
			}
			
		}
		
		return paraEl;
		
	}
	
	
}
