package mvnproject.udemy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.pglogin;

public class login extends browser {
	
	
	@Test
	public void first() throws IOException
	{
		dr=browserselect();
		dr.manage().window().maximize();
		dr.get(ps.getProperty("url"));
		pglogin ln=new pglogin(dr);
		ln.user().sendKeys(ps.getProperty("username"));
		ln.pass().sendKeys(ps.getProperty("password"));
		ln.login().click();	
		common ca=new common();
		String company=ps.getProperty("company");
		ca.company(dr, company);
		ca.accsele(dr, ps.getProperty("account"));
		
	}
	
	/*@AfterTest
	public void close()
	{
		dr.close();
	}*/

}
