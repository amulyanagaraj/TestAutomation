package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script17 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/amuly/Documents/Seleniumclass/Selected.html");
		WebElement cb = driver.findElement(By.xpath("(//input[@type='checkbox'])"));
		if(cb.isDisplayed())
		{
			if(cb.isEnabled())
			{
				if(cb.isSelected())
				{
					System.out.println("It is selected");
					cb.click();
				}
				else
				{
					System.out.println("It is not selected");
				}
			}
			else
			{
				System.out.println("It is disabled");
			}
		}
		else
		{
			System.out.println("It is not displyed");
		}

	}

}
