package support;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxRadio {
	public CheckBoxRadio(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindAll({@FindBy(xpath="//input[@type='checkbox']"),
			@FindBy(xpath="//input[@type='radio']")})
	private List<WebElement> CR;
	public List<WebElement> CR(){
		return CR;
	}

}
