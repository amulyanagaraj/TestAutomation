package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9919168,77.5524907,14z?entry=ttu&g_ep=EgoyMDI0MTAxNi4wIKXMDSoASAFQAw%3D%3D");
		WebElement ele = driver.findElement(By.xpath("//input[@id='searchboxinput']"));
		Thread.sleep(2000);
		ele.sendKeys("Qspiders Rajajinagar");
		WebElement ele1 = driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']"));
		Thread.sleep(2000);
		ele1.click();
	}

}
