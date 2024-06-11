package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.TimeService;
import java.util.Random;


public class TimeSteps extends PageSteps  {
    @When("The client set the name of time {string}")
    public void theClientSetTheNameOfTime(String time) {
        Random random = new Random();
        TimeService.setTime(time + random.nextInt(100));
    }

    @When("The client on log in button Manual")
    public void theClientOnLogInButtonManual() {
        TimeService.clickBotonManual();
    }

    @When("The client sets the start time {string}")
    public void theClientSetsTheStartTime(String startTime) {
        TimeService.setStartTime(startTime);
    }

    @When("The client sets the end time {string}")
    public void theClientSetsTheEndTime(String endTime) {
        TimeService.setEndTime(endTime);
    }

    @When("The client sets the date {string}")
    public void theClientSetsTheDate(String fecha) {
        TimeService.setFecha(fecha);
    }

    @Then("The client sees a successful message created")
    public void theClientSeesASuccessfulMessageCreated() {
        TimeService.verifyMensajeExitoso();
    }

    @When("The client on log in button add")
    public void theClientOnLogInButtonAdd() {
        TimeService.clickBotonAgregar();
    }

    @When("The client on log in button Timer")
    public void theClientOnLogInButtonTimer() {
        TimeService.clickBotonTimer();
    }

    @When("The client on log in button Start")
    public void theClientOnLogInButtonStart() {
        TimeService.clickBotonStart();
    }

    @When("The client on log in button Menu")
    public void theClientOnLogInButtonMenu() {
        TimeService.clickBotonMenu();
    }

    @When("The client on log in button Discard")
    public void theClientOnLogInButtonDiscard() {
        TimeService.clickBotonDiscard();
    }

    @When("The client on log in button Confirmacion Discard")
    public void theClientOnLogInButtonConfirmacionDiscard() {
        TimeService.clickBotonConfirmacionDiscard();
    }

    @When("The client modify the name of time {string}")
    public void theClientModifyTheNameOfTime(String nombreTime) {
        TimeService.modifyTime(nombreTime);
    }

    @When("The client on log in button Proyecto")
    public void theClientOnLogInButtonProyecto() {
        TimeService.clickBotonProyecto();
    }

    @When("The client modify billable")
    public void theClientModifyBillable() {
        TimeService.modifyBillable();
    }

    @When("The client log in div to save changes")
    public void theClientLogInDivToSaveChanges() {
        TimeService.clickDivParaGuardarCambios();
    }
}
