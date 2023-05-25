package testNGpackage3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void sub() {
		int a = 10;
		int b = 20;
		int c = a - b;
		Reporter.log("the substraction of and b is: " + c, true);
	}
	@Test
	public void multi() {
		int a = 10;
		int b = 20;
		int c = a * b;
		Reporter.log("the multiplication of and b is: " + c, true);
	}
	@Test
	public void mod() {
		int a = 10;
		int b = 20;
		int c = a % b;
		Reporter.log("the modulus of and b is: " + c, true);
	}
}
