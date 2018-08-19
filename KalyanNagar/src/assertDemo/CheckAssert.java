package assertDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckAssert {
	@Test
	public void checkAssertDemo() {
		Reporter.log("print-1",true);
		Assert.assertEquals("xyz","xyz");
		Reporter.log("print-2",true);
		Assert.assertEquals("abc","xyz");
		Reporter.log("print-3",true);
	}
	@Test
	public void checkSoftAssertDemo() {
		SoftAssert s=new SoftAssert();
		Reporter.log("print-1",true);
		s.assertEquals("xyz","xyz");
		Reporter.log("print-2",true);
		s.assertEquals("abc","xyz");
		Reporter.log("print-3",true);
	}

}
