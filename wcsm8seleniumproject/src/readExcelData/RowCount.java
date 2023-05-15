package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCount {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		int rc = sheet.getLastRowNum();
		System.out.println("Total Row Count:" + rc);

		for (int i = 1; i <= rc; i++) {
      		Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			Thread.sleep(2000);
			System.out.println(data);
		}
	}
}