package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskManagerPage {
	@FindBy(xpath = "//A[@class='content tasks']/IMG[@class='sizer']")
	private WebElement task;
	@FindBy(xpath = "//input[@value='Create New Tasks']")
	private WebElement CreateNewTask;
	@FindBy(xpath = "//*[@name='customerId']")
	private WebElement Customer;
	@FindBy(xpath = "//*[@name='projectId']")
	private WebElement project;
	@FindBy(xpath = "//TD[@id='task0.cell']/INPUT[@class='text']")
	private WebElement Task1;
	@FindBy(xpath = "//TD[@id='task1.cell']/INPUT[@class='text']")
	private WebElement Task2;
	@FindBy(xpath = "//TD[@id='task2.cell']/INPUT[@class='text']")
	private WebElement Task3;
	@FindBy(xpath = "//TD[@id='task3.cell']/INPUT[@class='text']")
	private WebElement Task4;
	@FindBy(xpath = "//TD[@id='task4.cell']/INPUT[@class='text']")
	private WebElement Task5;
	@FindBy(xpath = "//DIV[@id='bt2']/SELECT[.='Non-Billable\r\n" + "Billable']")
	private WebElement billabel;
	@FindBy(xpath = "//TABLE[@cellpadding='4']/TBODY/TR[2]/TD[4]/INPUT[@value='on']")
	private WebElement Add1;
	@FindBy(xpath = "//TABLE[@cellpadding='4']/TBODY/TR[3]/TD[4]/INPUT[@value='on']")
	private WebElement Add2;
	@FindBy(xpath = "//TABLE[@cellpadding='4']/TBODY/TR[4]/TD[4]/INPUT[@value='on']")
	private WebElement Add3;
	@FindBy(xpath = "//TABLE[@cellpadding='4']/TBODY/TR[5]/TD[4]/INPUT[@value='on']")
	private WebElement Add4;
	@FindBy(xpath = "//TABLE[@cellpadding='4']/TBODY/TR[6]/TD[4]/INPUT[@value='on']")
	private WebElement Add5;
	@FindBy(xpath = "//input[@value='Create Tasks']")
	private WebElement CreateTasksBt;

	public TaskManagerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTask() {
		return task;
	}

	public WebElement getCreateNewTask() {
		return CreateNewTask;
	}

	public WebElement getCustomer() {
		return Customer;
	}

	public WebElement getProject() {
		return project;
	}

	public WebElement getTask1() {
		return Task1;
	}

	public WebElement getTask2() {
		return Task2;
	}

	public WebElement getTask3() {
		return Task3;
	}

	public WebElement getTask4() {
		return Task4;
	}

	public WebElement getTask5() {
		return Task5;
	}

	public WebElement getBillabel() {
		return billabel;
	}

	public WebElement getAdd1() {
		return Add1;
	}

	public WebElement getAdd2() {
		return Add2;
	}

	public WebElement getAdd3() {
		return Add3;
	}

	public WebElement getAdd4() {
		return Add4;
	}

	public WebElement getAdd5() {
		return Add5;
	}

	public WebElement getCreateTasksBt() {
		return CreateTasksBt;
	}

	
}
