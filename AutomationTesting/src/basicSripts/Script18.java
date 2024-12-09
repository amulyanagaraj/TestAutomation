package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script18 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("(//input[@id='name'])"));
		Thread.sleep(2000);
		name.sendKeys("Amulya");
		WebElement email = driver.findElement(By.xpath("(//input[@id='email'])"));
		Thread.sleep(2000);
		email.sendKeys("amulyanagaraj20@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("(//input[@id='password'])"));
		Thread.sleep(2000);
		pwd.sendKeys("Amulya123");
		WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])"));
		button.click();
				
		

	}

}
