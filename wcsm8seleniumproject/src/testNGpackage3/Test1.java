package testNGpackage3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void div() {
		int a = 10;
		int b = 5;
		int c = a / b;
		Reporter.log("the division of and b:" + c, true);// ArithmeticException
	}
}
