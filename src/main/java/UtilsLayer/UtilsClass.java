package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	
	
	public static void enterValue(WebElement wb,String value) {
		if(wb.isDisplayed()&&wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}
	
	public static void clickButton(WebElement wb) {
		if(wb.isDisplayed()&&wb.isEnabled()) {
			wb.click();
		}
	}
	
	
	public static String captureScreenshot(String folderName,String fileName) {
		TakesScreenshot ts=(TakesScreenshot)driver;	
       File src=ts.getScreenshotAs(OutputType.FILE);
       String date=new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
       String path=System.getProperty("user.dir")+"//"+folderName+"//"+fileName+date+".png";
       File dist=new File(path);
       try {
		FileUtils.copyFile(src,dist);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       return path;
}
}