package basicSripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseParent
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String parent_browser = driver.getWindowHandle();
		Set<String> wins = driver.getWindowHandles();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.id("browserButton2")).click();
		Thread.sleep(2000);
		ArrayList<String> arr = new ArrayList<String>(wins);
		int count = arr.size();
		System.out.println(count);
		for(int i=0; i<count; i++)
		{
			String ele = arr.get(i);
			driver.switchTo().window(ele);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
		
		if(ele.equals(parent_browser))
		{
			driver.close();
		}
	}

	}
}
