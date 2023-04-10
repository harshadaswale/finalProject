package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {
	
	public HandleDropDown() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void SelectDDOption(WebElement wb,String option) {
		new Select(wb).selectByVisibleText(option);
	}
	public static String CaptureSelectedOption(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}
	public static List<WebElement> getAllOption(WebElement wb){
		return new Select(wb).getOptions();
	}
	public static boolean checkValuePresent(WebElement wb,String value) {
		List<WebElement>ls= new Select(wb).getOptions();
		 for(WebElement i:ls) {
			 if(i.getText().equalsIgnoreCase(value)) {
				 return true;
				 
			 }
		 }
		 return false;
	}

}
