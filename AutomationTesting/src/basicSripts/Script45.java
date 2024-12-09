package basicSripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script45 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement ele = driver.findElement(By.id("select-multiple-native"));
		WebElement but = driver.findElement(By.xpath("//button[.='Add']"));
		Select opt = new Select(ele);
		// if(opt.isMultiple())
		{
			opt.selectByValue("Running Shoes");
			opt.selectByValue("Winter Coat");
			opt.selectByValue("Casual Pants");
			opt.selectByValue("Formal Shoes");
			opt.selectByValue("Leather Jacket");

			
		}
		but.click();
		

	}

}
