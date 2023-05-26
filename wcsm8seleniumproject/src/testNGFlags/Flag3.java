package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	//use to execute annotation or method multiple time
  @Test(invocationCount =100)
  public void method1() {
	  Reporter.log("login test case",true);
  }
}
