package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement createUser;
	@FindBy(xpath = "//*[@name='username']")
	private WebElement usernameTB;
	@FindBy(xpath = "//*[@name='passwordText']")
	private WebElement passwordTB;
	@FindBy(xpath = "//*[@name='passwordTextRetype']")
	private WebElement passwordrRetypeTB;
	@FindBy(xpath = "//*[@name='firstName']")
	private WebElement firstNameTB;
	@FindBy(xpath = "//*[@name='lastName']")
	private WebElement lastNameTB;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createuserButton;
	@FindBy(xpath = "//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]")
	private WebElement cancleButton;
	@FindBy(xpath = "(//a[contains(text(),'System, Administrator (admin)')]/ancestor::tbody/descendant::a)[1]")
	private WebElement userCreatedLink;
	@FindBy(xpath = "//input[@value='Delete This User']")
	private WebElement deleteUserButton;

	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization

	public WebElement getCreateUser() {
		return createUser;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getPasswordrRetypeTB() {
		return passwordrRetypeTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getCreateuserButton() {
		return createuserButton;
	}

	public WebElement getCancleButton() {
		return cancleButton;
	}

	public WebElement getUserCreatedLink() {
		return userCreatedLink;
	}

	public WebElement getDeleteUserButton() {
		return deleteUserButton;
	}

	public void createUserMethod(String usn, String pass, String fn, String ln) throws InterruptedException {
		createUser.click();
		Thread.sleep(2000);
		usernameTB.sendKeys(usn);
		Thread.sleep(1000);
		passwordTB.sendKeys(pass);
		Thread.sleep(1000);
		passwordrRetypeTB.sendKeys(pass);
		Thread.sleep(1000);
		firstNameTB.sendKeys(fn);
		Thread.sleep(1000);
		lastNameTB.sendKeys(ln);
		Thread.sleep(1000);
		createuserButton.click();

	}

	public void deleteuserMethod() throws InterruptedException {
		userCreatedLink.click();
		Thread.sleep(1000);
		deleteUserButton.click();

		WorkLib wl = new WorkLib();
		wl.handleCofirmationPopup();
	}
}
