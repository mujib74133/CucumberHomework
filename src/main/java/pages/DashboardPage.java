package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//a[@title='List Accounts']")
	WebElement ListAccounts;
	@FindBy(how = How.XPATH, using = "//header/button['Add Account']")
	WebElement AddAccount;
	@FindBy(how = How.XPATH, using = "//*[@id=\'account_name\']")
	WebElement AccountName;
	@FindBy(how = How.XPATH, using = "//*[@id='description']")
	WebElement NewAccDescription;
	@FindBy(how = How.XPATH, using = "//*[@id='balance']")
	WebElement NewAccBalance;
	@FindBy(how = How.XPATH, using = "//*[@id='account_number']")
	WebElement NewAccNumber;
	@FindBy(how = How.XPATH, using = "//*[@id='contact_person']")
	WebElement AccContactPersion;
	@FindBy(how = How.XPATH, using = "//*[@id='accountSave']")
	WebElement NewAccSaveButton;

	//a[@title='List Accounts']
	//header/button['Add Account']
	//*[@id='account_name']
	//*[@id='description']
	//*[@id='balance']
	//*[@id='account_number']
	//*[@id='contact_person']
	//*[@id='accountSave']


	//-----------------------------------------------------------//
	// Login Page
	// Methods to interact with the elements
	// User Name @ Login Page
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Password @ Login Page
	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Click @ SignIn Button
	public void clickSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	// Get Page Title for Assertion
	public String getPageTitle() {
		return driver.getTitle();
	}

	
	//-----------------------------------------------------------//
	// Dashboard Page

	// Click @ List Accounts
	public void clickListAccounts() {
		ListAccounts.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Click @ Add Account
	public void clickAddAccount() {
		AddAccount.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	//-----------------------------------------------------------//
	// New Account Page

	// Add Account Name @ New Account 
	public void enterAccountName(String accName) {
		AccountName.sendKeys(accName);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	// Enter Account Description @ New Account 
	public void enterAccountDescription(String accDescription) {
		NewAccDescription.sendKeys(accDescription);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	// Enter Initial Balance @ New Account 
	public void enterInitialBalance(String accBalance) {
		NewAccBalance.sendKeys(accBalance);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	// Enter Account Number @ New Account 
	public void enterNewAccountNumber(String accNumber) {
		NewAccNumber.sendKeys(accNumber);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	// Enter Contact Person @ New Account 
	public void enterContactPersion(String contactPersion) {
		AccContactPersion.sendKeys(contactPersion);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Click @ List Accounts
	public void clickNewAccSaveButton() {
		NewAccSaveButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
