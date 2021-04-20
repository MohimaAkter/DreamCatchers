#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: My Store Application

@test1
 Scenario: Verify Search For Signin
    Given Launch "<URL>"
    When Click On Signin Link 
    When Enter Email address
    Then Click on Create an account Button
    
@test2
 Scenario: Verify CREATE AN ACCOUNT
    Given Launch "<URL>"
    When Click On Signin Link
    When Enter Email address 
    Then Click on Create an account Button 
    Then Click on Title Redio Button
    Then Enter YOUR PERSONAL INFORMATION "<First name>","<Last name>","<Email>","<Password>" 
    Then Select DropDown Date of Birth "<Day>","<Month>","<Year>"
    Then Enter YOUR ADDRESS "<First name>","<Last name>","<Address>","<City>","<Zip/Postal Code>","<Mobile phone>","<Assign an address alias for future reference.>"
    Then Select DropDown State "<State>"
    Then Select DropDown Country "<Country>"
    Then Click on Register Button    
    
@test3
Scenario: Verify AUTHENTICATION ALREADY REGISTERED?
    Given Launch "<URL>"
    When Click On Signin Link
    When Enter Email address
    When Enter Password   
    Then Click on Sign in Button  
    Then Display Authentication Failed 
    



 