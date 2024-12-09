package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script04 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/amuly/Documents/Seleniumclass/Instagram.htm");
		WebElement ele = driver.findElement(By.id("t1"));
		ele.sendKeys("Amjdsh");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.name("n1"));
		ele1.sendKeys("gshgfjsg");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.className("c1"));
		ele2.sendKeys("sgjefssfh");
		Thread.sleep(2000);
		ele.clear(); 
		WebElement ele3 = driver.findElement(By.linkText("Instagram 2024"));
		ele3.click();
		Thread.sleep(2000);
		driver.quit();
	}		
		
		
		

}
