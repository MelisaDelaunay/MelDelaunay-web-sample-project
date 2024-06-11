package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

     public static void clickLogin() {
        WebActionManager.click(HomeConstants.LOGIN_BUTTON);
    }

    public static void clickAcceptCookies() {
        WebActionManager.click(HomeConstants.ACCEPT_COOKIES_BUTTON);
    }
}
