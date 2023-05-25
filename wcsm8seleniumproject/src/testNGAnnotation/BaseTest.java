package testNGAnnotation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	static WebDriver driver;
	@BeforeTest
	public void propertyMethod() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.google.com/");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
