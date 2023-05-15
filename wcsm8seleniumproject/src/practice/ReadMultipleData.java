package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		for (int i = 0; i <= 10; i++) {
			Sheet sheet1 = wb.getSheet("IPL");
			Row row = sheet1.getRow(i);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			Thread.sleep(2000);
			Row row1 = sheet1.getRow(i);
			Cell cell1 = row1.getCell(1);
			String data1 = cell1.getStringCellValue();
			System.out.println(data + " : " + data1);
			
			FileInputStream fis1 = new FileInputStream("./data/testdata.xlsx");
            Workbook wb1 = WorkbookFactory.create(fis1);
           Sheet sheet3 = wb1.getSheet("IPL");
           
		}

	}
}
