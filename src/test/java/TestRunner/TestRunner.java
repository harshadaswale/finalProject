package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"AllFeature/Google.feature"},
glue={"StepDefination"},
dryRun=false,
plugin = {"pretty", "html:target/cucumber-reports.html"},
tags= "@mobile")
public class TestRunner {
	
	
	 
	

}
