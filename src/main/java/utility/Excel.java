package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

public static String gettextdata(int row,int cell, String sheet) throws IOException
{
   FileInputStream file= new FileInputStream("D:\\Automation Testing\\KiteZerodha\\src\\test\\resources\\testdata.xlsx");	
   String value=WorkbookFactory.create(file).getSheet("datasheet").getRow(row).getCell(cell).getStringCellValue(); 	
   return value;
}

}
