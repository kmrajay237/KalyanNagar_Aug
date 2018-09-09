package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestMultipleCredentials {
	public WebDriver driver;

	@Given("^Open browser and Navigate to app$")
	public void open_browser_and_Navigate_to_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
	}

	@When("^provide \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_provide_and(String user, String pass) throws Throwable {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(user);
		WebElement pass1 = driver.findElement(By.id("pass"));
		pass1.sendKeys(pass);
	}

	@When("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() throws Throwable {
		Thread.sleep(3000);
	    driver.close();
	}

}
