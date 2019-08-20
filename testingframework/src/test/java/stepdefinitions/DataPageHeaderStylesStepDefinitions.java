package stepdefinitions;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.Header;
import testingframework.Base;

import datamaps.StyleAttributes;


public class DataPageHeaderStylesStepDefinitions extends Base {
	
	@Given("^User moves on to the \"([^\"]*)\" page for validating header styles$")
	public void user_moves_on_to_the_page_for_validating_header_styles(String dataPageUrl) throws Throwable {
		driver=initializeDriver();
		driver.get(dataPageUrl);
	}
	
	@Then("^validate the following styleAttributes of header to be as below$")
	public void validate_the_following_styleAttributes_of_header_to_be_as_below(List<StyleAttributes> allStyles) throws Throwable {
	    
		Header h=new Header(driver); 
	    for(StyleAttributes s:allStyles) {
	    	
	    	String actualStyle=h.getHeaderElem().getCssValue(s.getStyleProperty());
	    	String expectedStyle=null;
	    	if(s.getStyleProperty().equals("background-color")) {
	    		expectedStyle=getColorMapToRgba(s.getValue());
	    	} else {
	    		expectedStyle=s.getValue();
	    	}
	    	Assert.assertEquals(expectedStyle,actualStyle);
	    }
	}
	
	@Then("^validate the following styleAttributes of h attribute of header to be as below$")
	public void validate_the_following_styleAttributes_of_h_attribute_of_header_to_be_as_below( List<StyleAttributes> allStyles) throws Throwable {
		
		Header h=new Header(driver); 
	    for(StyleAttributes s:allStyles) {
	    	
	    	String actualStyle=h.getH1TagElem().getCssValue(s.getStyleProperty());
	    	String expectedStyle=null;
	    	if(s.getStyleProperty().equals("background-color")) {
	    		expectedStyle=getColorMapToRgba(s.getValue());
	    	} else {
	    		expectedStyle=s.getValue();
	    	}
	    	Assert.assertEquals(expectedStyle,actualStyle);
	    }
	}
	
	@Then("^validate the following styleAttributes of div class SPLASH of SG DATA$")
	public void validate_the_following_styleAttributes_of_div_class_SPLASH_of_SG_DATA(List<StyleAttributes> allStyles) throws Throwable {
		Header h=new Header(driver); 
	    for(StyleAttributes s:allStyles) {
	    	
	    	String actualStyle=h.getSplashClassElem().getCssValue(s.getStyleProperty());
	    	String expectedStyle=null;
	    	if(s.getStyleProperty().contains("color")) {
	    		expectedStyle=getColorMapToRgba(s.getValue());
	    	} else {
	    		expectedStyle=s.getValue();
	    	}
	    	Assert.assertEquals(expectedStyle,actualStyle);
	    	    	
	    }
	}
	
	@Then("^validate the following styleAttributes of p class Subtitle$")
	public void validate_the_following_styleAttributes_of_p_class_Subtitle(List<StyleAttributes> allStyles) throws Throwable {
		Header h=new Header(driver); 
	    for(StyleAttributes s:allStyles) {
	    	
	    	String actualStyle=h.getSubTitleElem().getCssValue(s.getStyleProperty());
	    	String expectedStyle=null;
	    	if(s.getStyleProperty().contains("color")) {
	    		expectedStyle=getColorMapToRgba(s.getValue());
	    	} else {
	    		expectedStyle=s.getValue();
	    	}
	    	Assert.assertEquals(expectedStyle,actualStyle);
	    	    	
	    }
	}
	
	@Then("^after style validation for header is completed close the browser$")
	public void after_style_validation_for_header_is_completed_close_the_browser() throws Throwable {
		unInitializeDriver();
	}


}
