package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script16 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/amuly/Documents/Seleniumclass/Selected.html");
		WebElement usn = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		if(usn.isDisplayed())
		{
			if(usn.isEnabled())
			{
				usn.sendKeys("Amulya");
			}
			else
			{
				System.out.println("USN is disabled");
			}
		}
		else
		{
			System.out.println("USN is not displayed");
		}
		
		

	}

}
