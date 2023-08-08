package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		try {
			FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheetAt(0);
			Iterator<Row> iterator = sheet.iterator();
			while (iterator.hasNext()) {
				Row row = iterator.next();
				Iterator<Cell> cell = row.cellIterator();
				while (cell.hasNext()) {
					Cell cell1 = cell.next();
					switch (cell1.getCellType()) {
					case BOOLEAN:
						System.out.println(((Cell) cell).getBooleanCellValue() + "\t\t");
						break;
					case NUMERIC:
						System.out.println(((Cell) cell).getNumericCellValue() + "\t\t");
						break;
					case STRING:
						System.out.println(((Cell) cell).getStringCellValue() + "\t\t");
						break;
					default:
						break;

					}
				}
				System.out.println(" ");
			}
			fis.close();
			FileOutputStream out = new FileOutputStream(new File(" ./data/testdata.xlsx"));
			wb.write(out);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
