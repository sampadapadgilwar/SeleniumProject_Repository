package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://sampada-padgilwar/login.do");
		// read the valid username from actimetime excel sheet
		FileInputStream fis = new FileInputStream("./data/ActiTimeExcelSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String validUsername = cell.getStringCellValue();

		// read the valid Password from actimetime excel sheet
		FileInputStream fis1 = new FileInputStream("./data/ActiTimeExcelSheet.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb1.getSheet("validcreds");
		Row row1 = sheet1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String validPassword = cell1.getStringCellValue();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
