package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.*;

import java.util.Random;


public class ProyectoSteps extends PageSteps {

    @When("The client on log in button Crear proyecto")
    public void theClientOnLogInButtonCrearProyecto() {
        ProyectoService.clickBotonCrearNuevoProyecto();
    }

    @When("The client on log in button menu proyecto")
    public void theClientOnLogInButtonMenuProyecto() {
        ProyectoService.clickBotonProyectos();
    }

    @When("The client set the name of proyecto {string}")
    public void theClientSetTheNameOfProyecto(String proyecto) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        ProyectoService.setNuevoProyecto(proyecto + numeroAleatorio);
    }

    @When("The client on log in button Create")
    public void theClientOnLogInButtonCreate() {
        ProyectoService.clickCreateProyecto();
    }

    @Then("The client sees a successful message")
    public void theClientSeesASuccessfulMessage() {
        ProyectoService.verifyMensajeExitoso();
    }
}
