package robotMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.xpath("//a[text()='Watch Jewellery ']")).click();

		WebElement target = driver.findElement(By.xpath("//div[text()='Filter by']"));
		Actions act = new Actions(driver);

		act.doubleClick(target).perform();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_KP_RIGHT);
		robot.keyPress(KeyEvent.VK_KP_RIGHT);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_KP_RIGHT);
		robot.keyRelease(KeyEvent.VK_KP_RIGHT);

	}
}
