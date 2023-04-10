package TestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"AllFeature/Google1.feature"},
glue={"StepDefination"},
dryRun=false)
public class TestRunner2 {

}
