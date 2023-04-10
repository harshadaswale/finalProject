package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

import UtilsLayer.UtilsClass;
public class SearchPage extends BaseClass {
	
	@FindBy(name="q")
	WebElement searchbox;
	@FindBy(xpath="(//input[@name='btnK'])[2]")
	WebElement button;
	@FindBy(xpath="(//input[@name='btnK'])[1]")
	WebElement button1;
	
	public SearchPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		
		return driver.getTitle();
	}

	public void enterSearchValue(String text) {
		UtilsClass.enterValue(searchbox, text);
	}

	public void clickButton() {
		try {
			UtilsClass.clickButton(button);
		}
		catch(Exception e){
			UtilsClass.clickButton(button1);
		}
	}
	
	
	

}
