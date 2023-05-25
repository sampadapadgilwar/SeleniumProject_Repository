package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.selenium.dev/downloads/");

		WebElement selenium = driver.findElement(By.xpath("(//div[contains(@class,'card-header bg-t')])[5]"));

		System.out.println(selenium.getCssValue("font-weight"));
		Thread.sleep(2000);
		driver.close();

	}
}