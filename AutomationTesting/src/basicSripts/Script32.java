package basicSripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script32 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for(int i = 0; i<count; i++)
		{
		WebElement link=links.get(i);
			String txt = link.getText();
			System.out.println(txt);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
