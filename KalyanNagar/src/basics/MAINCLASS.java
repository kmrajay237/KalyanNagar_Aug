package basics;

public class MAINCLASS {

	public static void main(String[] args) {
		WEBDRIVER driver=new CHROMEDRIVER();
		driver.m1();
		driver.m2();
		JAVASCRIPTEXECUTOR jse=(JAVASCRIPTEXECUTOR) driver;
		jse.m3();
		jse.m4();
	}

}
