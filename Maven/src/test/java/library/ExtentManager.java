package library;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
	private static ExtentReports extent;
	private static ExtentTest test;
	private static ExtentHtmlReporter htmlReporter;
	private static String filepath="./Report/Extent.html";
	
	public static ExtentReports getExtent() {
		if(extent!=null) {
			return extent;
		}
		extent=new ExtentReports();
		extent.attachReporter(getHtmlReporter());
		return extent;
	}
	
	private static ExtentHtmlReporter getHtmlReporter() {
		htmlReporter=new ExtentHtmlReporter(filepath);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Social Sites");
		htmlReporter.config().setReportName("Demo Test in Google");
		return htmlReporter;
	}
	
	public static ExtentTest CreateTest(String name,String Description) {
		test=extent.createTest(name,Description);
		return test;
	}

}
