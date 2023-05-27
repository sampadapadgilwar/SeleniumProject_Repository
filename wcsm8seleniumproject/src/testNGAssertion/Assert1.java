package testNGAssertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assert1 {
	@Test
	  public void validLogin() {
		  
		  Reporter.log("lauch the browser",true);
		  Reporter.log("lauch the web app by using url",true);
		  
		  SoftAssert sa = new SoftAssert();// soft assert
		  sa.assertEquals(false, true);
		  Reporter.log("log in page will be display!!",true);
		  Reporter.log("perform the login operation!!",true);
		  Assert.assertEquals(true,false);// hard assert
		  Reporter.log("Home page will be display!!",true);
		  Reporter.log("log out",true);
		  
		  
		  
		  
		  
	  }
}
