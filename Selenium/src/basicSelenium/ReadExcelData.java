package basicSelenium;

import java.io.IOException;

public class ReadExcelData {

	public static void main(String[] args) throws IOException 
	{
          Xls_Reader xl=new Xls_Reader("D:\\Automation_Class_Data\\Automation_Class\\Selenium\\src\\basicSelenium\\TestData.xls");
          
          int rows=xl.getrowcount("Sheet1");
          
          System.out.println(rows);
          
          int cols=xl.getColumncount("Sheet1");
          
          System.out.println(cols);
          
          String str=xl.getCellData("Sheet1", 1, 1);
          System.out.println(str);
          
          String str2=xl.getCellData("Sheet1", 2, "surname");
          System.out.println(str2);
          
          xl.setCellData("Sheet1", "surname", 3, "xyz");
	}

}
