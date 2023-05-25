package pageObjectModel;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreads");
		for (int i = 1; i <= rc; i++) {
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 0),
					flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 1));
		}
		bt.tearDown();
	}

}
