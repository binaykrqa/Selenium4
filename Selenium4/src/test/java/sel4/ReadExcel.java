package sel4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

public static void main(String[] args) throws Exception {
	
	File src=new File("D:\\NewDownloads\\TestData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	//Creating a Sheet object using the sheet Name
    XSSFSheet sheet1=wb.getSheet("Sheet1");
    
    //Creating a row object to retrieve row at index 0
    XSSFRow row1=sheet1.getRow(0);
    //Creating a cell object to retrieve cell at index 0
    XSSFCell cell1=row1.getCell(0);
    
    //Get the address in a variable
    String address1= cell1.getStringCellValue();
    
    //Printing the address
    System.out.println("Address is :"+ address1);
    
    
}

}
