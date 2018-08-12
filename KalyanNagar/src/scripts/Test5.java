package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test5 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na1/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys("Coursecube");
		String str = ele.getAttribute("placeholder");
		int count = str.length()+1;
		for (int i = 0; i <=count; i++) {
			Thread.sleep(1000);
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(3000);
		driver.close();
	}
}
