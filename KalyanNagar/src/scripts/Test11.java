package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		try {
			driver.get("https://online.actitime.com/na1/login.do");
			System.out.println("Page is loaded within 8 sec");
		} catch (Exception e) {
			System.out.println("Page is not loaded within 8 sec");
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		driver.close();
	}

}
