package library;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class listener extends BaseTest implements ITestListener {
	private static ExtentReports extent = ExtentManager.getExtent();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult r) {
		System.out.println(r.getMethod().getMethodName() + " Started!");
		ExtentTest extentTest = extent.createTest(r.getMethod().getMethodName(), r.getMethod().getDescription());
		test.set(extentTest);
	}

	public void onTestSuccess(ITestResult r) {
		System.out.println(r.getMethod().getMethodName() + " Passed");
		test.get().pass("Test Passed");
	}

	public void onTestFailure(ITestResult r) {
		System.out.println(r.getMethod().getMethodName() + " Failed");
		test.get().fail(r.getThrowable());

	}

	public void onTestSkipped(ITestResult r) {
		System.out.println(r.getMethod().getMethodName() + " Skipped");
		test.get().skip(r.getThrowable());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult r) {
		System.out.println("On Test fail");

	}

	public void onStart(ITestContext context) {
		System.out.println("Extent Report Test Suite Started");

	}

	public void onFinish(ITestContext context) {
		System.out.println("Extent Report Test Suite FInished");
		extent.flush();
	}

}
