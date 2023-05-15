package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(1000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster eager-load    ']")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("sampada padgilwar");
		Thread.sleep(1000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("sampadapadgiwar89@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("8975604314");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='fc-button']")).click();

	}

}
