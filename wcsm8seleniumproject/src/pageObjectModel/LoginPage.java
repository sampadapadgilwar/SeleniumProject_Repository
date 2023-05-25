package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = ("//input[@name='username']"))
	private WebElement usernameTB;
	@FindBy(xpath = ("//input[@name='pwd']"))
	private WebElement PasswordTB;
	@FindBy(xpath = ("//input[@name='remember']"))
	private WebElement rememberBT;
	@FindBy(xpath = ("//a[@id='loginButton']"))
	private WebElement loginBT;
	@FindBy(xpath = ("//a[text()='Actimind Inc.']"))
	private WebElement actiMindLink;

	// initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getRememberBT() {
		return rememberBT;
	}

	public WebElement getLoginBT() {
		return loginBT;
	}

	public WebElement getActiMindLink() {
		return actiMindLink;
	}

	// operational method
	public void validLogin(String validUsername, String validPassword) throws InterruptedException {
		usernameTB.sendKeys(validUsername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(validPassword);
		Thread.sleep(2000);
		loginBT.click();
	}

	public void invalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException {
		usernameTB.sendKeys(invalidUsername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(invalidPassword);
		Thread.sleep(2000);
		usernameTB.clear();
		loginBT.click();

	}

}
