package methodOfWebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");

		String parentHandle = driver.getWindowHandle();
		System.out.println("This the add of parentwindow :" + parentHandle);

		driver.findElement(By.linkText("Open a popup window")).click();

		Set<String> allHandles = driver.getWindowHandles();
		for (String wh : allHandles) {
			System.out.println("This the add of all windows :" + wh);
		}
	}

}
