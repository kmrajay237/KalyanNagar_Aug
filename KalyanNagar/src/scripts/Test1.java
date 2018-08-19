package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);*/
		driver.get("https://online.actitime.com/na1/login.do");
		driver.findElement(By.id("username")).sendKeys("lochiajay");
		driver.findElement(By.name("pwd")).sendKeys("zxcv1234");
		driver.findElement(By.id("loginButton")).click();
		//WebElement logout = driver.findElement(By.id("logoutLink"));
		/*String title1="actiTIME - Enter Time-Track";
		wait.until(ExpectedConditions.titleContains(title1));*/
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
