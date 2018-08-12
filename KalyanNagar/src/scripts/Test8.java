package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na1/login.do");
		WebElement ele1 = driver.findElement(By.id("username"));
		Dimension s = ele1.getSize();
		int h = s.getHeight();
		int w = s.getWidth();
		System.out.println("Height="+h);
		System.out.println("Width="+w);
		driver.close();

	}

}
