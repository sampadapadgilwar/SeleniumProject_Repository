package DeselectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexSingle {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("file:///C:/Users/HP/Desktop/WebElement/SingleSelectDropDown.html");
	 
	 WebElement dropDown = driver.findElement(By.id("i1"));
	 Select sel = new Select(dropDown);
	 sel.selectByIndex(2);
	 Thread.sleep(2000);
	 sel.deselectByIndex(2);
	}
}
