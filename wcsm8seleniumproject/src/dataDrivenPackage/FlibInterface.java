package dataDrivenPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public interface FlibInterface {
	public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount)
			throws EncryptedDocumentException, IOException;

	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException;

	public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data)
			throws EncryptedDocumentException, IOException;
}
