package locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebtable2 {

	public static void main(String[] args) 
	{
		Library lib=new Library();
		WebDriver dr=lib.launchBrowser();
		
	List<WebElement>Rowslist=dr.findElements(By.xpath("//table[@border='2']/tbody/tr"));
	
	for(WebElement e:Rowslist)	
	{
	    List<WebElement>cols=e.findElements(By.tagName("td"));
	    for(WebElement c:cols)
	    {
		System.out.println(c.getText());
	    }
	}
	
	}

}
