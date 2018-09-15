package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowBasedPopUp {
	@Test
	public void WindowPopUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/fileUploading.html");
		driver.findElement(By.id("a")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\AutoItScript.exe");
	}
}
