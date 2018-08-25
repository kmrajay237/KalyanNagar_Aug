package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements Constants{
	public WebDriver driver;
	@Parameters("MyBrowser")
	@BeforeMethod
	public void launchBrowser(String MyBrowser) {
		if (MyBrowser.equals("chrome")) {
			System.setProperty(Chrome_Key, Chrome_Value);
			driver=new ChromeDriver();
		} else if(MyBrowser.equals("firefox")){
			System.setProperty(Gecko_Key, Gecko_Value);
			driver=new FirefoxDriver();
		}
		else if(MyBrowser.equals("edge")) {
			System.setProperty(Edge_Key,Edge_Value);
			driver=new EdgeDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
