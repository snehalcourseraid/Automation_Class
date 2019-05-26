package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import logicTest.ApplicationLibraries;
import pages.HomePage;

public class TestScriptC
{
	 @BeforeSuite 
	  public void LaunchBrowser()
	  {
		 ApplicationLibraries lib=new ApplicationLibraries();
			
			//LaunchBrowser
			WebDriver dr=lib.launchBrowser();
			
			HomePage page1=new HomePage(dr);
	  }
	 /*@BeforeTest*/
	 /*public void login(String username,String password)
	 {
		 page1.login(username, password);
	 }*/
	  
}
