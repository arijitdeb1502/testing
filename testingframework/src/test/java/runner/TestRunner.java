package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	features = {
				"features\\dataPage",
				"features\\eventsPerGroupPage"
			   },
	glue = {"stepdefinitions"},
	tags = {"@SanityTest2"},plugin= {"pretty",
			"html:target/site/cucumber-pretty",
			"json:target/cucumber.json"},
	monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
