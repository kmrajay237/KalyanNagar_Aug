package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	public WebDriver driver;
	@Given("^Launch browser and Navigate to app$")
	public void launch_browser_and_Navigate_to_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.facebook.com/");
	}

	@When("^I provide valid user name and password$")
	public void i_provide_valid_user_name_and_password() throws Throwable {
	   WebElement email = driver.findElement(By.id("email"));
	   email.sendKeys("zxcv1234");
	   WebElement pass = driver.findElement(By.id("pass"));
	   pass.sendKeys("zxcv1234");
	}

	@Then("^Login Should be succesful$")
	public void login_Should_be_succesful() throws Throwable {
	    driver.findElement(By.id("loginbutton")).click();
	    Thread.sleep(3000);
	    driver.close();
	}


}
