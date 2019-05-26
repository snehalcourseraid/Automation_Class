package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import configuration.Config;
import logicTest.ApplicationLibraries;
import pages.HomePage;
import utilities.Xls_Reader;

public class TestScript1 
{
	
	@Test(dataProvider="getdata2")
	
	
	public void loginTest(String username, String password, String title)
	{
		SoftAssert asser=asser=new SoftAssert();
		ApplicationLibraries lib=new ApplicationLibraries();
		
		//LaunchBrowser
		WebDriver dr=lib.launchBrowser();
		
		HomePage page1=new HomePage(dr);
		
		//Login
		
		page1.login(username, password);
		/*System.out.println(title);
		
		System.out.println(dr.getTitle());
		System.out.println("************************");*/
		
		/*Assert.assertEquals(dr.getTitle(), title);   Hard assertion*/
		
		asser.assertEquals(dr.getTitle(), title);
		
		dr.quit();
		asser.assertAll();
		
	}
	
	/*@AfterClass 
	public void teardown()
	{
		asser.assertAll();
	}*/
	
	
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