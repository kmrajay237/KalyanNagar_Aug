package scripts;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import library.Excel;
import pom.GoogleHomePagePO;
import pom.SearchResultPO;

public class CheckLinkedin extends BaseTest{
@Test
public void linkedinTest() {
	try {
		GoogleHomePagePO ghp = new GoogleHomePagePO(driver);
		ghp.searchBox().sendKeys(Excel.readExcelData(path, "socialsites", 2, 0));
		ghp.searchBox().sendKeys(Keys.ENTER);
		SearchResultPO spo = new SearchResultPO(driver);
		spo.linkedin().click();
		String expTitle = "LinkedIn: Log In or Sign Up";
		String actTitle = driver.getTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title Matching::Test Pass", true);
	} catch (Exception e) {
		Reporter.log("Title Not Matching::Test Fail", true);
		Assert.fail();
	}
}
}
