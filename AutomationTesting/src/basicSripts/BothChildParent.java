package basicSripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BothChildParent {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.id("browserButton2")).click();
		Thread.sleep(2000);
		Set<String> wins = driver.getWindowHandles();
		for(String win : wins)
		{
			System.out.println(win);
		}
		driver.close();
	}

}
