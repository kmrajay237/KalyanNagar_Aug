package usingRobotClass;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MoveMousePointer {
	@Test
	public void mousePointer() throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		Robot robot=new Robot();
		/*WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
		int x = help.getLocation().getX();
		int y=help.getLocation().getY();*/
		robot.delay(2000);
		robot.mouseMove(400,400);
		driver.close();
	}

}
