package javaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TYPING {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.get("https://online.actitime.com/na1/login.do");
		
		WebElement user = driver.findElement(By.id("username"));
		String str1="arguments[0].value='"+"lochiajay"+"'";
		Thread.sleep(4000);
		jse.executeScript(str1,user);
		
		WebElement pass = driver.findElement(By.name("pwd"));
		String str2="arguments[0].value='"+"zxcv1234"+"'";
		Thread.sleep(4000);
		jse.executeScript(str2,pass);
		
		WebElement login = driver.findElement(By.id("loginButton"));
		String str3="arguments[0].click();";
		Thread.sleep(4000);
		jse.executeScript(str3,login);
		Thread.sleep(4000);
		driver.close();
	}

}
