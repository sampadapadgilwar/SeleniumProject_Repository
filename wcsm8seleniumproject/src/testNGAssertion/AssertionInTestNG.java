package testNGAssertion;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
	static WebDriver driver;
	SoftAssert sa = new SoftAssert();

	@BeforeTest
	public void property() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://sampada-padgilwar/login.do");
		String actualLoginpageTitle = driver.getTitle();
		// Apply Soft assert
		// SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualLoginpageTitle, "loginPage");
		// sa.assertAll();
	}

	@Test(alwaysRun = true)
	public void login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		// Apply hard Assert
		if (loginButton.isDisplayed()) {
			Assert.assertEquals(true, true);
			loginButton.click();
		} else {
			Reporter.log("Exception", true);
		}
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle,"idontknow");
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		sa.assertAll();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}