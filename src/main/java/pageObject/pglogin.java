package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pglogin {

	WebDriver driver;
	By user=By.id("user_name_id");
	By pass=By.id("password_id");
	By login=By.id("btnLogin");
	By company=By.id("company_id");
	
	public pglogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement user()
	{
		return driver.findElement(user);
	}
	
	public WebElement pass()
	{
		return driver.findElement(pass);
		
	}
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	public WebElement company()
	{
		return driver.findElement(company);
	}
}
