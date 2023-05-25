package keywordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		// to open the browser create the obj of basetest
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "username"));
		Thread.sleep(2000);

		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();

	}

}
