package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na1/login.do");
		driver.findElement(By.id("username")).sendKeys("lochiajay");
		driver.findElement(By.name("pwd")).sendKeys("zxcv1234");
		driver.findElement(By.id("loginButton")).click();
		
		while(true) {
			try {
				WebElement logout = driver.findElement(By.id("logoutLink"));
				String title = driver.getTitle();
				System.out.println(title);
				logout.click();
				break;
			} catch (Exception e) {
				System.out.println("Bye!!!");
			}
		}
		driver.close();
	}

}
