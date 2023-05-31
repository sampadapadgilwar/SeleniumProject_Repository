package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WorkLib extends BaseTest
{
	public void acceptAlert()
	{
		driver.switchTo().alert();
	}
	public void dismissAlert()
	{
		driver.switchTo().alert().dismiss();
	}
	public void acceptConfirmation()
	{
		driver.switchTo().alert().accept();
	}
	public void dismissConfirmation()
	{
		driver.switchTo().alert().dismiss();
	}
	//handle mouse Action
	public void rightClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
	public void doubleClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
	}
	public void mouseHover(WebElement Target)
	{
		Actions act=new Actions(driver);
		act.moveToElement(Target).perform();
	}
	public void dragAndDrop(WebElement src,WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target);
	}
	//handle frame
	
	public void handleFrameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	public void  handleFrameByNameorId(String nameorid)
	{
		driver.switchTo().frame(nameorid);
	}
	public void  handleFrameByElement(WebElement target)
	{
		driver.switchTo().frame(target);
	}
}
