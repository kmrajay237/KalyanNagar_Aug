package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestParameter {
	public WebDriver driver;
	@Given("^launch browser and Navigate to app$")
	public void launch_browser_and_Navigate_to_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.facebook.com/");
	}

	@When("^I provide \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_provide_and(String username, String password) throws Throwable {
		WebElement email = driver.findElement(By.id("email"));
		   email.sendKeys(username);
		   WebElement pass = driver.findElement(By.id("pass"));
		   pass.sendKeys(password);
	}

	@Then("^Click on Login$")
	public void click_on_Login() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		 Thread.sleep(3000);
		    driver.close();
	}



}
