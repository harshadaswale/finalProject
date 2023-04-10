package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.SearchPage;


public class SearchPageTest extends BaseClass{
	 SearchPage search;

@Given("user is on google Home Page")
public void user_is_on_google_home_page()  {
	super.initialization();
	search=new SearchPage();

	System.out.println(search.getTitle());
    
}
@When("user enter {string}")
public void user_enter(String string) {
	
	search.enterSearchValue(string);
    
}
@When("click on SearchButton")
public void click_on_search_button() {

	search.clickButton();
}

@Then("result should display")
public void result_should_display() {
   Assert.assertEquals("mobile - Google Search", driver.getTitle());
}


@Then("result should display for {string} is {string}")
public void result_should_display_for_is(String key, String value) {
   if(key.equals("mobile")) {
	   Assert.assertEquals(value, driver.getTitle());
   }
   else if(key.equals("Refrigerator")) {
	   Assert.assertEquals(value, driver.getTitle());
   }
}

}
