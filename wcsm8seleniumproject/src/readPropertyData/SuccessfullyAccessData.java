package readPropertyData;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import keywordDrivenPackage.Flib;

public class SuccessfullyAccessData  extends Flib{

	static WebDriver driver;

	public void openBrowser() throws IOException, InterruptedException

	{
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData("./data./config.properties", "browser");
		String url = flib.readPropertyData("./data./config.properties","url");
		System.out.println("browser value is: "+browservalue);
		System.out.println("url value is: "+url);
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		SuccessfullyAccessData s = new SuccessfullyAccessData();
		s.openBrowser();
	}
}
