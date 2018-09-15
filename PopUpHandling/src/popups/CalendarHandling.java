package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarHandling {
	@Test
	public void CalendarPopUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("BE_flight_origin_date")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("19/09/2018")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
