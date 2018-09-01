package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProvideData {
	@DataProvider(name="LoginData")
	public static Object[][] loginData() {
		return new Object[][] { { "user1", "pass1" },
								{ "user2", "pass2" }, 
								{ "user3", "pass3" },
								{ "user4", "pass4" } 
							  };
	}
	@Test(dataProvider="LoginData")
	public void dataProviderTest(String user,String pass) {
		System.out.println("Test Started....");
		System.out.println("Username: "+user);
		System.out.println("Password: "+pass);
		
	}
}
