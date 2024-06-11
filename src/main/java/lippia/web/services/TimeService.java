package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogoutConstants;
import lippia.web.constants.ProyectoConstants;
import lippia.web.constants.TimeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import static com.crowdar.core.actions.ActionManager.*;


public class TimeService {
    public static void setTime(String time) {
        waitVisibility(TimeConstants.NOMBRE_TIME);
        WebActionManager.setInput(TimeConstants.NOMBRE_TIME, time);
    }

    public static void clickBotonManual() {
        waitVisibility(TimeConstants.MANUAL_BUTTON);
        WebActionManager.click(TimeConstants.MANUAL_BUTTON);
    }

    public static void setStartTime(String startTime) {
        WebActionManager.click(TimeConstants.HORA_DESDE);
        WebActionManager.setInput(TimeConstants.HORA_DESDE, startTime);
    }

    public static void setEndTime(String endTime) {
        WebActionManager.click(TimeConstants.HORA_HASTA);
        WebActionManager.setInput(TimeConstants.HORA_HASTA, endTime);
    }

    public static void setFecha(String fecha) {
        WebActionManager.click(TimeConstants.FECHA);
        WebActionManager.setInput(TimeConstants.FECHA, fecha);
    }

    public static void clickBotonAgregar() {
        waitClickable(TimeConstants.ADD_BUTTON);
        WebActionManager.click(TimeConstants.ADD_BUTTON);
    }
    public static void verifyMensajeExitoso() {
        waitVisibility(TimeConstants.MENSAJE_EXITOSO);
        Assert.assertFalse(getMensajeExitoso().isEmpty());
    }

    public static void clickBotonTimer() {
        waitVisibility(TimeConstants.TIMER_BUTTON);
        WebActionManager.click(TimeConstants.TIMER_BUTTON);
    }

    public static void clickBotonStart() {
        waitVisibility(TimeConstants.START_BUTTON);
        WebActionManager.click(TimeConstants.START_BUTTON);
    }

    public static void clickBotonMenu() {
        waitVisibility(TimeConstants.MENU_BUTTON);
        WebActionManager.click(TimeConstants.MENU_BUTTON);
    }

    public static void clickBotonDiscard() {
        waitVisibility(TimeConstants.DISCARD_BUTTON);
        waitClickable(TimeConstants.DISCARD_BUTTON);
        WebActionManager.click(TimeConstants.DISCARD_BUTTON);
    }

    public static void clickBotonConfirmacionDiscard() {
        waitVisibility(TimeConstants.CONFIRMACION_DISCARD_BUTTON);
        waitClickable(TimeConstants.CONFIRMACION_DISCARD_BUTTON);
        WebActionManager.click(TimeConstants.CONFIRMACION_DISCARD_BUTTON);
    }

    public static String getMensajeExitoso() {
        return MensajeExitoso().getText();
    }

    private static WebElement MensajeExitoso() {
        return getElement(TimeConstants.MENSAJE_EXITOSO);
    }

    public static void modifyTime(String nombreTime) {
        waitVisibility(TimeConstants.NOMBRE_TIME_MODIFICACION);
        WebActionManager.setInput(TimeConstants.NOMBRE_TIME_MODIFICACION, nombreTime, true, true);
    }

    public static void clickDivParaGuardarCambios() {
        WebActionManager.click(TimeConstants.DIV_PARA_GUARDAR_CAMBIOS);
    }

    public static void clickBotonProyecto() {
        WebActionManager.click(TimeConstants.PROYECTO_MODIFICACION);
    }

    public static void modifyBillable() {
        WebActionManager.click(TimeConstants.BILLABLE);
    }
}
