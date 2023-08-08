package automationCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BookMyShowAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.bookmyshow.com/");

		// If a city is asked, select Bengaluru
		WebElement cityDropdown = driver.findElement(By.cssSelector("div.region-list"));
		cityDropdown.click();

		// Wait for the dropdown options to load
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement cityOptionBengaluru = driver
				.findElement(By.xpath("//div[@class='region-list']//li[contains(text(), 'Bengaluru')]"));
		cityOptionBengaluru.click();

		// Click on Sign In
		WebElement signInButton = driver.findElement(By.cssSelector("li.login-link a"));
		signInButton.click();

		// Wait for the Sign In options to load
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click on Continue with Email
		WebElement continueWithEmailButton = driver
				.findElement(By.xpath("//div[@class='fb-top-right']//a[contains(text(), 'Continue with Email')]"));
		continueWithEmailButton.click();

		// Wait for the email input field to load
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Enter the email and click continue
		WebElement emailInput = driver.findElement(By.id("txtEmail"));
		emailInput.sendKeys("selauto@yopmail.com");

		WebElement continueButton = driver.findElement(By.id("btnContinue"));
		continueButton.click();

		// Wait for the Yopmail login page to load
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Go to Yopmail.com (you can change the website if needed)
		driver.get("https://yopmail.com");

		// Wait for the Yopmail inbox page to load
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Type selauto@yopmail.com and access inbox
		WebElement yopmailLoginInput = driver.findElement(By.id("login"));
		yopmailLoginInput.sendKeys("selauto@yopmail.com");

		WebElement checkInboxButton = driver.findElement(By.cssSelector("input.sbut"));
		checkInboxButton.click();

		// Wait for the Yopmail inbox to load
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Locate the latest email from BookMyShow and fetch the OTP
		// For example, if the OTP is in a div with class "otp-code":
		WebElement otpElement = driver.findElement(By.xpath("//div[contains(@class, 'otp-code')]"));
		String otp = otpElement.getText();

		// Come back to the Sign-in page and enter the OTP
		driver.get("https://in.bookmyshow.com/");

		// Wait for the BookMyShow page to load
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Enter the OTP
		WebElement otpInput = driver.findElement(By.id("otp"));
		otpInput.sendKeys(otp);

		// Click the login button
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
		loginButton.click();

		// Wait for the sign-in to complete
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Validate user is successfully signed in and "Hi, Guest" is displayed.
		WebElement welcomeTextElement = driver
				.findElement(By.cssSelector("div.logged-user-welcome-section span.username"));
		String welcomeText = welcomeTextElement.getText();
		if (welcomeText.equals("Hi, Guest")) {
			System.out.println("Successfully signed in.");
		} else {
			System.out.println("Sign-in failed.");
		}

		// Close the browser
		driver.quit();
	}
}
