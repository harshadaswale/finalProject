package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass{
	public HandleFrame() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void frameByIndex(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
	public static void frameByName(String frameName) {
		driver.switchTo().frame(frameName);
	}
	public static void frameById(String id) {
		driver.switchTo().frame(id);
	}

	public static void frameByIndex(WebElement wb) {
		driver.switchTo().frame(wb);
	}
}
