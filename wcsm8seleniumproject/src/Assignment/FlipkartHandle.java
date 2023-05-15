package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHandle {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.findElement(By.xpath("//button[.='✕']")).click();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung galaxy s23 ultra");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(2000);
		WebElement samsung = driver
				.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']"));
		samsung.click();
		Set<String> flipkart = driver.getWindowHandles();
		for (String str : flipkart) {
			if (!parentwindow.equals(flipkart)) {
				Thread.sleep(2000);
				driver.switchTo().window(str);
			}
		}
		String actualTilte = driver.getTitle();
		if (actualTilte.equals(
				"SAMSUNG Galaxy S23 Ultra 5G ( 256 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com")) {
			System.out.println("its a child window");
		} else {
			System.out.println("its parent window");
		}
		driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']")).click();
		WebElement target = driver.findElement(By.xpath("//span[text()='View Details']"));
		Point point = target.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + xaxis + "," + (yaxis - 500) + ")");
		driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		WebElement remove = driver.findElement(By.xpath("//div[text()='Remove']"));
		Point point1 = remove.getLocation();
		int xaxis1 = point1.getX();
		int yaxis1 = point1.getY();
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(" + xaxis1 + "," + (yaxis1 - 500) + ")");
		remove.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();

	}
}
