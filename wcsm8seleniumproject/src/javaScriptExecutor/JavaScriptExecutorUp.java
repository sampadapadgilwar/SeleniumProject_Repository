package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		// Scroll down operation
		jse.executeScript("window.scrollBy(0,550)");
		// Scroll up operation
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-550)");

	}

}
