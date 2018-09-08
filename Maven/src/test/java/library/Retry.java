package library;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	private int count=0;
	private static int maxTry=3;
	public boolean retry(ITestResult r) {
		//check if test not succeed
		if (!r.isSuccess()) {
			//check if maxTry count reached
			if (count<maxTry) {
				//increase the maxTry count by 1
				count++;
				//Mark Test as failed
				r.setStatus(r.FAILURE);
				//Tells TestNG to Re-Run the Test
				return true;
			}else {
				//if maxCOunt is reached, Test Marked as fail
				r.setStatus(r.FAILURE);
			}
		}else {
			//If test pass, TestNg marks it as success
			r.setStatus(r.SUCCESS);
		}
		
		return false;
	}

}
