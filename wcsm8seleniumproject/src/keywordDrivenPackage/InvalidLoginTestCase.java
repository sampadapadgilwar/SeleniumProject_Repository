package keywordDrivenPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
//HYBRID FRAMEWORK(COBINATION OF DATA DRIVEN FRAMEWORK AND KEYWORD DRIVEN FRAMEWORK)
public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreads");

		for (int i = 1; i <= rc; i++) {

			String invalidUsn = flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 0);
			String invalidPass = flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 1);

			driver.findElement(By.name("username")).sendKeys(invalidUsn);
			driver.findElement(By.name("pwd")).sendKeys(invalidPass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();

		}

		bt.closeBrowser();

	}

}
