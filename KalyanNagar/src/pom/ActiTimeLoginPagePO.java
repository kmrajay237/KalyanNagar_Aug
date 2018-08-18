package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ActiTimeLoginPagePO {
	WebDriver driver;
	private WebElement username;
	private WebElement password;
	private WebElement loginButton;
	public ActiTimeLoginPagePO(WebDriver driver) {
		 username = driver.findElement(By.id("username"));
		 password = driver.findElement(By.name("pwd"));
		 loginButton = driver.findElement(By.id("loginButton"));
	}
	/*public void setUsername(String name) {
		username.sendKeys(name);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		loginButton.click();
	}*/
	public void login(String name,String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
		loginButton.click();
	}
}
