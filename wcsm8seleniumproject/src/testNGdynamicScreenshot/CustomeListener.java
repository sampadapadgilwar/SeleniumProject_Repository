package testNGdynamicScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener {

	

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("Test is Start!!!",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("This is failed Method"+failedMethod+"ScreenShot is taken",true);
		failedMethod(failedMethod);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("@Test annotaions start execution!!",true);
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
		Reporter.log("Test Finished!!!",true);
	
	}

}