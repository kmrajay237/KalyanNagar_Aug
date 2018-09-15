package usingActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void MoveMousePointer() throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Actions action=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Recruiters']"));
		action.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Recruiter Connection']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
