package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.className("Pke_EE"));
        search.sendKeys("iphone 15");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
       
	}

}
