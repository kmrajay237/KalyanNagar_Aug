package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void testcase() throws Exception {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Admin/Desktop/COn123.html");
			CheckBox c=new CheckBox(driver);
			int count = c.checkbox().size();
			System.out.println("Count:="+count);
			for (int i = 0; i < count; i++) {
				c.checkbox().get(i).click();
				Thread.sleep(2000);
			}
			driver.close();
	}

}
