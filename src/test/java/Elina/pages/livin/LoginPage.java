package Elina.pages.livin;

import Elina.pages.Common;
import Elina.pages.Locators;

public class LoginPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    //public static void sleep(int millis) {
        //Common.sleep(millis);
   // }

    public static void enterElPastas(String expectedElPastas) {
        Common.sendKeysToElement(
                expectedElPastas,
                Locators.Livin.Login.inputElPastas
        );
    }

    public static void enterSlaptazodis(String expectedSlaptazodis) {
        Common.sendKeysToElement(
                expectedSlaptazodis,
                Locators.Livin.Login.inputSlaptazodis
        );
    }

    public static void clickBottomPrisijungti() {
        Common.clickElement(
                Locators.Livin.Login.buttonPrisijungti);
    }

    public static String readMessageElPastas() {
        return Common.getElementText(
                Locators.Livin.Login.inputElPastas);
    }

}