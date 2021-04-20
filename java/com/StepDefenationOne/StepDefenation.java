package com.StepDefenationOne;

import com.test.PageAction.PageAction;
import com.test.Utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenation extends TestBase {
	PageAction action = new PageAction();

	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
		getURL(URL);
	   
	}
	
	@When("^Click On Signin Link$")
	public void click_On_Sign_in_Link() throws Throwable {
		action.Click_On_Signin_Link();    
	}

	@When("^Enter Email address$")
	public void enter_Email_address() throws Throwable {
	  action.Enter_Email_address();
	}

	@Then("^Click on Create an account Button$")
	public void click_on_Create_an_account_Button() throws Throwable {
	   action.Click_on_Create_an_account_Button(); 
	}

	@Then("^Click on Title Redio Button$")
	public void click_on_Title_Redio_Button() throws Throwable {
	   action.Click_on_Title_Redio_Button();
	}

	@Then("^Enter YOUR PERSONAL INFORMATION \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_YOUR_PERSONAL_INFORMATION(String CustomerFirstName, String CustomerLastName, String CustomerEmail, String Password) throws Throwable {
		action.Enter_YOUR_PERSONAL_INFORMATION();
	}

	@Then("^Select DropDown Date of Birth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void select_DropDown_Date_of_Birth(String DrpDay, String DrpMonth, String DrpYear) throws Throwable {
	   action.Select_DropDown_Date_of_Birth();
	}

	@Then("^Enter YOUR ADDRESS \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_YOUR_ADDRESS(String Firstname, String Lastname, String Address, String City, String PostalCode, String MobileNumber, String Alias) throws Throwable {
	   action.Enter_YOUR_ADDRESS(); 
	}

	@Then("^Select DropDown State \"([^\"]*)\"$")
	public void select_DropDown_State(String  DrpState) throws Throwable {
	   action.Select_DropDown_State(); 
	}

	@Then("^Select DropDown Country \"([^\"]*)\"$")
	public void select_DropDown_Country(String DrpCountry) throws Throwable {
	   action.Select_DropDown_Country(); 
	}

	@Then("^Click on Register Button$")
	public void click_on_Register_Button() throws Throwable {
	   action.Click_on_Register_Button(); 
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	   action.Enter_Password();
	}

	@Then("^Click on Sign in Button$")
	public void click_on_Sign_in_Button() throws Throwable {
	   action.Click_on_Sign_in_Button(); 
	}

	@Then("^Display Authentication Failed$")
	public void display_Authentication_Failed() throws Throwable {
	   action.Display_Authentication_Failed();
	}
	
	
	
	
	
}
