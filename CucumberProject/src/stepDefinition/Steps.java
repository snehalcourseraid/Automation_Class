package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps
{
	WebDriver dr;
	@Given("^application is up and running$")
	public void application_is_up_and_running() 
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation_Class_Data\\Drivers\\chromedriver.exe");
	       
	       dr= new ChromeDriver();
	       dr.manage().window().maximize();
	       
	       dr.get("http://newtours.demoaut.com/");
	       
	      
	    System.out.println("Application is up and running");
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials()
	{
		   dr.findElement(By.name("userName")).sendKeys("mercury");
	       dr.findElement(By.name("password")).sendKeys("mercury");
	       dr.findElement(By.name("login")).click();
		System.out.println("I enter valid credentials");
	}

	@Then("^next page\"(.*?)\" is displayed$")
	public void next_page_is_displayed()
	{
      System.out.println(dr.getTitle());
      System.out.println("next page Flight finder is displayed");
	}

}
