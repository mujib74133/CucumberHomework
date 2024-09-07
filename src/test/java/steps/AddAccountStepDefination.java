package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import pages.DashboardPage;
import pages.TestBase;

public class AddAccountStepDefination extends TestBase{

//	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Before
	public void beforeRun() {
	//	initDriver();	//-> Do not use
	//	loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@Then("User clicks on {string}")
	public void user_clicks_on(String userField) {

	//	loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

		if(userField.equalsIgnoreCase("listAccounts")) {
			dashboardPage.clickListAccounts();
		} else if(userField.equalsIgnoreCase("addAccount")) {
			dashboardPage.clickAddAccount();
		} else if(userField.equalsIgnoreCase("Save")) {
		dashboardPage.clickNewAccSaveButton();
		} else {
			System.out.println("Enter valid Credential " + userField);
		}

	}


	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String userData, String userField) {

		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

		if(userField.equalsIgnoreCase("accountName")) {
			dashboardPage.enterAccountName(userData);
		} else if(userField.equalsIgnoreCase("description")) {
			dashboardPage.enterAccountDescription(userData);
		} else if(userField.equalsIgnoreCase("initialBalance")) {
			dashboardPage.enterInitialBalance(userData);
		} else if(userField.equalsIgnoreCase("accountNumber")) {
			dashboardPage.enterNewAccountNumber(userData);
		} else if(userField.equalsIgnoreCase("contactPerson")) {
			dashboardPage.enterContactPersion(userData);
		} else {
			System.out.println("Enter valid New Account input data " + userData);
		}
	}



	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {

	}

}
