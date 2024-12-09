package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script38 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/amuly/Documents/Seleniumclass/dropdown.html");
		WebElement dd = driver.findElement(By.id("Celebrities"));
		Select s = new Select(dd);
		if(s.isMultiple())
		{
			System.out.println("The dropdown is multi select");
		}
		else
		{
			System.out.println("The dropdown is single select");
		}
		Thread.sleep(1000);
		driver.quit();

	}

}
