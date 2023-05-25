package keywordDrivenPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class demo extends BaseTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreads");

		String invalidUsn = flib.readExcelData(EXCEL_PATH, "invalidcreads", 1, 0);

		driver.findElement(By.name("username")).sendKeys(invalidUsn);
		Thread.sleep(2000);
		for (int i = 1; i <= rc; i++) {

			String invalidPass = flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 1);

			driver.findElement(By.name("pwd")).sendKeys(invalidPass);
			Thread.sleep(2000);

			driver.findElement(By.id("loginButton")).click();

		}

		bt.closeBrowser();

	}
}
