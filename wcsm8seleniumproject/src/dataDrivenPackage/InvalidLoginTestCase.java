package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://sampada-padgilwar/login.do");
		// to read the reda from external file create the object of flib
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/ActiTimeExcelSheet.xlsx", "invalidcreads");
		for (int i = 1; i <= rc; i++) {
			String invalidUserName = flib.readExcelData("./data/ActiTimeExcelSheet.xlsx", "invalidcreads", i, 0);
			String invalidPassword = flib.readExcelData("./data/ActiTimeExcelSheet.xlsx", "invalidcreads", i, 0);
			driver.findElement(By.name("username")).sendKeys(invalidUserName);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();

		}
	}
}
