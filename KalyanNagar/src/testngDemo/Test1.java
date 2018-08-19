package testngDemo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Test1 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test(priority=1)
	public void register() {
		System.out.println("User Registered");
	}
	@Test(priority=2,dependsOnMethods= {"register"},alwaysRun=true)
	public void login() {
		System.out.println("User Logged in");
	}
	@Test(priority=3,invocationCount=3)
	public void edit() {
		System.out.println("User Edited");
	}
	@Test(priority=4,enabled=false)
	public void delete() {
		System.out.println("User Deleted");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
}
