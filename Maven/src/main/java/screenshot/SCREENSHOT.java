package screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SCREENSHOT {
	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void Demoshots() {
		String et="Google1";
		String at=driver.getTitle();
		Assert.assertEquals(at,et);
	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser(ITestResult r) {
		String path="./src/main/resources/";
		if(r.getStatus()==2) {
			TakingScreenShot.getScreenShot(driver, path);
			Reporter.log("Screen Shot Taken",true);
		}
		driver.close();
	}

}
