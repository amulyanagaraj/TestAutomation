package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.cssSelector("input[name='search_query']"));
		Thread.sleep(3000);
		search.sendKeys("songs");
		WebElement ele = driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
		Thread.sleep(3000);
		ele.click();
		

	}

}
