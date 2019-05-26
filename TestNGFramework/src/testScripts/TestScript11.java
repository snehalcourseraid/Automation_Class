package testScripts;

import org.testng.annotations.Test;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;

	import logicTest.ApplicationLibraries;
	import pages.HomePage;

	public class TestScript11
	{
		ChromeDriver dr=new ChromeDriver();
	  @BeforeSuite 
	  public void LaunchBrowser1()
		{
	      System.setProperty("webdriver.chrome.driver", "D:\\Automation_Class_Data\\Drivers\\chromedriver.exe");
	      
	      
	      dr.manage().window().maximize();
	      
	      dr.get("http://newtours.demoaut.com/");
			
		}
			
	  @BeforeTest
	  public void LoginFind()
	  {
		  
		  dr.findElement(By.name("userName"));
		  dr.findElement(By.name("password"));
		  
	  }
	  @BeforeMethod
	  public void LoginPage() throws InterruptedException
	  {
		  
		  dr.findElement(By.name("userName")).sendKeys("mercury");
	      dr.findElement(By.name("password")).sendKeys("mercury");
	      dr.findElement(By.name("login")).click();
	      
	  }
	  
	  @Test
	  public void Navigates() throws InterruptedException
	  {
	      dr.findElement(By.xpath("//input[@value='oneway']")).click();
	      Select sel=new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
	      sel.selectByIndex(2);
	      
	      Thread.sleep(2000);
	      
	      sel.selectByValue("2");
	      
	      Thread.sleep(2000);
	      
	      sel.selectByVisibleText("4");
	      
	      Select sel1=new Select(dr.findElement(By.xpath("//select[@name='fromPort']")));
	      sel1.selectByValue("London");
	      
	      Select sel2=new Select(dr.findElement(By.xpath("//select[@name='fromMonth']")));
	      
	      sel2.selectByValue("8");
	      
	      Select sel3=new Select(dr.findElement(By.xpath("//select[@name='fromDay']")));
	      
	      sel3.selectByValue("30");
	      
	      Select sel4=new Select(dr.findElement(By.xpath("//select[@name='toPort']")));
	      
	      sel4.selectByValue("Paris");
	      
	      Select sel5=new Select(dr.findElement(By.xpath("//select[@name='toMonth']")));
	      sel5.selectByValue("9");
	      
	      
	      Select sel6=new Select(dr.findElement(By.xpath("//select[@name='toDay']")));
	      sel6.selectByValue("3");
	      
	      dr.findElement(By.xpath("//input[@value='First']")).click();
	      
	      
	      Select sel8=new Select(dr.findElement(By.xpath("//select[@name='airline']")));
	      sel8.selectByVisibleText("Blue Skies Airlines");
	      
	      dr.findElement(By.xpath("//input[@name='findFlights']")).click();
	      
	      dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$360$270$5:03']")).click();
	      
	      dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	      
	      dr.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Snehal");
	      dr.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Dengre");   
	      
	      dr.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Anurag");
	      dr.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("Dengre");
	      
	      dr.findElement(By.xpath("//input[@name='passFirst2']")).sendKeys("Abhiraa");
	      dr.findElement(By.xpath("//input[@name='passLast2']")).sendKeys("Dengre");
	      
	      dr.findElement(By.xpath("//input[@name='passFirst3']")).sendKeys("Asha");
	      dr.findElement(By.xpath("//input[@name='passLast3']")).sendKeys("Dengre");
	      
	      dr.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("123456789");
	      
	    dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
	    
	    String text=dr.findElement(By.xpath("//font[contains(text(),'itinerary has been booked!'")).getText();
	    System.out.println(text);
	  }
	  
	  
	 @AfterMethod
	 public void Logout()
	 {
		 
		 
		 dr.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
		 
		 /*catch(Exception e)
		 {
			 dr.findElement(By.xpath("img[@src=/images/forms/home.gif']")).click();
		 }
		 */
	 }
	 @AfterTest
	 public void CloseConnections()
	 {
		 System.out.println("Connections closed");
	 }
	  @AfterSuite
	  public void Quit()
	  {
		 
		  dr.quit();
	  }
	}


