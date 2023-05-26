package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	// method or annotation disabled or enabled
	@Test(enabled = false, description = "login method")
	public void method1() {
		Reporter.log("login perform!!",true);
	}

	@Test(enabled = true, description = "logout method")
	public void method() {
		Reporter.log("logout perform!!",true);
	}
}
