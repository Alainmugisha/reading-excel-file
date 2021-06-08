package testingDrivers;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	
	@Test
	public static void init() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Alain mugisha/Desktop/WebDrivers/chromedriver 5");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		excelreader();
		
		
	}
	
	
	public static void excelreader() {
		
		
		try {
			  // Specify the path of file
			  File src=new File("/Users/Alain mugisha/Desktop/Eclipse(new workspace)/testingDrivers/excel.xlsx");
			 
			   // load file
			   FileInputStream fis=new FileInputStream(src);
			 
			   // Load workbook
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   
			   // Load sheet- Here we are loading first sheetonly
			      XSSFSheet sh1= wb.getSheetAt(0);
			 
			  // getRow() specify which row we want to read.
			 
			  // and getCell() specify which column to read.
			  // getStringCellValue() specify that we are reading String data.
			 
			 
			 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			 
			 
			 System.out.println(sh1.getRow(2).getCell(3).getStringCellValue());
			 
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
			  
			 }
			 
				
		
	}
	
	
	
	
	

