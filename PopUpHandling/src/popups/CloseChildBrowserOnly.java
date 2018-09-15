package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseChildBrowserOnly {
	@Test
	public void CloseChild() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentTitle = driver.getTitle();
		Set<String> allWin = driver.getWindowHandles();
		int count = allWin.size();
		System.out.println("Number of Browsers:="+count);
		for (String string : allWin) {
			driver.switchTo().window(string);
			String childTitle = driver.getTitle();
			if (parentTitle.equals(childTitle)) {
				System.out.println("ParentWindow:"+parentTitle);
			} else {
				System.out.println("ClosedWindow:"+childTitle);
				driver.close();
			}
		}
	}
}
