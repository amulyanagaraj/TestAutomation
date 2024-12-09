package basicSripts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreTheLinks {

	public static void main(String[] args) throws IOException
	{

		
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			List<WebElement> ele = driver.findElements(By.xpath("//a"));
			int noOfText = ele.size();
			XSSFWorkbook book = new XSSFWorkbook();
			 XSSFSheet sheet = book.createSheet("Flipkart text");
			 for(int i = 0; i<noOfText; i++)
			 {
				WebElement text = ele.get(i); 
				String url = text.getText();
			    XSSFRow row = sheet.createRow(i);
			    XSSFCell cel = row.createCell(0);
			    cel.setCellValue(url);
			 }
			 FileOutputStream fos = new FileOutputStream("./Testdata/Flipkarttext.xlsx");
			 book.write(fos);
			 book.close();
			 fos.close();

		}

	


	

}
