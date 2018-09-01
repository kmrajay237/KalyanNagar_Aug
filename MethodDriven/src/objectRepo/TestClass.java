package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void testChrome() {
		ConfigReader reader=new ConfigReader();
		System.setProperty(reader.getKey(),reader.getValue());
		WebDriver driver=new ChromeDriver();
		driver.get(reader.getURL());
	}

}
