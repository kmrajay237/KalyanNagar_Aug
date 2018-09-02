package listen;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	@BeforeMethod
	public void before() {
		System.out.println("Before-Method");
	}
	@AfterMethod
	public void after() {
		System.out.println("After-Method");
	}

}
