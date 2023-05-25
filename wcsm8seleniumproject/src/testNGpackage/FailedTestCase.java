package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestCase {
  @Test
  public void div() {
	  int a=10;
	  int b=0;
	  int c=a/b;
	  Reporter.log("the division of and b:"+c, true);//ArithmeticException
  }
  @Test
  public void add()
  {
	  int a=10;
	  int b=20;
	  int c=a+b;
	  Reporter.log("the addition of and b is: "+c,true);
  }
  @Test
  public void sub()
  {
	  int a=10;
	  int b=20;
	  int c=a-b;
	  Reporter.log("the substraction of and b is: "+c,true);
  }
}
