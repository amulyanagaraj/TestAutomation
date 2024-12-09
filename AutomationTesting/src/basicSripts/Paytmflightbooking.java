package basicSripts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Paytmflightbooking {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tickets.paytm.com/flights/?utm_source=Google-ads&utm_medium=cpc&utm_campaign=G_Web_Search_Flight_Paytm-Brand&utm_content=Paytm_Flights&gad_source=1&gclid=EAIaIQobChMIjP7KoJ-NigMVfZZLBR3ZoQgrEAAYASAAEgLpzPD_BwE");
        driver.findElement(By.id("rt")).click();
        Thread.sleep(2000);
        WebElement from = driver.findElement(By.xpath("//span[@id='srcCode']"));
        from.clear();
        from.sendKeys("Bangalore");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[.='Bengaluru']")).click();
        WebElement dest = driver.findElement(By.xpath("//span[@id='destCode']"));
        dest.clear();
        dest.sendKeys("Delhi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[.='Delhi']")).click();
        LocalDate tmrw = LocalDate.now().plusDays(1);
        String depar = tmrw.format(DateTimeFormatter.ofPattern("dd/mm/yyyy"));
        driver.findElement(By.id("")).click();
        driver.findElement(By.xpath("")).click();
        
	}

}
