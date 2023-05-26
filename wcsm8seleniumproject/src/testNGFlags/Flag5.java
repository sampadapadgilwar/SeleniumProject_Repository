package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	@Test(description = "login TestCase")
	public void loginMethod() {
		Reporter.log("login performed!!",true);
	}

	@Test(description = "create user TestCase",dependsOnMethods = "loginMethod")
	public void createUserMethod() {
		Reporter.log("user created!!",true);
	}

	@Test(description = "logout Testcase",dependsOnMethods = "createUserMethod")
	public void logoutMethod() {
		Reporter.log("logout successfully!!",true);
	}
}
