package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	// BACKGROUND OBJECTS
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(id = "input-email")
	private WebElement emailInput;

	@FindBy(id = "input-password")
	private WebElement passwordInput;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;

	
	// BACKGROUND METHODS

		public boolean isLogoDisplayed() {
			if (logo.isDisplayed())
				return true;
			else
				return false;
		}

		public void clickOnMyAccount() {
			myAccount.click();
		}

		public void clickOnLogin() {
			login.click();
		}

		public void enterEmail(String emailValue) {
			emailInput.sendKeys(emailValue);
		}

		public void enterPassword(String passwordValue) {
			passwordInput.sendKeys(passwordValue);
		}

		public void clickOnLoginButton() {
			loginButton.click();
		}

		public boolean myAccountTextIsPresent() {
			if (myAccountText.isDisplayed())
				return true;
			else
				return false;
		}
	//scenario 1 OBJECTS

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerAffilate;

	@FindBy(id = "input-company")
	private WebElement company;

	@FindBy(id = "input-website")
	private WebElement webSite;

	@FindBy(id = "input-tax")
	private WebElement taxId;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement cheque;

	@FindBy(id = "input-cheque")
	private WebElement chequePayee;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBoxAboutUs;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	// 1 METHODS

		public void clickOnRegister() {
			registerAffilate.click();
		}

		public void enterCompany(String companyValue) {
			company.sendKeys(companyValue);
		}

		public void enterWebSite(String websiteValue) {
			webSite.sendKeys(websiteValue);
		}

		public void enteraxId(String taxIdValue) {
			taxId.sendKeys(taxIdValue);
		}

		public void selectPayment() {
			cheque.click();
		}

		public void enterCheckPayee(String checkPayeeValue) {
			chequePayee.sendKeys(checkPayeeValue);
		}

		public void clickCheckBoxAboutUs() {
			checkBoxAboutUs.click();
		}

		public void clickOnContinueButton() {
			continueButton.click();
		}

		public boolean isSuccessMessagePresent() {
			if (successMessage.isDisplayed())
				return true;
			else
				return false;
		}
		
		
	
	// 2 OBJECTS
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editYourAffilateInformationLink;
	
	@FindBy(xpath="//input[@value='bank']")
	private WebElement bankTransfer;
	
	@FindBy(id="input-bank-name")
	private WebElement bankName;
	
	@FindBy(id="input-bank-branch-number")
	private WebElement abaNumber;
	
	@FindBy(id="input-bank-swift-code")
	private WebElement swiftCode;
	
	@FindBy(id="input-bank-account-name")
	private WebElement accountName;
	
	@FindBy(id="input-bank-account-number")
	private WebElement accountNumber;
	
	
	@FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueBttnOnAccountEdit;
    @FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])[1]")
    private WebElement successMessageOnEditAccount;
	
 // 2 METHODS
 	public void clickOnEditYourAffilateInformationLink() {
 		editYourAffilateInformationLink.click();
 	}
 	
 	public void clickOnBankTransfer() {
 		bankTransfer.click();
 	}
 	
 	public void enterBankName(String bankNameValue) {
 		bankName.sendKeys(bankNameValue);
 	}
 	
 	public void enterAbaNumber(String abaNumberValue) {
 		abaNumber.sendKeys(abaNumberValue);
 	}
 	
 	public void enterSwiftCode(String swiftCodeValue) {
 		swiftCode.sendKeys(swiftCodeValue);
 	}
 	
 	public void enterAccountName(String accountNameValue) {
 		accountName.sendKeys(accountNameValue);
 	}
 	
 	public void enterAccountNumber(String accountNumberValue) {
 		accountNumber.sendKeys(accountNumberValue);
 	}
    
    
	// 3 OBJECTS
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editYourAccountInformationLink;
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	
	@FindBy(id="input-lastname")
	private WebElement lastName;
	
	@FindBy(id="input-email")
	private WebElement email;
	
   @FindBy(xpath="(//input[@class='form-control'])[4]")
   private WebElement telephone;
   
   @FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
   private WebElement successMessageAccountUpdate;
	

	
	// 3 METHODS
	
	public void clickOnEditYourAccountInformationLink() {
		editYourAccountInformationLink.click();
	}
	
	public void enterFirstName(String firstNameValue ) {
		firstName.clear();
		firstName.sendKeys(firstNameValue);
	}
	
	public void enterLastName(String lastNameValue) {
		lastName.clear();
		lastName.sendKeys(lastNameValue);
	
	}
	
	public void enterYourEmail(String emailValue) {
		email.clear();
		email.sendKeys(emailValue);
	}
	
	public void enterYourTelephone(String telephoneValue) {
		telephone.clear();
		telephone.sendKeys(telephoneValue);
	}
	
	public String successMessageAccount() {
		String actualResult = successMessageAccountUpdate.getText();
		return actualResult;
	}


	public boolean isAccountSuccessMessagePresent() {
		if (successMessageAccountUpdate.isDisplayed())
			return true;
		else
			return false;
	
	
	}

}
	





