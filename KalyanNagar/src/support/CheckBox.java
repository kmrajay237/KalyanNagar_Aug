package support;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {
	public CheckBox(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> checkbox;
	public List<WebElement> checkbox() {
		return checkbox;
	}

}
