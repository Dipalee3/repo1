package DDF_POM_TESTNG_BASE_UTILITY_CLASS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass  {

	public static String getPropertyFileData(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\credential.properties");
		obj.load(objfile);
		String value = obj.getProperty("url");
		return value;

	}

	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException  {
		FileInputStream files = new FileInputStream("C:\\Automation\\Excel Sheet\\KiteCredentials.xlsx");
		Sheet sh = WorkbookFactory.create(files).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return null;
	
	}
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   File dest = new File("C:\\Automation\\Screenshot"+TCID+".png");
	 FileHandler.copy(src, dest);

	}
	
}
