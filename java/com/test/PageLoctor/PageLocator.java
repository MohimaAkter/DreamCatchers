package com.test.PageLoctor;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.test.Utils.TestBase;

public class PageLocator extends TestBase{

	public PageLocator() {		
		PageFactory.initElements(driver, this);
	}
	// for Sign in Link
	@FindBy(how=How.XPATH,using="//a[@class='login']")
	public WebElement SigninLink;
	
	// for create an email
	@FindBy(how=How.ID,using="email_create")
	public WebElement CreateEmail;
	
	//for Submit Create button
	@FindBy(how=How.XPATH,using="//input[@name='SubmitCreate']")
	public WebElement CreateAnAccountButton;
	
	//for Radio Button
	@FindBy(how=How.ID,using="id_gender2")
	public WebElement Title;
	
	//For Customer Information
	@FindBy(how=How.ID,using="customer_firstname")
	public WebElement CustomerFirstName;
	@FindBy(how=How.ID,using="customer_lastname")
	public WebElement CustomerLastName;
	@FindBy(how=How.ID,using="email")
	public WebElement CustomerEmail;
	@FindBy(how=How.ID,using="passwd")
	public WebElement Password;
	
	//for DropDown Date of Birth
	@FindBy(how=How.ID,using="days")
	public WebElement DrpDay;
	@FindBy(how=How.ID,using="months")
	public WebElement DrpMonth;
	@FindBy(how=How.ID,using="years")
	public WebElement DrpYear;
	
	//For Customer Address Information
	@FindBy(how=How.ID,using="firstname")
	public WebElement Firstname;
	@FindBy(how=How.ID,using="lastname")
	public WebElement Lastname;
	@FindBy(how=How.ID,using="address1")
	public WebElement Address;
	@FindBy(how=How.ID,using="city")
	public WebElement City;
	@FindBy(how=How.ID,using="id_state")
	public WebElement DrpState; 
	@FindBy(how=How.ID,using="postcode")
	public WebElement PostalCode;
	@FindBy(how=How.ID,using="id_country")
	public WebElement DrpCountry;
	@FindBy(how=How.ID,using="phone_mobile")
	public WebElement MobileNumber;
	@FindBy(how=How.ID,using="alias")
	public WebElement Alias;
	@FindBy(how=How.XPATH,using="//*[@id=\"submitAccount\"]/span")
	public WebElement RegisterButton; 
	
	//AUTHENTICATION ALREADY REGISTERED?
	@FindBy(how=How.ID,using="passwd")
	public WebElement Passwordtext;
	@FindBy(how=How.XPATH,using="//*[@id=\"SubmitLogin\"]/span")
	public WebElement SigninButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"center_column\"]/div[1]/p")
	public WebElement ErrorMessage;
	
}
