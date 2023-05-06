package robotMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeprintpopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("wedriver.edge.driver", "./drivers.chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);

		// release ctrl+p
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);

		for (int i = 0; i < 8; i++) {
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_TAB);
			// release tab
			robot.keyRelease(KeyEvent.VK_TAB);
		}

		// press enter to handle pop up
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		// release enter
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
