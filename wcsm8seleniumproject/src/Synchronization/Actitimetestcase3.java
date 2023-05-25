package Synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimetestcase3 {

	public static boolean waitmethod(WebDriver driver, int sec, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		boolean titleofpage = wait.until(ExpectedConditions.titleContains(title));
		return titleofpage;
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");

		String loginpagetitle = driver.getTitle();

		if (waitmethod(driver, 30, loginpagetitle)) {
			System.out.println("login page title is matched and test case passed!!!!");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		} else {
			System.out.println("login page title is not matched and test case failed!!!!");
		}
		String homepagetitle = driver.getTitle();
		if (waitmethod(driver, 30, homepagetitle)) {
			System.out.println("home page title is matched and test case passed!!!!");
		} else {
			System.out.println("home page title is not matched and test case failed!!!!");
		}
	}
}
