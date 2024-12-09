package basicSripts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script33 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/amuly/Documents/Seleniumclass/checkbox.html");
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = check.size();
		for(int i=0; i<count; i=i+2)
		{
		WebElement	ele=check.get(i);
		ele.click();
					
		}
		Thread.sleep(2000);
		for(int i=count-1; i>=0; i--)
		{
			if(i%2==0)
			{
			WebElement	ele1=check.get(i);
			ele1.click();
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
