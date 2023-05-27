package testNGAssertion;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {

	static WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://sampada-padgilwar/login.do");
	}
	@Test
	public void login() throws InterruptedException 
	{
         String actualLoginpageTitle = driver.getTitle();
         SoftAssert sa = new SoftAssert();
         sa.assertEquals(actualLoginpageTitle,"loginPage");
         
         driver.findElement(By.name("username")).sendKeys("admin");
         driver.findElement(By.name("pwd")).sendKeys("manager");
         driver.findElement(By.id("loginButton")).click();
         Thread.sleep(2000);
         
         String actualHomepageTitle = driver.getTitle();
         Assert.assertEquals(actualHomepageTitle,"idontknow");
         driver.findElement(By.className("logout")).click(); 
         Thread.sleep(2000);
         sa.assertAll();
 
	}

	@BeforeTest
	public void property()
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	
	@AfterMethod
	public void logout()
	{
		driver.quit();
	}
}