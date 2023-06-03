package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserListPage;

@Listeners(CustomeListener.class)

public class TestUserCreated extends BaseTest {

	@Test
	public void user1() throws IOException, InterruptedException {
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.usersModuleMethod();
		Thread.sleep(2000);
		UserListPage ulp = new UserListPage(driver);
		String usn = flib.readExcelData(EXCEL_PATH, "userdata", 1, 0);
		String pass = flib.readExcelData(EXCEL_PATH, "userdata", 1, 1);
		String fn = flib.readExcelData(EXCEL_PATH, "userdata", 1, 2);
		String ln = flib.readExcelData(EXCEL_PATH, "userdata", 1, 3);

		ulp.createUserMethod(usn, pass, fn, ln);
		

		Thread.sleep(2000);
		ulp.managerCreateMethod();
		String usn1 = flib.readExcelData(EXCEL_PATH, "userdata", 2, 0);
		String pass1 = flib.readExcelData(EXCEL_PATH, "userdata", 2, 1);
		String fn1 = flib.readExcelData(EXCEL_PATH, "userdata", 2, 2);
		String ln1 = flib.readExcelData(EXCEL_PATH, "userdata", 2, 3);

		ulp.createUserMethod(usn1, pass1, fn1, ln1);

	

	}

}