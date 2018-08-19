package testngDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforeMethod");
	}

	@Test(groups= {"smoke"})
	public void testCase1() {
		System.out.println("TestCase1");
	}

	@Test(groups= {"regression"})
	public void testCase2() {
		System.out.println("TestCase2");
	}

	@Test(groups= {"smoke","regression"})
	public void testCase3() {
		System.out.println("TestCase3");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");

	}

}
