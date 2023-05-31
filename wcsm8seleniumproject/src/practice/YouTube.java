package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("YouTube",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='YouTube'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("aarambh hai prachand");
	}
}
