package testNGExecution1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	static WebDriver driver;

	@Test
	@Parameters({ "browser", "url","username","password" })
	public void method1(String browser, String url,String username,String password) throws InterruptedException 
	{
		if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			System.out.println("your Actitime is launch successfully on chrome browser");
			System.out.println("*******************************************************");
			Thread.sleep(4000);
			driver.close();
		} 
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			System.out.println("your Actitime is launch successfully on firefox browser");
			System.out.println("*******************************************************");
			Thread.sleep(4000);
			driver.close();

		} 
		else
		{
			System.out.println("invalid browser");
		}
		
	}
}
