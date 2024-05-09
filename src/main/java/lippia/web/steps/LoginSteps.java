package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {


    @Given("^The client is on home page$")
    public void home() {
        HomeService.navegarWeb();
    }

    @When("The client on log in button on landing page")
    public void theClientOnLogInButtonOnLandingPage() {
        HomeService.clickLogin();
    }

    @When("the client on log in manually button")
    public void theClientOnLogInManuallyButton() {
        LoginService.clickLoginManually();
    }

    @When("the client set the mail {string}")
    public void theClientSetTheMail(String email) {
        LoginService.setEmail(email);
    }

    @When("The client set the password {string}")
    public void theClientSetThePassword(String password) {
        LoginService.setPassword(password);
    }

    @When("The client verify is on dashboard")
    public void theClientVerifyIsOnDashboard() {
        LoginService.clickLoginIngresa();
    }

    @Then("The client is on main page")
    public void theClientIsOnMainPage() {
        LoginService.verifyResultsExitoso();
    }

    @Then("The client sees an error message")
    public void theClientSeesAnErrorMessage() {
        LoginService.verifyMensajeError();
    }

    @Then("The client sees a bad format error message.")
    public void theClientSeesABadFormatErrorMessage() {
        LoginService.verifyMensajeErrorFormatoIncorrecto();
    }

    @Then("The client does not see the active button")
    public void theClientDoesNotSeeTheActiveButton() {
        LoginService.verifyBotonActivo();
    }
}
