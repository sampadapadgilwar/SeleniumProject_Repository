package windowBasedPop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrintPopUp {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		// ---------------------------------------------

		// generte print popup
		// create a object of robot class
		Robot robot = new Robot();
		// ---------------------------------------------

		// press ctrl+p
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);

		// release ctrl+p
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);

		//shift control to cancel..........
		// press in tab
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		// release tab
		robot.keyRelease(KeyEvent.VK_TAB);

		// press enter to handle pop  up
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		// release enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(4000);
		driver.quit();
		
		

	}
}