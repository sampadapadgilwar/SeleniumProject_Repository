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
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();

		WebElement tar = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));

		Actions act = new Actions(driver);
		act.moveToElement(tar).build().perform();

		driver.findElement(By.xpath("//a[text()='Band']")).click();

		WebElement target = driver.findElement(By.xpath("//div[text()='Filter by']"));

		Thread.sleep(2000);
		
		for (int i = 0; i <= 2; i++) {
			act.clickAndHold(target).perform();
		}

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);//vk stand for virtual key
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);

		WebElement target1 = driver.findElement(By.name("search_query"));
		target1.click();

		robot.keyPress(KeyEvent.VK_CONTROL);//keyEvent is a class
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		driver.findElement(By.name("submit_search"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
