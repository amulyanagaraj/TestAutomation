package basicSripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sript02 {

	public static void main(String[] args)
	{
	String key = "webdriver.gecko.driver";
	String value = "./softwares/geckodriver.exe";
	System.setProperty(key, value);
	FirefoxDriver driver = new FirefoxDriver();
	}

}
