package windowHandleAssignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		Point point = link.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + xaxis + "," + (yaxis - 250) + ")");
		//close only child browser
		String parentHandle = driver.getWindowHandle();
		//System.out.println(parentHandle);
		link.click();
		Set<String> allHandle = driver.getWindowHandles();
		for (String wh : allHandle) {

			if (!parentHandle.equals(wh)) {
				Thread.sleep(2000);
				driver.switchTo().window(wh).close();
			} else {

			}
		}

	}
}
