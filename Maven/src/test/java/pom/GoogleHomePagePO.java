package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;
public class GoogleHomePagePO extends BasePage{
	public GoogleHomePagePO(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="q")
	private WebElement searchBox;
	public WebElement searchBox() {
		return searchBox;
	}

}
