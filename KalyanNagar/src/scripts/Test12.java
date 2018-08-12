package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na1/login.do");
		WebElement ele1 = driver.findElement(By.id("username"));
		String var = ele1.getCssValue("font-size");
		System.out.println(var);
		String var2 = ele1.getCssValue("color");
		System.out.println(var2);
		driver.close();
	}
}
