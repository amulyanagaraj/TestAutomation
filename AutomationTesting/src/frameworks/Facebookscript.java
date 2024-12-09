package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookscript 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		WebElement psw = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		usn.sendKeys("Amulya");
		psw.sendKeys("Amulya@971");
		driver.navigate().refresh();
		usn.sendKeys("Amulya");
		psw.sendKeys("Amulya@971");
		
	}

}
