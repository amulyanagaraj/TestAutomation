package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script28 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/amuly/Documents/Seleniumclass/Multiple.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("Amulya");
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
	    mob.sendKeys("7019658998");
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("f2");
	    WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	    email.sendKeys("amulyanagaraj20@gmail.com");
	    
		
	}

}
