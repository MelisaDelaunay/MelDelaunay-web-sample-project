package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import io.lippia.api.lowcode.variables.VariablesManager;
import lippia.web.constants.WorkspaceConstants;
import lippia.web.services.LoginService;
import lippia.web.services.WorkspaceService;

import java.util.Random;

import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class WorkspaceSteps extends PageSteps {

    @When("The client on log in button menu workspace")
    public void theClientOnLogInButtonMenuWorkspace() {
        waitVisibility(WorkspaceConstants.MENU_WORKSPACE_BUTTON);
        WebActionManager.click(WorkspaceConstants.MENU_WORKSPACE_BUTTON);
    }

    @When("The client on log in button Administrar workspace")
    public void theClientOnLogInButtonAdministrarWorkspace() {
        waitVisibility(WorkspaceConstants.GESTIONAR_WORKSPACE_BUTTON);
        WebActionManager.click(WorkspaceConstants.GESTIONAR_WORKSPACE_BUTTON);
    }

    @When("The client on log in button Crear workspace")
    public void theClientOnLogInButtonCrearWorkspace() {
        waitVisibility(WorkspaceConstants.CREAR_NUEVO_WORKSPACE_BUTTON);
        WebActionManager.click(WorkspaceConstants.CREAR_NUEVO_WORKSPACE_BUTTON,true);
    }
    @When("The client set the name of workspace {string}")
    public void theClientSetTheNameOfWorkspace(String workspace) {
        WebActionManager.waitClickable(WorkspaceConstants.NOMBRE_WORKSPACE);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);

        // Este seria un ejemplo de uso de Variables
        String nombreWorkspace = workspace + numeroAleatorio;

        // Seteo una variable para que este disponible para su uso en otros steps / scenarios
        VariablesManager.setVariable("nombreWorkspace",nombreWorkspace);

        // Obtengo la variable seteada mas arriba y la muestro por consola
        System.out.println("Nombre del workspace generado: " + VariablesManager.getVariable("nombreWorkspace"));

        WorkspaceService.setWorkspace(nombreWorkspace);
    }

    @When("The client on log in button Crear")
    public void theClientOnLogInButtonCrear() {
        WebActionManager.click(WorkspaceConstants.CREAR_BUTTON);
    }

    @When("The client on log in button Settings workspace")
    public void theClientOnLogInButtonSettingsWorkspace() {
        waitVisibility(WorkspaceConstants.SETTING_BUTTON);
        WebActionManager.click(WorkspaceConstants.SETTING_BUTTON);
    }

    @When("The client set the workspace name {string} in the modification.")
    public void theClientSetTheWorkspaceNameInTheModification(String NombreWorkspace) {
        WorkspaceService.setWorkspaceModificacion(NombreWorkspace);
    }

    @When("The client on log in button upgrade")
    public void theClientOnLogInButtonUpgrade() {
        waitVisibility(WorkspaceConstants.UPGRADE_BUTTON);
        WebActionManager.click(WorkspaceConstants.UPGRADE_BUTTON);
    }

    @Then("The client modify the workspace")
    public void theClientModifyTheWorkspace() {
        WorkspaceService.verifyMensajeExitoso();
    }

    @When("The client on log in div")
    public void theClientOnLogInDiv() {
        waitVisibility(WorkspaceConstants.DIV);
    }
}
