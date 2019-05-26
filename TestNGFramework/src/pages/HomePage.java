package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
  WebDriver dr;
  By username=By.name("userName");
  By password=By.name("password");
  By login=By.name("login");
  
  public HomePage(WebDriver dr)
  {
	  this.dr=dr;
  }
  
  public void login(String username,String password)
  {
	  dr.findElement(this.username).sendKeys(username);
	  dr.findElement(this.password).sendKeys(password);
	  dr.findElement(login).click();
  }
  
  
}
