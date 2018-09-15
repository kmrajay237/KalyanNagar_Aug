package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NumberOfAllBrowsers {
	@Test
	public void AllBrowsers() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWin = driver.getWindowHandles();
		int count = allWin.size();
		System.out.println("Number of Browsers:="+count);
		for (String string : allWin) {
			driver.switchTo().window(string);
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.quit();
	}

}
