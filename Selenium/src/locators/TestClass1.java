package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Class_Data\\Drivers\\chromedriver.exe");
	       
	       ChromeDriver dr=new ChromeDriver();
	       dr.manage().window().maximize();
	       
	       dr.get("http://newtours.demoaut.com/");
	       
	       
	       //Css selectors
	      /* dr.findElement(By.cssSelector("input[name='userName']")).sendKeys("abcdss");
	       
	       dr.findElement(By.cssSelector("input[name='password']")).sendKeys("shdg");
	       dr.findElement(By.name("login")).click();*/
	       
	       //Link text and partial link
	       
	       //dr.findElement(By.linkText("REGISTER")).click();
	       
	       //partial link text
	       
	       //dr.findElement(By.partialLinkText("GIST")).click();
	       
	       //Xpath
	       
	       String w=dr.findElement(By.xpath("//img[@src='/images/banner2.gif']")).getAttribute("width");
	       
	       String h=dr.findElement(By.xpath("//img[@src='/images/banner2.gif']")).getAttribute("height");
	       
	       System.out.println(w);
	       System.out.println(h);
	       
	       
	}

}
