package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class SearchResultPO extends BasePage{

	public SearchResultPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[text()='Login on Twitter']")
	private WebElement twitter;
	public WebElement twitter() {
		return twitter;
	}
	
	@FindBy(xpath="//a[text()='LinkedIn: Log In or Sign Up']")
	private WebElement linkedin;
	public WebElement linkedin() {
		return linkedin;
	}
	
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement instagram;
	public WebElement instagram() {
		return instagram;
	}
	
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private WebElement facebook;
	public WebElement facebook() {
		return facebook;
	}
}
