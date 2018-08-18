package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ActiTimeHomePagePO {
	private WebElement logoutLink;
	public ActiTimeHomePagePO(WebDriver driver) {
		logoutLink=driver.findElement(By.id("logoutLink"));
	}
	public void ClickOnlogout() {
		logoutLink.click();
	}
}
