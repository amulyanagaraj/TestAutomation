package basicSripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script43 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/amuly/Documents/Seleniumclass/dropdown.html");
		WebElement dd = driver.findElement(By.id("Celebrities"));
		Select s = new Select(dd);
		List<WebElement> opts = s.getOptions();
		int optscount = opts.size();
		System.out.println(optscount);
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 0; i< optscount ; i++)
		{
		WebElement opt = opts.get(i);
		String text = opt.getText();
		arr.add(text);
		//System.out.println(text);
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
