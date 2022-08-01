package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.RetailPageObject;


public class RetailStepDefinition extends Base {

	RetailPageObject retailPage = new RetailPageObject();

	// BACKGROUND

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(retailPage.isLogoDisplayed());
		logger.info("User is on Retail website");
		
	}

	@When("User click on My Account")
	public void user_click_on_my_account() {
		retailPage.clickOnMyAccount();
		logger.info("User clicked on MyAccount");

	}

	@And("User click on Login")
	public void user_click_on_login() {
		retailPage.clickOnLogin();
		logger.info("User clicked on Login");

	}

	@And("User enter username {string} and password {string}")
	public void user_enter_user_name_and_password(String email, String pass) {
		retailPage.enterEmail(email);
		logger.info("User entered the userName " + email);
		retailPage.enterPassword(pass);
		logger.info("User entered the password  " + pass);

	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		retailPage.clickOnLoginButton();
		logger.info("User clicked on Login button");

	}

	@Then("User should be logged into My Account dashboard")
	public void user_should_be_logged_into_my_account_page() {
		Assert.assertTrue(retailPage.myAccountTextIsPresent());
		logger.info("User logged into MyAccount dashboard");
	}

//1 

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPage.clickOnRegister();
		logger.info("User clicked on the link");

	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		
List<Map<String, String>> rewiewInformation = dataTable.asMaps(String.class, String.class);
		retailPage.enterCompany(rewiewInformation.get(0).get("company"));
		retailPage.enterWebSite(rewiewInformation.get(0).get("website"));
		retailPage.enteraxId(rewiewInformation.get(0).get("taxID"));
		retailPage.selectPayment();
		retailPage.enterCheckPayee(rewiewInformation.get(0).get("paymentMethod"));
		logger.info("User filled affiliate form and selected payment");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPage.clickCheckBoxAboutUs();
		logger.info("User checked on About us check box");

	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPage.clickOnContinueButton();
		logger.info("User clicked on Continue button");

	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message1() {
		retailPage.isSuccessMessagePresent();
		logger.info("User should see a success message");
		

	}
// 2
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailPage.clickOnEditYourAffilateInformationLink();
		logger.info("User clicked on Edit My Affilate Account link");

	}

	@And("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPage.clickOnBankTransfer();
		logger.info("User clicked on Bank Transfer radio button");

	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTableBank) {
		List<Map<String, String>> rewiewInformation = dataTableBank.asMaps(String.class, String.class);
		retailPage.enterBankName(rewiewInformation.get(0).get("bankName"));
		retailPage.enterAbaNumber(rewiewInformation.get(0).get("abaNumber"));
		retailPage.enterSwiftCode(rewiewInformation.get(0).get("swiftCode"));
		retailPage.enterAccountName(rewiewInformation.get(0).get("accountName"));
		retailPage.enterAccountNumber(rewiewInformation.get(0).get("accountNumber"));
		logger.info("User filled Bank information with information");
	}
	
	// 3
	
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailPage.clickOnEditYourAccountInformationLink();
		logger.info("User clicked on the link");

	}

	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTableInfo) {
		List<Map<String, String>> rewiewInformations = dataTableInfo.asMaps(String.class, String.class);
		retailPage.enterFirstName(rewiewInformations.get(0).get("firstname"));
		retailPage.enterLastName(rewiewInformations.get(0).get("lastName"));
		retailPage.enterYourEmail(rewiewInformations.get(0).get("email"));
		retailPage.enterYourTelephone(rewiewInformations.get(0).get("telephone"));
		logger.info("User modified information");

	}
	
	@Then("User should see this message {string}")
	public void user_should_see_this_success_message(String expectedSuccessMessageAccount) {
		Assert.assertEquals(retailPage.successMessageAccount(), expectedSuccessMessageAccount);
		Assert.assertTrue(retailPage.isAccountSuccessMessagePresent());
		logger.info("User should see a success message: " + expectedSuccessMessageAccount + " equals to " + retailPage.successMessageAccount());
		
		
	}

}
