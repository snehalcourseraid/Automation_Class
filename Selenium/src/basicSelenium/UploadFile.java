package basicSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile 
{
public static void main(String[] args) throws Exception
{
	 System.setProperty("webdriver.chrome.driver", "D:\\Automation_Class_Data\\Drivers\\chromedriver.exe");
     
     ChromeDriver dr=new ChromeDriver();
     dr.manage().window().maximize();
     
     dr.get("file:///C:/Users/Anurag%20Dengre/Downloads/Practice.html");
     dr.findElement(By.id("Anand_file")).click();
      
     StringSelection cb=new StringSelection("D:\\Automation_Class_Data\\Automation_Class\\Selenium\\src\\locators\\Library.java");
     
     
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);
     
     Robot robot=new Robot();
     Thread.sleep(3000);
     
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);

     Thread.sleep(3000);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     

     
     
     
}
}
