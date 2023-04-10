package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected  static WebDriver driver;
protected static Properties prop;
	public BaseClass() {
	    prop=new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\ASUS\\eclipse1\\CucumberProject\\src\\main\\java\\configLayer\\config.properties");
			 prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    
	}
	
	public static void initialization() {
	
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}

}
