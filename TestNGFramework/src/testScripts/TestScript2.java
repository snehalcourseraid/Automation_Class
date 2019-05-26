package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import configuration.Config;
import logicTest.ApplicationLibraries;
import pages.FlightFinder;
import pages.HomePage;
import utilities.Xls_Reader;

public class TestScript2 
{
	@Test (dataProvider="getdata2")
	public void onewayFlightBooking(String username, String password, String OnewayFlightBooking, String ServiceClass)
	{
		SoftAssert asser=asser=new SoftAssert();
		ApplicationLibraries lib=new ApplicationLibraries();
		
		//LaunchBrowser
		WebDriver dr=lib.launchBrowser();
		
		HomePage page1=new HomePage(dr);
		
		//Login
		
		page1.login(username, password);
		
		//Book Flight
		
		FlightFinder flightfinderpage=new FlightFinder(dr);
		flightfinderpage.clickOneWay();
		flightfinderpage.clickcontinuebtn();
		
		/*System.out.println(title);
		
		System.out.println(dr.getTitle());
		System.out.println("************************");*/
		
		/*Assert.assertEquals(dr.getTitle(), title);   Hard assertion*/
		
		/*asser.assertEquals(dr.getTitle(), title);*/
		
		/*dr.quit();*/
		asser.assertAll();
	}
		 @DataProvider
		   public String[][] getdata2() throws IOException
		   {
			   Xls_Reader xl=new Xls_Reader(Config.testData);
		          
		          int rows=xl.getrowcount("OnewayFlightBooking");
		          
		          int cols=xl.getColumncount("OnewayFlightBooking");
		          
		        		  String [][] data=new String[rows-1][cols];
		        		  
		                  for(int r=2;r<=rows;r++ )
		                  {
		                	  for(int c=1;c<=cols;c++)
		                	  {
		                		  data[r-2][c-1]=xl.getCellData("OnewayFlightBooking", r, c);
		                	  }
		                  }
				return data;
}
		
	
	
}
