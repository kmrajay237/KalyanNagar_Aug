package listen;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Launch browser");
		System.out.println("**************");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
		System.out.println("**************");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		System.out.println("**************");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
		System.out.println("**************");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Paased Percentage");
		System.out.println("**************");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Started");
		System.out.println("**************");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished");
		System.out.println("**************");
		
	}

}
