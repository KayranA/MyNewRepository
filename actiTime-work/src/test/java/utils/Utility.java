package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	private WebDriver driver;
	public static String fetchDataFromExcelSheet(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		
		String path = "F:\\Apeksha.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		String data = "";
		Workbook w = WorkbookFactory.create(file);	
		try {    
		       data = w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		    }
		catch(IllegalStateException e) 
		    {
			     double value = w.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
			      data = Double.toString(value);
		    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return data;
		
	}
	
	public static void captureScreenshot(WebDriver driver, String testID) throws IOException
	{

		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("ddMMyyyy-hhmmss").format(new Date());
		File dest = new File("D:\\JAVA\\JAVA ALL\\WebElements\\Test"+testID+timestamp+".jpg");
		
		FileHandler.copy(source, dest);
	}


}
