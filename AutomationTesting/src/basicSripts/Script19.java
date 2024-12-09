package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script19 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.xpath("(//button[@id='btn'])"));
		Thread.sleep(2000);
		b.click();
		WebElement b1 = driver.findElement(By.xpath("(//button[@id='btn3'])"));
		Thread.sleep(2000);
		b1.click();
		WebElement b2 = driver.findElement(By.xpath("(//button[@id='btn4'])"));
		Thread.sleep(2000);
		b2.click();
		WebElement b3 = driver.findElement(By.xpath("(//button[@id='btn5'])"));
		Thread.sleep(2000);
		b3.click();
		WebElement b4 = driver.findElement(By.xpath("(//button[@id='btn6'])"));
		Thread.sleep(2000);
		b4.click();
		WebElement b5 = driver.findElement(By.xpath("(//button[@id='btn7'])"));
		Thread.sleep(2000);
		b5.click();
		WebElement b6 = driver.findElement(By.xpath("(//button[@id='btn8'])"));
		b6.click();
		driver.quit();
		
	}

}
