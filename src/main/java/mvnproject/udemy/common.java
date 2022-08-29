package mvnproject.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class common {
	
	//Company selection
	public void company(WebDriver driver,String ele)
	{
		Select win=new Select(driver.findElement(By.id("company_id")));
		win.selectByVisibleText(ele);
		//win.deselectByVisibleText(ele);	
	}
	
	
	//Account selections
	public void accsele(WebDriver driver, String ele)
	{
	
		driver.findElement(By.partialLinkText(ele)).click();
	}

	public void test()
	{
		System.out.println("testing git functionality");
	}
}
