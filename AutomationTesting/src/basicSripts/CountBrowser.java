package basicSripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountBrowser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.id("browserButton2")).click();
		Set<String> wins = driver.getWindowHandles();
		int count = wins.size();
		System.out.println(count);
		driver.quit();

	}
	

}
