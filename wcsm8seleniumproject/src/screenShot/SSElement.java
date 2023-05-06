package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;


public class SSElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		WebElement seleniumIde = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		File src = seleniumIde.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/wess2.png");
		
		
		Files.copy(src, dest);
	}
}
