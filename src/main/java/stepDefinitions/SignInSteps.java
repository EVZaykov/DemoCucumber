package stepDefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class SignInSteps extends DriverFactory {

    @Given("^I navigate to github\\.com$")
    public void i_navigate_to_github_com() throws Throwable {
        Reporter.addStepLog("Accessing gitHub");
        signInPage.getLoginPage();
    }

    @Given("^I enter a \"([^\"]*)\" Username$")
    public void i_enter_a_Username(String userName) throws Throwable {
        signInPage.enterUsername(userName);
    }

    @Given("^I enter a \"([^\"]*)\" Password$")
    public void i_enter_a_Password(String password) throws Throwable {
        signInPage.enterPassword(password);
    }

    @When("^I click on the Sign in button$")
    public void i_click_on_the_Sign_in_button() throws Throwable {
        signInPage.clickOnSignInButton();
    }

    @Then("^I should be take to the fault message$")
    public void i_should_be_take_to_the_fault_message() throws Throwable {
        signInPage.checkErrorMessage();
    }

    @Then("^I should be take to the successful login$")
    public void i_should_be_take_to_the_successful_login() throws Throwable {
        signInPage.checkSuccessfulLogin();
    }

}
