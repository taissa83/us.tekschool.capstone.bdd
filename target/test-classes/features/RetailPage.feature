@testAllRetail
Feature: Retail Page

 # done
Background:  
    Given User is on Retail website
    When User click on My Account
    And User click on Login
    And User enter username 'tamara.vasilisa@outlook.com' and password 'tamara83@'
    And User click on Login button
    Then User should be logged into My Account dashboard
 
 # 1 done

Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on Register for an Affiliate Account link 
And User fill affiliate form with below information
|company    |website    |taxID    |paymentMethod|
|New Company|newWebSite |E12459856|Cheque       |
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 

 # 2 done

Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on Edit your affiliate information link
And User click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|new bank|n132433  |  b235442|new account|d1234        |
And User click on Continue button 
Then User should see a success message 

# 3
@testRetail
Scenario: Edit your account Information 
When User click on Edit your account information link 
And User modify below information 
|firstname|lastName|email|telephone|
|taissa|downard|tamara.vasilisa@outlook.com|5400012342|
And User click on Continue button 
Then User should see this message 'Success: Your account has been successfully updated.'

  