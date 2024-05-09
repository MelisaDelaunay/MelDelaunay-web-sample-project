package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.LogoutConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getElement;
import static com.crowdar.core.actions.ActionManager.waitVisibility;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LogoutService {
    public static void clickMenuDerecha() {
        waitVisibility(LogoutConstants.MENU_BUTTON);
        WebActionManager.click(LogoutConstants.MENU_BUTTON);
    }

    public static void clickBotonCerrarSesion() {
        waitVisibility(LogoutConstants.CERRAR_SESION_BUTTON);
        WebActionManager.click(LogoutConstants.CERRAR_SESION_BUTTON);
    }

    private static WebElement stats() {
        return getElement(LoginConstants.LOGIN_BUTTON_MANUALLY);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyResults(){
        Assert.assertFalse(getStats().isEmpty());
    }

    public static void navegarWebTracker(String web){
        navigateTo(PropertyManager.getProperty(web));
    }
}
