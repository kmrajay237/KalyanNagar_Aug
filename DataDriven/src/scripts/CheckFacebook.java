package scripts;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import library.Excel;
import pom.GoogleHomePagePO;
import pom.SearchResultPO;

public class CheckFacebook extends BaseTest{
	@Test
	public void facebookTest() throws Exception {
		try {
			GoogleHomePagePO ghp=new GoogleHomePagePO(driver);
			ghp.searchBox().sendKeys(Excel.readExcelData(path,"socialsites",0,0));
			ghp.searchBox().sendKeys(Keys.ENTER);
			SearchResultPO spo=new SearchResultPO(driver);
			spo.facebook().click();
			String expTitle="Facebook – log in or sign up";
			String actTitle=driver.getTitle();
			Assert.assertEquals(expTitle, actTitle);
			Reporter.log("Title Matching::Test Pass",true);
		} catch (Exception e) {
			Reporter.log("Title Not Matching::Test Fail",true);
			Assert.fail();
		}
	}
}
