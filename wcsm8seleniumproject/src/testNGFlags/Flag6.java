package testNGFlags;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {

	@Test(description = "test case 1")
	public void login() {

		Assert.fail();
		Reporter.log("login method!!", true);
	}

	@Test(dependsOnMethods = "login", alwaysRun = true,description = "test case 2")
	public void createUser() {
		Reporter.log("create User Method!!", true);
	}

	@Test(description = "test case 3")
	public void logout() {
		Reporter.log("logout Method!!", true);
	}
}