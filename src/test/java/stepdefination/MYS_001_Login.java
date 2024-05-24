package stepdefination;

import org.stat.Stat;

import com.pojo.myss.MYS_001_Login_pojo;

import browser.common.BrowserCommon;
import commonUtils.msk.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MYS_001_Login {

	@Given("user open website")
	public void user_open_website() throws Throwable {
//		CommonStepDef.login();
	   BrowserCommon.getDriver().get(Stat.APP_URL);
	  
	   MYS_001_Login_pojo.getInstance().getAccount().click();
	   Utility.implicitlyWait(3);
//	   MYS_001_Login_pojo.getInstance().getloginAccount().click();
		   	   
	}
	
	
	  @When("the user enter the valid username\\/email id") public void
	  the_user_enter_the_valid_username_email_id() {
		  MYS_001_Login_pojo.getInstance().getHomepageemailfield().sendKeys(Stat.UsernName);  
		  Utility.scrollUpandDownusingCoordinates(0, 300);
	  }
	  
	  @When("the user enter the valid password") public void
	  the_user_enter_the_valid_password() { 
		  MYS_001_Login_pojo.getInstance().getHomepagepasswordfield().sendKeys(Stat.Password);
	  }
	  
	  @When("the user clicks the login button") public void
	  the_user_clicks_the_login_button() { 
		   MYS_001_Login_pojo.getInstance().getHomepageloginbutton().click();
	  }
	  
	  @Then("myshop website open successfully with valid username and password")
	  public void
	  myshop_website_open_successfully_with_valid_username_and_password() { 
		  
		  Utility.assertequalsbase(MYS_001_Login_pojo.getInstance().getaccountVerify(), "johnwhite");
	  }
	 
}
