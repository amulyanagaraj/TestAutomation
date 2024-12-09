package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script29 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement f1 = driver.findElement(By.xpath("(//iframe)[1]"));
		Thread.sleep(2000);
		driver.switchTo().frame(f1);
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("amulya20gmail.com");
		Thread.sleep(2000);
		WebElement psw = driver.findElement(By.xpath("//input[@type='password']"));
		psw.sendKeys("12345678");
		WebElement confirm = driver.findElement(By.xpath("//input[@id='confirm-password']"));
		confirm.sendKeys("12345678");
		driver.switchTo().defaultContent();
		WebElement f2 = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(f2);
		WebElement usn = driver.findElement(By.xpath("//input[@name='username']"));
		usn.sendKeys("qspider");
		WebElement psw1 = driver.findElement(By.xpath("//input[@name='password']"));
		psw1.sendKeys("admin@123");
		

	}

}
