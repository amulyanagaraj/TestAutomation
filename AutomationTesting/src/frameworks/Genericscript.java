package frameworks;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genericscript
{
	WebDriver driver;
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 driver = new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.facebook.com/");
		
	}
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
		
	}


