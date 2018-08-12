package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test6 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na1/login.do");
		WebElement ele1 = driver.findElement(By.id("username"));
		ele1.sendKeys("Coursecube");
		Thread.sleep(1000);
		WebElement ele2 = driver.findElement(By.name("pwd"));
		ele1.sendKeys(Keys.CONTROL+"a");
		ele1.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		driver.close();
	}
}
