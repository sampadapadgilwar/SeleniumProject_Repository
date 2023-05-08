package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		Actions act = new Actions(driver);

		// bank
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target1 = driver.findElement(By.xpath("//div[@id='shoppingCart1']/descendant::li"));

		// 5000
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='shoppingCart4']/descendant::li[1]"));
		
		// ----------------------------------------------------------------------------------------------------------------------------------------
		
		// sales
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target3 = driver.findElement(By.xpath("//div[@id='shoppingCart3']/descendant::li"));

		// 5000
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target4 = driver.findElement(By.xpath("//div[@id='shoppingCart4']/descendant::ol[@id='amt8']"));
		
		// -----------------------------------------------------------------------------------------------------------------------------------------
		
		Thread.sleep(2000);
		act.dragAndDrop(src1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, target3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src4, target4).perform();
		Thread.sleep(2000);
		// driver.quit();

	}
}