package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener {

	public void onTestStart(ITestResult result) {

		Reporter.log("Browser open Test case is Start!!!", true);

	}

	public void onTestSuccess(ITestResult result) {
       Reporter.log("Test case is executed successfully",true);
	}

	public void onTestFailure(ITestResult result) {

		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("This is failed Method" + failedMethod + "ScreenShot is taken", true);
		failedMethod(failedMethod);

	}

	public void onTestSkipped(ITestResult result) {
       Reporter.log("test is Skipped",true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

		Reporter.log("@Test annotaions start execution!!", true);

	}

	public void onFinish(ITestContext context) {

		Reporter.log("Test Finished!!!", true);

	}

}