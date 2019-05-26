package logicTest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuration.Config;
import utilities.Xls_Reader;

public class dataproviderconcept 
{
   @Test(dataProvider="getdata2")
   public void loginTest(String username, String password)
   {
	   System.out.println("Enter username"+ username);
	   System.out.println("Enter password"+password);
	   System.out.println("Login successful");
	   System.out.println("************************************");
   }
   @DataProvider
   public String[][] getdata()
   {
	   String[][] data=new String[3][2];
	   data[0][0]="user1";
	   data[0][1]="password1";
	   
	   data[1][0]="user2";
	   data[1][1]="password2";
	   
	   data[2][0]="user3";
	   data[2][1]="password3";
	   
	   return data;
   }	   
	   @DataProvider
	   public String[][] getdata2() throws IOException
	   {
		   Xls_Reader xl=new Xls_Reader(Config.testData);
	          
	          int rows=xl.getrowcount("TestData");
	          
	          int cols=xl.getColumncount("TestData");
	          
	        		  String [][] data=new String[rows-1][cols];
	        		  
	                  for(int r=2;r<=rows;r++ )
	                  {
	                	  for(int c=1;c<=cols;c++)
	                	  {
	                		  data[r-2][c-1]=xl.getCellData("TestData", r, c);
	                	  }
	                  }
					return data;
		   }

}
