package listen;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{
	@Test
	public void testScript1() {
		System.out.println("Test Script-1");
	}
	@Test(expectedExceptions=RuntimeException.class)
	public void testScript2() {
		System.out.println("Test Script-2");
	}
	@Test
	public void testScript3() {
		throw new SkipException("Test Script-3 Skipped");
	}
	@Test(successPercentage=80,invocationCount=5)
	public void testScript4() {
		System.out.println("Test Script-4");
		
	}
}
