package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getElement;
import static com.crowdar.core.actions.ActionManager.waitVisibility;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService {
    public static void setEmail(String email) {
        WebActionManager.waitClickable(LoginConstants.EMAIL_INPUT);
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT, email);
    }

    public static void setPassword(String password) {
        WebActionManager.waitClickable(LoginConstants.PASSWORD_INPUT);
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
    }

    public static void clickLoginManually() {
        WebActionManager.click(LoginConstants.LOGIN_BUTTON_MANUALLY);
    }

    public static void clickLoginIngresa() {
        WebActionManager.click(LoginConstants.INGRESA_BUTTON);
    }

    private static WebElement stats() {
        return getElement(LoginConstants.STATS_ID);
    }

    private static WebElement MensajeErrorFormatoIncorrecto() {
        return getElement(LoginConstants.MENSAJE_ERROR_FORMATO_INCORRECTO);
    }

    private static WebElement MensajeError() {
        return getElement(LoginConstants.MENSAJE_ERROR);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static String getMensajeErrorFormatoIncorrecto() {
        return MensajeErrorFormatoIncorrecto().getText();
    }

    public static String getMensajeError() {
        return MensajeError().getText();
    }

    public static void verifyResultsExitoso(){
        waitVisibility(LoginConstants.STATS_ID);
        Assert.assertTrue(getStats().isEmpty());
    }

    public static void verifyMensajeErrorFormatoIncorrecto() {
        waitVisibility(LoginConstants.MENSAJE_ERROR_FORMATO_INCORRECTO);
        Assert.assertFalse(getMensajeErrorFormatoIncorrecto().isEmpty());
//        Una opcion mas robusta de la verificacion, seria que al conocer el mensaje, el mensaje sea el esperado, ejemplo:
        Assert.assertEquals(getMensajeErrorFormatoIncorrecto(),"Email format is not valid");
    }

    public static void verifyBotonActivo() {
        Assert.assertFalse(getElement(LoginConstants.INGRESA_BUTTON).isEnabled());
    }

    public static void verifyMensajeError() {
        waitVisibility(LoginConstants.MENSAJE_ERROR);
        // Misma observacion que verifyMensajeErrorFormatoIncorrecto()
        Assert.assertFalse(getMensajeError().isEmpty());
    }
}
