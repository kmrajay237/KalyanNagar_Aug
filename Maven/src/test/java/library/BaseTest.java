package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
public class BaseTest implements Constants{
	public WebDriver driver;
	public ExtentReports extent;
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty(Chrome_Key,Chrome_Value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get(URL);
	}
	@AfterMethod
	public void closeBrowser(ITestResult r) {
		String path="./images/";
		if(r.getStatus()==2) {
			ScreenShot.getScreenShot(driver, path);
			Reporter.log("Screen Shot Taken",true);
		}
		driver.close();
	}
	
}
