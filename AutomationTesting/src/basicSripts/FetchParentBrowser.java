package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchParentBrowser 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	driver.findElement(By.id("browserButton2")).click();
	Thread.sleep(2000);
	String pid = driver.getWindowHandle();
	System.out.println(pid);
	Thread.sleep(2000);
    driver.quit();
}
}
