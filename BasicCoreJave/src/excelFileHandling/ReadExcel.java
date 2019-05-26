package excelFileHandling;

import java.io.FileInputStream;

/*import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;*/
import org.apache.poi.hssf.usermodel.*;


public class ReadExcel {

	public static void main(String[] args) throws Exception 
	{
      //FileInputStream file=new FileInputStream("D:\\Automation_Class_Data\\Automation_Class\\BasicCoreJave\\src\\excelFileHandling\\TestData.xls");
      FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\excelFileHandling\\TestData.xls");
      HSSFWorkbook wb=new HSSFWorkbook(file);
      HSSFSheet sheet= wb.getSheet("Sheet1");
      
     
      
     
      
      HSSFRow row=sheet.getRow(1);
      
      
      
      row.getLastCellNum();
      
      HSSFCell cell=row.getCell(0);
      String val=cell.getStringCellValue();
      
      System.out.println(val);
      int rows=sheet.getLastRowNum();
      System.out.println(rows);
      int cols=row.getLastCellNum();
      System.out.println(cols);
      
      String val1=sheet.getRow(0).getCell(0).getStringCellValue();
      System.out.println(val1);
      
      for(int r=0;r<=rows;r++)
	   {
		   for(int c=0;c<cols;c++)
		   {
			   
			   String val2=sheet.getRow(r).getCell(c).getStringCellValue();
			   System.out.print(val2);
			  
		   }
		   
		   System.out.println();
	   }
      
     
	}

}


