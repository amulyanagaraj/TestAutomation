package basicSripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadpopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.busonlineticket.com/");
		driver.findElement(By.id("txtOrigin")).click();
		WebElement ori = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[7]"));
		ori.click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtDestination")).click();
		WebElement dest1 = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[8]"));
		dest1.click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.id("txtDepartDate"));
		date.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='22']")).click();
		WebElement sub = driver.findElement(By.id("btnBusSearchNew"));
		sub.click();
		Thread.sleep(2000);
		driver.findElement(By.id("XB27622350")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='7C'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='8C'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[.='Proceed'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']")).sendKeys("Amulya");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']")).sendKeys("9019889837");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']")).sendKeys("amulyanagaraj@gmail.com");
		driver.quit();
	}

}
