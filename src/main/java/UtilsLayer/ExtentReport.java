package UtilsLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	protected static ExtentReports extentreports;
	public static void extentSetup() {
		ExtentSparkReporter extentsparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//"+System.currentTimeMillis()+".html");
		 extentreports=new ExtentReports();
	     extentreports.attachReporter(extentsparkreporter);
	     
	}
}
