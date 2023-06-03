package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends Flib implements IAutoConstant {

	protected static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException

	{
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		if (browservalue.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		} else if (browservalue.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		} else if (browservalue.equalsIgnoreCase("msedge")) {
			WebDriverManager.edgedriver().setup();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		} else {
			Reporter.log("Invalid browser value!!!!!!", true);
		}
	}

	public void failedMethod(String methodName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(SCREENSHOT_PATH + methodName + ".png");
			Files.copy(src, dest);
		}

		catch (Exception e) {

		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
