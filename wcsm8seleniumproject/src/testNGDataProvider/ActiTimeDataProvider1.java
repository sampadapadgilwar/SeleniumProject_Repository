package testNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ActiTimeDataProvider1 {
	static WebDriver driver;
  @BeforeTest
  public void property() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  }
  @BeforeMethod
  public void setUp()
  {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://sampada-padgilwar/login.do");
  }
  @DataProvider(name="testActiTime")
  public Object [][] dataprovider()
  {
	Object[][] dataprovider=new Object[5][2];
	dataprovider[0][0]="admin";
	dataprovider[0][1]="Manager";
	
	dataprovider[1][0]="admin12";
	dataprovider[1][1]="Manager123";
	
	dataprovider[2][0]="ad@min";
	dataprovider[2][1]="Mana@ger";
	
	dataprovider[3][0]="ad_min";
	dataprovider[3][1]="Mana_ger";
	
	dataprovider[4][0]="Manager";
	dataprovider[4][1]="Admin";
	
	return dataprovider;
	
	  
  }
  @Test(dataProvider = "testActiTime")
	public void loginvalid(String usn, String pass) throws InterruptedException
  {
	    driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		 driver.findElement(By.name("username")).clear();
		 
  }
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
}








