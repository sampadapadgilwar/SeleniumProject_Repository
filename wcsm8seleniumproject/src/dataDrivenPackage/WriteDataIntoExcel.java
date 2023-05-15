package dataDrivenPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel extends Flib {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");// provide the path of file

		Workbook wb = WorkbookFactory.create(fis);// make the file ready for read

		Sheet sheet = wb.getSheet("IPL");// get into sheet
		Row row = sheet.getRow(1);// get into desired row
		Cell cell = row.createCell(2);// is used to create the cell
		cell.setCellValue("BCCI");// set the value in that cell

		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);

		// by using generic reusable method
		FlibInterface flib = new Flib();
		flib.writeExcelData("./data/TestData.xlsx", "IPL", 1, 3, "sampada");

	}

}
