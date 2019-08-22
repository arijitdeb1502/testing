package testingframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {
	
	public static WebDriver driver=null;
	
	public static WebDriver initializeDriver() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("src//main//resources//AutomationConfiguration.properties");
		
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		String chromeDriverLocation=prop.getProperty("chromeDriverLocation");
		
		if(browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
			driver=new ChromeDriver();
			
		}else if(browserName.equals("Firefox")) {
			
			System.out.println("Write code for loading firefox driver");
			
		}else if(browserName.equals("IE")) {
			
			System.out.println("Write code for loading IE driver");
		
		}
		
		String timeOutForEachTestInSec=prop.getProperty("timeOutForEachTestInSec");
		Long timeOutForEachTest=Long.parseLong(timeOutForEachTestInSec);
		driver.manage().timeouts().implicitlyWait(timeOutForEachTest, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static String getColorMapToRgba(String colorHex) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("src//main//resources//ColorHexToRgba.properties");
		String colorRgba=null;
		
		prop.load(fis);
		if(colorHex.contains("rgb")) {
			colorRgba=colorHex;	
		}else {
			colorRgba=prop.getProperty(colorHex);
		}
		
		
		return colorRgba;
		
		
	}
	
	public static boolean isClickable(WebElement webe)      
	{
	    try
	    {
	        WebDriverWait wait = new WebDriverWait(driver, 5);
	        wait.until(ExpectedConditions.elementToBeClickable(webe));
	        return true;
	    }
	    catch (Exception e)
	    {
	        return false;
	    }
	}
	
	public static void unInitializeDriver() {
		
		driver.close();
		driver.quit();
		
	}

}
