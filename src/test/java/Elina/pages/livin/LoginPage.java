package Elina.pages.livin;

import Elina.pages.Common;
import Elina.pages.Locators;

public class LoginPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void enterElPastas(String ElPastas) {
        Common.sendKeysToElement(
                ElPastas,
                Locators.Livin.Login.inputElPastas
        );
    }

    public static void enterSlaptazodis(String Slaptazodis) {
        Common.sendKeysToElement(
                Slaptazodis,
                Locators.Livin.Login.inputSlaptazodis
        );
    }

    public static void clickBottomPrisijungti() {
        Common.clickElement(
                Locators.Livin.Login.buttonPrisijungti);
    }

    public static void clickBottomCookies() {
        Common.clickElement(
                Locators.Livin.Login.cookiesAccept);
    }

    public static String readMessage() {
        return Common.getElementText(
                Locators.Livin.Login.headerManoPaskyra);
    }

}