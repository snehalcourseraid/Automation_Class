package advanceSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.Library;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException 
	{
        Library lib=new Library();
        
        WebDriver dr=lib.launchBrowser("https://www.flipkart.com/");
        //Implicit wait
        dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        
        Actions act=new Actions(dr);
        
        //a[text()='Top wear']//following::a[text()='Shirts']
      //span[text()='Men']//following::a[text()='Top wear']//following::a[text()='Shirts']
      //span[text()='Men']//following::a[text()='Kurtas']//preceding::a[text()='Shirts']
      //a[text()='Kurtas']//parent::li//preceding-sibling::li/a[text()='Shirts']
        act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
        
        //Explicit wait
       //WebDriverWait wait=new WebDriverWait(dr,50);
        
        //wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts"))));
        
        dr.findElement(By.xpath("//a[text()='Shirts']")).click();
        
        //Drag and drop
        Thread.sleep(2000);
        act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();
        
        Thread.sleep(2000);
        act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")), -50, 0).build().perform();
        
        String parent=dr.getWindowHandle();
        System.out.println(parent);
        
        Thread.sleep(3000);
        
        dr.findElement(By.xpath("(//img[@class='_3togXc'])[2]")).click();
        
        Set<String>wins=dr.getWindowHandles();
        for(String w:wins)	
        {
        	if(!w.equals(parent))
            dr.switchTo().window(w);

        }
        Thread.sleep(3000);
        dr.findElement(By.xpath("//a[text()='M']")).click();
        
        Thread.sleep(3000);
        dr.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("411006");
        
        //Scroll down
        
        JavascriptExecutor js=(JavascriptExecutor) dr;
        
        WebElement ele= dr.findElement(By.xpath("//button[text()='ADD TO CART']"));
        js.executeScript("arguments[0].scrollIntoView();", ele);
        
        Thread.sleep(3000);
        //it is used to execute java script functions
        dr.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
        Thread.sleep(3000);
        dr.findElement(By.xpath("//button[@class='_2AkmmA iwYpF9 _7UHT_c']")).click();
        
        dr.findElement(By.xpath("(//input[@class='_2zrpKA _3v41xv _14H79F'])[1]")).sendKeys("snehal.dengre@aol.com");
        dr.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _14H79F']")).sendKeys("anurag69");
        
        
	}

}
