package keywordDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements KeyInterface {

	static WebDriver driver;

	public void openBrowser() throws IOException, InterruptedException

	{
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		if (browservalue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		} else if (browservalue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		} else if (browservalue.equalsIgnoreCase("msedge")) {
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		} else {
			System.out.println("Invalid browser value!!!!!!");
		}
	}
    
	public void closeBrowser() {
		driver.quit();
	}

}
