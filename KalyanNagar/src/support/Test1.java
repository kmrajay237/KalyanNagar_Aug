package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testcase() throws Exception {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Admin/Desktop/COn123.html");
			SupportDemo demo = new SupportDemo(driver);
			demo.textbox().sendKeys("type");
			Thread.sleep(3000);
			driver.close();
	}

}
