package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
		WebElement element = driver.findElement(By.linkText("Learning JavaScript Design Patterns"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	
	}
}
