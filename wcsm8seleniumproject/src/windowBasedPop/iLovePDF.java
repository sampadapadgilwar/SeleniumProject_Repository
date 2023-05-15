package windowBasedPop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iLovePDF {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ilovepdf.com/");
		driver.findElement(By.xpath("//h3[text()='Word to PDF']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(2000);
		File path = new File("./autoit/fileUpload2.exe");
		String apath = path.getAbsolutePath();
		Runtime.getRuntime().exec(apath);
		Thread.sleep(2000);
		driver.findElement(By.id("processTask")).click();
	}
}
