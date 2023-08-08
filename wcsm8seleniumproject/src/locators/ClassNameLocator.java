package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		// driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		// Thread.sleep(1000);
		// driver.findElement(By.className("lNPNe")).click();
		driver.switchTo().activeElement().sendKeys("joey tribbiani", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.className("lNPNe")).click();

	}

}
