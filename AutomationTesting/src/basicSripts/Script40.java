package basicSripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script40 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("./TestData/FaceBookCredentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFRow row1 = sheet.getRow(2);
		Thread.sleep(2000);
		XSSFCell cel = row.getCell(0);
		XSSFCell cel1 = row.getCell(1);
		String val = cel.getStringCellValue();
		System.out.println(val);
		String val1 = cel1.getStringCellValue();
		System.out.println(val1);
		workbook.close();
		fis.close();
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.id("email"));
		usn.sendKeys(val);
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys(val1);
		Thread.sleep(2000);
		WebElement lg = driver.findElement(By.name("login"));
		lg.click();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
