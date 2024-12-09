package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	    Thread.sleep(1000);
		
		WebElement link = driver.findElement(By.xpath("//a[.='Facebook']"));
		Point a = link.getLocation();
		int x = a.getX();
		int y = a.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		//System.out.println(x);
		//System.out.println(y);
		Thread.sleep(2000);
		link.click();

	}

}
