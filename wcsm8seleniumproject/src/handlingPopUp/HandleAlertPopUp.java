package handlingPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/WebElement/Alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' click me!']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		// al.dismiss();
		// System.out.println(al.getText()); o/p: hello there !
	}

}
