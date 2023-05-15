package handleFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserCreatedFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/WebElement/frame.html");
		WebElement username = driver.findElement(By.id("i2"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.id("frid"));
		driver.switchTo().frame(frame);
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("Manager");
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		username.clear();
		

	}

}
