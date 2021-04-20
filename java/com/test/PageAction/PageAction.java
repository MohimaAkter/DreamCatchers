package com.test.PageAction;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.test.PageLoctor.PageLocator;
import com.test.Utils.TestBase;
import com.test.Utils.TestUtil;


public class PageAction extends TestBase{
	
   PageLocator locator = new PageLocator();
   
   public void Click_On_Signin_Link() {
	   locator.SigninLink.click();
   }
   public void Enter_Email_address() {
	   locator.CreateEmail.sendKeys("demo@gmail.com");
   }
   public void Click_on_Create_an_account_Button() {
	   locator.CreateAnAccountButton.click();
   }
   public void Click_on_Title_Redio_Button() {
	   locator.Title.click();
   }
   public void Enter_YOUR_PERSONAL_INFORMATION() {
	   locator.CustomerFirstName.sendKeys("Mita");
	   locator.CustomerLastName.sendKeys("Gupta");
	   locator.CustomerEmail.sendKeys("demo@gmail.com");
	   locator.Password.sendKeys("12345678");
   }
   public void Select_DropDown_Date_of_Birth() {
	   Select drp = new Select(locator.DrpDay);
	   drp.selectByVisibleText("2");
	   Select drp1 = new Select(locator.DrpMonth);
	   drp1.selectByVisibleText("January");
	   Select drp2 = new Select(locator.DrpYear);
	   drp2.selectByVisibleText("1984");		   
   }
   public void Enter_YOUR_ADDRESS() {
	   locator.Firstname.sendKeys("Mita");
	   locator.Lastname.sendKeys("Gupta");
	   locator.Address.sendKeys("45 leroy Ave");
	   locator.City.sendKeys("Buffalo");
	   locator.PostalCode.sendKeys("14214");
	   locator.MobileNumber.sendKeys("3456789012");
	   locator.Alias.sendKeys("MG");
   }
   public void Select_DropDown_State() {
	   Select drp3 = new Select(locator.DrpState);
	   drp3.selectByVisibleText("New York");   
   }
   public void Select_DropDown_Country () {
	   Select drp4 = new Select(locator.DrpCountry); 
	   drp4.selectByVisibleText("United States");
   }
   public void Click_on_Register_Button() {
	   locator.RegisterButton.click();
   }
   public void Enter_Password() {
	   locator.Passwordtext.sendKeys("1234567890");
   }
   public void Click_on_Sign_in_Button() {
	   locator.SigninButton.click();
   }
   public void Display_Authentication_Failed() {
	   boolean result = locator.ErrorMessage.isDisplayed();
	   Assert.assertTrue(result);
	   TestUtil.takesscreenshot(driver, "AUTHENTICATION PAGE");
   }
}
