package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script26 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://106.51.87.42:9007/");
		WebElement usn = driver.findElement(By.id("email"));
		usn.sendKeys("Fresher@gmail.com");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Fresher@2024");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(4000);
		WebElement pat = driver.findElement(By.xpath("//span[text()='Patient']"));
		pat.click();
		WebElement add = driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
		add.click();
		Thread.sleep(4000);
		WebElement fn = driver.findElement(By.xpath("//input[@type='text' and @name='name']"));
		fn.sendKeys("Amulya");
		Thread.sleep(4000);
		WebElement email = driver.findElement(By.xpath("//input[@type='email' ]"));
		email.sendKeys("amulyanagaraj20@gmail.com");
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
		pw.sendKeys("Amulya@123");
		Thread.sleep(4000);
		WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
		sub.click();
		
	}
	

}
