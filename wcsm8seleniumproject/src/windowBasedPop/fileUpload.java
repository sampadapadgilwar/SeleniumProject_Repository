package windowBasedPop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUpload {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://sampada-padgilwar/login.jsp");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		// click on setting
		driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();

		// click on Logo & Color Scheme
		driver.findElement(By.linkText("Logo & Color Scheme")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));

		// create a object of action class
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(4000);

		// to handle file upload popup
		File file = new File("./autoit/FileUpload.exe");
		String absolutepath = file.getAbsolutePath();
		Runtime.getRuntime().exec(absolutepath);
		Thread.sleep(2000);
		// Runtime.getRuntime().exec(absolutepath);

		driver.quit();

	}

}
