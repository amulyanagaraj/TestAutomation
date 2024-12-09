package basicSripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Date d = new Date();
		String d1 = d.toString().replace(":", "-");
		System.out.println(d1);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Screenshots/Defect1.png");
		FileHandler.copy(temp, perm);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
