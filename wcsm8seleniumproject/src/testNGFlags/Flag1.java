package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	//to Describe the method
  @Test(description = "this method perform login")
  public void method1() {
	Reporter.log("Method1 login!!!!",true);
  }
}
