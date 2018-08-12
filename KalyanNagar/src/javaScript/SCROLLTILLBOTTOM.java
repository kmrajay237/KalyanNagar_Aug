package javaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLLTILLBOTTOM {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.get("file:///C:/Users/Admin/Desktop/COn123.html");
		Thread.sleep(3000);
		String str="window.scrollTo(0,document.body.scrollHeight)";
		jse.executeScript(str);
		Thread.sleep(3000);
		driver.close();
	}

}
