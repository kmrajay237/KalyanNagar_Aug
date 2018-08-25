package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GoogleHomePagePO;
import pom.SearchResultPO;

public class TestTwitter extends BaseTest{
	@Test
	public void TwitterCheck() {
		try {
			GoogleHomePagePO gpo=new GoogleHomePagePO(driver);
			gpo.searchBox().sendKeys("twitter");
			gpo.searchBox().sendKeys(Keys.ENTER);
			SearchResultPO spo=new SearchResultPO(driver);
			spo.twitter().click();
			String expTitle="Login on Twitter";
			String actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			Reporter.log("Title is matching",true);
		} catch (Exception e) {
			Reporter.log("Test Fail",true);
			Assert.fail();
		}
	}

}
