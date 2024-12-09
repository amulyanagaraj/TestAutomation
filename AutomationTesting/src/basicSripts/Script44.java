package basicSripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script44 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s= new Select(ele);
		List<WebElement> month = s.getOptions();
		int a = month.size();
		System.out.println(a);
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 0; i < a; i++)
		{
		WebElement b = month.get(i);
		String c = b.getText();
		arr.add(c);
		// System.out.println(c);
		}
		Collections.sort(arr, Collections.reverseOrder());
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
