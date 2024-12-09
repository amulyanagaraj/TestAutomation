package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script05 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.name("email"));
		ele.sendKeys("Amulya_nagaraj");
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.id("pass"));
		a.sendKeys("Amulya@7019");
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.name("login"));
		b.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
