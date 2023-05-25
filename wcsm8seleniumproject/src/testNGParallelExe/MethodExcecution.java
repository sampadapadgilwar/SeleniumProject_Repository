package testNGParallelExe;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExcecution {
	@SuppressWarnings("deprecation")
	@Test
	public void method1() {
		long threadID =Thread.currentThread().getId();
		Reporter.log(threadID + ": is the thread id of method1", true);
		Reporter.log("method1", true);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void method2() {
		long threadID = Thread.currentThread().getId();
		Reporter.log(threadID + ": is the thread id of method2", true);
		Reporter.log("method2", true);
	}
}
