package scripts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class Test2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/na1/login.do");
		driver.findElement(By.id("username")).sendKeys("lochiajay");
		driver.findElement(By.name("pwd")).sendKeys("zxcv1234");
		driver.findElement(By.id("loginButton")).click();
		Wait wait=new FluentWait(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(Exception.class);
		String title1="actiTIME - Enter Time-Track";
		wait.until(ExpectedConditions.titleContains(title1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
