package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na1/login.do");
		WebElement ele1 = driver.findElement(By.cssSelector("td#logoContainer>div>img"));
		boolean v = ele1.isDisplayed();
		System.out.println(v);
		WebElement login = driver.findElement(By.id("loginButton"));
		boolean bool = login.isEnabled();
		System.out.println(bool);
		driver.manage().deleteAllCookies();
		driver.close();

	}

}
