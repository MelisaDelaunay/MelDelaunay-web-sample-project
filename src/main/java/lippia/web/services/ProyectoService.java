package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ProyectoConstants;
import lippia.web.constants.WorkspaceConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getElement;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class ProyectoService {
    public static void clickBotonProyectos() {
        waitVisibility(ProyectoConstants.MENU_PROYECTO_BUTTON);
        WebActionManager.click(ProyectoConstants.MENU_PROYECTO_BUTTON);
    }

    public static void clickBotonCrearNuevoProyecto() {
        waitVisibility(ProyectoConstants.CREAR_NUEVO_PROYECTO_BUTTON);
        WebActionManager.click(ProyectoConstants.CREAR_NUEVO_PROYECTO_BUTTON);
    }

    public static void setNuevoProyecto(String proyecto) {
        WebActionManager.waitClickable(ProyectoConstants.NOMBRE_PROYECTO);
        WebActionManager.setInput(ProyectoConstants.NOMBRE_PROYECTO, proyecto);
    }

    public static void clickCreateProyecto() {
        waitVisibility(ProyectoConstants.CREAR_BUTTON);
        WebActionManager.click(ProyectoConstants.CREAR_BUTTON);
    }

    public static void verifyMensajeExitoso() {
        waitVisibility(ProyectoConstants.MENSAJE_EXITOSO);
        // Aca aplica misma observacion que otras verificaciones mediante texto
        Assert.assertFalse(getMensajeExitoso().isEmpty());
    }

    public static String getMensajeExitoso() {
        return MensajeExitoso().getText();
    }

    private static WebElement MensajeExitoso() {
        return getElement(ProyectoConstants.MENSAJE_EXITOSO);
    }
}
