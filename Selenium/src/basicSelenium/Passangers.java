package basicSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Passangers {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation_Class_Data\\Drivers\\chromedriver.exe");
	       
	       ChromeDriver dr=new ChromeDriver();
	       dr.manage().window().maximize();
	       
	       dr.get("http://newtours.demoaut.com/");
	       
	       dr.findElement(By.name("userName")).sendKeys("mercury");
	       dr.findElement(By.name("password")).sendKeys("mercury");
	       dr.findElement(By.name("login")).click();
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
	       
	       FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\basicSelenium\\TestData.xls");
	       HSSFWorkbook wb=new HSSFWorkbook(file);
	       HSSFSheet sheet= wb.getSheet("Sheet2");
	       
	       String firstname=sheet.getRow(1).getCell(0).getStringCellValue();
	       dr.findElement(By.name("passFirst0")).sendKeys(firstname);
	       
	       String lastname=sheet.getRow(1).getCell(1).getStringCellValue();
	       dr.findElement(By.name("passLast0")).sendKeys(lastname);
	       
	       String ccnumber=sheet.getRow(1).getCell(2).getStringCellValue();
	       dr.findElement(By.name("creditnumber")).sendKeys(ccnumber);
	       
	       dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
	       
	       String expresult=dr.findElement(By.xpath("//font[contains(text(),'itinerary has been booked!'")).getText();
	       {
	    	   System.out.println(expresult);
	       }
	       String result=sheet.getRow(1).getCell(3).getStringCellValue();
	       {
	    	   System.out.println(result);
	       }
	       
	      /* if(expresult==result)
	       {
	    	   System.out.println("Pass");   
	       }else {
	    	   System.out.println("Fail");
	       }*/
	       
	       
	       System.out.println("End Of Flight Booking");
	       
	}

}
