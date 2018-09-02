package script;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GoogleHomePagePO;
import pom.SearchResultPO;

public class TestInstagram extends BaseTest{
	@Test
	public void InstagramCheck() {
		try {
			GoogleHomePagePO gpo = new GoogleHomePagePO(driver);
			gpo.searchBox().sendKeys("instagram");
			gpo.searchBox().sendKeys(Keys.ENTER);
			SearchResultPO spo = new SearchResultPO(driver);
			spo.instagram().click();
			String expTitle = "Instagram";
			String actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			Reporter.log("Title is matching", true);
		} catch (Exception e) {
			Reporter.log("Test Fail", true);
			Assert.fail();
		}
	}
}
