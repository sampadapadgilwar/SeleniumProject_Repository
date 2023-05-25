package testNGpackage3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		Reporter.log("the addition of and b is: " + c, true);
	}
}
