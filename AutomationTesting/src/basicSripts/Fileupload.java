package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/amuly/Documents/Seleniumclass/Fileupload.html");
			WebElement fop = driver.findElement(By.id("f"));
			fop.sendKeys("C:\\Users\\amuly\\Documents\\Amulya Resume\\Amulya_7019.pdf");
			Thread.sleep(2000);
			driver.quit();
	}

}
