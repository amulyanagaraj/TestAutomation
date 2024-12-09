package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script27 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/signup");
		WebElement fn = driver.findElement(By.xpath("//input[@value='Amulya']"));
		fn.sendKeys("Amulya");
		Thread.sleep(4000);
		WebElement ln = driver.findElement(By.xpath("//input[@name='Last Name']"));
		ln.sendKeys("Nagaraj");
		Thread.sleep(4000);
		WebElement gn = driver.findElement(By.xpath("//input[@value='FEMALE']"));
		gn.click();
		

	}

}
