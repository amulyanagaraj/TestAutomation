package basicSripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotTask {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Date d = new Date();
		String d1 = d.toString().replace(":", "-");
		System.out.println(d1);
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		int  count= links.size();
		for(int i = 0; i<count; i++)
		{
			WebElement link = links.get(i);
			//String ele = link.getAttribute("href");
			//System.out.println(ele);
			File temp = link.getScreenshotAs(OutputType.FILE);
			File perm = new File("./Screenshots/"+ i  +"links.png");
		    FileHandler.copy(temp, perm);
		   }
		
		

	}

}
