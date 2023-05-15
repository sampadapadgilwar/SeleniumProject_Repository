package windowBasedPop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Data Import']")).click();

		WebElement target = driver.findElement(By.xpath("//div[@class='oxd-file-button']"));
		target.click();

		File path = new File("./autoit/FileUpload1.exe");
		String apath = path.getAbsolutePath();
		Runtime.getRuntime().exec(apath);
		Thread.sleep(2000);
	}

}
