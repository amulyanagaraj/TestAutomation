package basicSripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script03 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	FirefoxDriver driver1 = new FirefoxDriver();
	}

}
