package mvnproject.udemy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
	public WebDriver dr;
	Properties ps;

	public WebDriver browserselect() throws IOException
	{
		ps=new Properties();
		FileInputStream fs= new FileInputStream("D:\\selenium_code\\udemy\\src\\main\\java\\mvnproject\\udemy\\details.properties");
	ps.load(fs);
	String brow=ps.getProperty("browser");
	if(brow.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 dr=new ChromeDriver();
		
	}
	else if(brow.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		dr=new FirefoxDriver();
		
	}
	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return dr;
	}
	
	public void getScreenShotPath(String testCaseName,WebDriver dr) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) dr;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(dest));
		
	}
}
