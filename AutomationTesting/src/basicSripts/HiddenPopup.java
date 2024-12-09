package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[.='Date']")).click();
		driver.findElement(By.xpath("//span[.='26']")).click();
		
		

	}

}
