package testNGdynamicScreenshot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomeListener.class)
public class ActiTimeLogin extends BaseTest {
	@Test
	public void login() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
        Assert.fail();
		driver.findElement(By.id("loginButton")).click();
	
	}
}
