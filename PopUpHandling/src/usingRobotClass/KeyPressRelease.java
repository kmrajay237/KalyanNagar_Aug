package usingRobotClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeyPressRelease {
	@Test
	public void pressRelease() throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		Robot robot=new Robot();
		for (int i = 0; i < 10; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.delay(1000);
		}
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

}
