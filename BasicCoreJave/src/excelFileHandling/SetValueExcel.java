package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetValueExcel {

	public static void main(String[] args) throws Exception 
	
	
	{
		 String path=System.getProperty("user.dir")+ "\\src\\excelFileHandling\\TestData.xls";
		  FileInputStream file=new FileInputStream(path);
	      HSSFWorkbook wb=new HSSFWorkbook(file);
	      HSSFSheet sheet= wb.getSheet("Sheet1");
	      
	      HSSFRow row=sheet.getRow(0);
	      
	      if(row==null)
	    	  row=sheet.createRow(55);
	      
	      HSSFCell cell=row.getCell(55);
	      
	      if(cell==null)
	    	  cell=row.createCell(1);
	      
	      cell.setCellValue("Snehal");
	      
	      FileOutputStream fileOut=new FileOutputStream(path);
	      
	      wb.write(fileOut);
	      
	      fileOut.close();
	      
	      String val1=sheet.getRow(0).getCell(0).getStringCellValue();
	      System.out.println(val1);
          
	      
	       
	}

}
