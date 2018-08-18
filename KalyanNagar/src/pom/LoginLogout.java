package pom;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginLogout {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/na1/login.do");
		ActiTimeLoginPagePO lpo=new ActiTimeLoginPagePO(driver);
		/*lpo.setUsername("lochiajay");
		lpo.setPassword("zxcv1234");
		lpo.clickOnLogin();*/
		lpo.login("lochiajay","zxcv1234");
		Thread.sleep(3000);
		ActiTimeHomePagePO hpo=new ActiTimeHomePagePO(driver);
		hpo.ClickOnlogout();
		Thread.sleep(3000);
		driver.close();
	}
}
