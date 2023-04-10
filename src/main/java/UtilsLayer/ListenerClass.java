package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerClass extends ExtentReport implements ITestListener {
	ExtentTest extenttest;
	public void onStart(ITestContext context) {
		super.extentSetup();
		}


	public void onTestStart(ITestResult result) {
		extenttest=extentreports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, result.getMethod().getMethodName());
		String a=UtilsClass.captureScreenshot("PassScreenshot", result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(a);
	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, result.getMethod().getMethodName());
		String a=UtilsClass.captureScreenshot("FailScreenshot", result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(a);
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, result.getMethod().getMethodName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	public void onFinish(ITestContext context) {
		extentreports.flush();
	}

	
	
	
	

}
