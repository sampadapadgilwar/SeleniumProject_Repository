package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://toolsqa.com/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=1; i<=list.size(); i=i+1)
		{
			System.out.println(list.get(i).getText());
		}
		
	}
}