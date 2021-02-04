package stepdefinitions;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Loginpage;

public class Steps {
	
	
public static WebDriver driver;
public static Logger logger;
	public static Loginpage lp;
	
		// Login Steps
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		lp=new Loginpage(driver);
	 
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String URL) {
		 driver.manage().window().maximize();			
 			driver.get(URL);
			
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String Email, String Password) {
	 
		lp.setemailid(Email);
		lp.setPassword(Password);
	}

	@When("Click on Login")
	public void click_on_Login() {
	    lp.clickSignin();
	   
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
		
		if(driver.getTitle().equals("Login - My Store")) 
		{
		 	
		
			System.out.println("Login Test Passed");
						
		}
			     else {
			    	   	
								System.out.println("Login Test Failed");
					}
	
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		lp.clicksignout();
		   
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	   
	}



}
