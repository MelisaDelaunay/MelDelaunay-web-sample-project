package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import io.lippia.api.lowcode.variables.VariablesManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.WorkspaceConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getElement;
import static com.crowdar.core.actions.ActionManager.waitVisibility;


public class WorkspaceService {
    public static void setWorkspace(String workspace) {
        WebActionManager.setInput(WorkspaceConstants.NOMBRE_WORKSPACE, workspace);
    }

    public static void setWorkspaceModificacion(String workspace) {
        WebActionManager.waitClickable(WorkspaceConstants.NOMBRE_WORKSPACE_MODIFICACION);
        WebActionManager.getElement(WorkspaceConstants.NOMBRE_WORKSPACE_MODIFICACION).clear();
        WebActionManager.setInput(WorkspaceConstants.NOMBRE_WORKSPACE_MODIFICACION, workspace);
        VariablesManager.setVariable("nombreWorkspaceModificado",workspace);
    }

    public static void verifyMensajeExitoso() {
        waitVisibility(WorkspaceConstants.MENSAJE_UPGRADE_EXITOSO);
        // Misma observacion que otras verificaciones que usan el isEmpty()
        Assert.assertFalse(getMensajeExitoso().isEmpty());
        // Aca podria aplicar VariablesManager.getVariable("nombreWorkspaceModificado") y verificar que algun elemento en la lista contenga ese nombre
        // Obtengo la variable seteada en otro metodo, para demostrar que es accesible
        System.out.println("Nombre del workspace mostrado desde verifyMensajeExitoso(): " + VariablesManager.getVariable("nombreWorkspaceModificado"));
    }

    private static WebElement MensajeExitoso() {
        return getElement(WorkspaceConstants.MENSAJE_UPGRADE_EXITOSO);
    }

    public static String getMensajeExitoso() {
        return MensajeExitoso().getText();
    }
}
