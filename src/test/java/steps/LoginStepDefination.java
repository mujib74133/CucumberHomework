package steps;


import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase{

	LoginPage loginPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	
	@Given ("User is on the codefios login page")
	public void user_is_on_the_codefios_login_page() {
	//	initDriver();
		driver.get("https://codefios.com/ebilling/login");
	}
	
	@When ("User enters username as {string}")
	public void userEnterUsernameAs(String username) {
	//	loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
	}
	
	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
	//	loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterPassword(password);
	}

	@When("User clicks into login button")
	public void user_clicks_into_login_button() {
		loginPage.clickSignInButton();
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Codefios";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Page Title are not matching", expectedTitle, actualTitle);
	}

	
	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}
	
}
