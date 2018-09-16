package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class FacebookTestUsingSikuli {
	@Test
	public void Facebook() throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Screen screen=new Screen();
		
		Pattern email=new Pattern("./images/facebookEmail.PNG");
		screen.type(email,"zxcv1234");
		
		Pattern password=new Pattern("./images/facebookPassword.PNG");
		screen.type(password,"zxcv1234");
		
		Pattern login=new Pattern("./images/facebookLogin.PNG");
		screen.click(login);
		
		driver.close();
	}

}
