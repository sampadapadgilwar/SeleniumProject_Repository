package pageObjectModel;

import java.io.IOException;

public class CreateUserTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();

		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));

		HomePage hp = new HomePage(driver);
		hp.usersModuleMethod();

		Thread.sleep(2000);
		UserListPage ulp = new UserListPage(driver);
//
//		short cc = flib.cellCount(EXCEL_PATH, "userdata", 1);
//		{
//			
//			for (int i = 0; i <= cc; i++) {
//				flib.readExcelData(EXCEL_PATH, "userdata", 1, i);
//				ulp.createUserMethod(flib.readExcelData(EXCEL_PATH, "userdata", 1, i),
//						flib.readExcelData(EXCEL_PATH, "userdata", 1, i),
//						flib.readExcelData(EXCEL_PATH, "userdata", 1, i),
//						flib.readExcelData(EXCEL_PATH, "userdata", 1,i));
//
//			}
//		}

		// by using Reference variable
		String usn = flib.readExcelData(EXCEL_PATH, "userdata", 1, 0);
		String pass = flib.readExcelData(EXCEL_PATH, "userdata", 1, 1);

		String fn = flib.readExcelData(EXCEL_PATH, "userdata", 1, 2);
		String ln = flib.readExcelData(EXCEL_PATH, "userdata", 1, 3);
		Thread.sleep(2000);
		ulp.createUserMethod(usn, pass, fn, ln);
		Thread.sleep(2000);
		ulp.deleteuserMethod();
		Thread.sleep(2000);
		bt.tearDown();

	}
}
