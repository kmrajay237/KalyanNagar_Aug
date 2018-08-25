package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GoogleHomePagePO;
import pom.SearchResultPO;

public class TestFacebook extends BaseTest{
	@Test
	public void FacebookCheck() {
		try {
			GoogleHomePagePO gpo = new GoogleHomePagePO(driver);
			gpo.searchBox().sendKeys("facebook");
			gpo.searchBox().sendKeys(Keys.ENTER);
			SearchResultPO spo = new SearchResultPO(driver);
			spo.facebook().click();
			String expTitle = "Facebook – log in or sign up";
			String actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			Reporter.log("Title is matching", true);
		} catch (Exception e) {
			Reporter.log("Test Fail", true);
			Assert.fail();
		}
	}

}
