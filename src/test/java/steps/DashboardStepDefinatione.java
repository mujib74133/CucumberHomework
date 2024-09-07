package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class DashboardStepDefinatione extends TestBase {

	LoginPage loginPage;

	@Before
	public void beforeRun() {
	//	initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	
	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String loginData, String userField) {
		
		loginPage = PageFactory.initElements(driver, LoginPage.class);

		if(userField.equalsIgnoreCase("username")) {
			loginPage.enterUserName(loginData);
		} else if(userField.equalsIgnoreCase("password")) {
			loginPage.enterPassword(loginData);
		} else {
			System.out.println("Enter valid login data " + loginData);
		}
	}

	
	@When("User clicks on {string} button")
	public void user_clicks_on_button(String loginButton) {
		if(loginButton.equalsIgnoreCase("login")) {
			loginPage.clickSignInButton();
		}
	}


	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String expectedTitle = "Codefios";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Page Title are not matching", expectedTitle, actualTitle);
	}

}
