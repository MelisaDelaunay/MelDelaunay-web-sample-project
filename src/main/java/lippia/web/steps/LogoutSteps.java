package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;
import lippia.web.services.LogoutService;

public class LogoutSteps extends PageSteps {
    @When("el cliente presiona el boton del menu de arriba a la derecha")
    public void elClientePresionaElBotonDelMenuDeArribaALaDerecha() {
        LogoutService.clickMenuDerecha();
    }

    @When("el cliente presiona el boton de cerrar sesión")
    public void elClientePresionaElBotonDeCerrarSesión() {
        LogoutService.clickBotonCerrarSesion();
    }

    @Given("The client is on {string}")
    public void theClientIsOn(String web) {
        LogoutService.navegarWebTracker(web);
    }

    @Given("The client is on page tracker")
    public void theClientIsOnPageTracker() {
        HomeService.navegarWeb();
        HomeService.clickAcceptCookies();
        HomeService.clickLogin();
        LoginService.clickLoginManually();
        LoginService.setEmail("rocio.b.alvarado@hotmail.com");
        LoginService.setPassword("Rocio1234!");
        LoginService.clickLoginIngresa();
    }
}
