package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f()
  {
	  Reporter.log("Hii TestNG!!!!",true);
  }
  @Test
  public void g()
  {
	  Reporter.log("Hey java!!!!",true);
  }
}
