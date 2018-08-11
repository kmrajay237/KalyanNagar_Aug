package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na1/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys("Coursecube");
		Thread.sleep(3000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);
		//ele.clear();
		//String text = ele.getAttribute("placeholder");
		//System.out.println(text);
		Thread.sleep(3000);
		driver.close();
	}

}
