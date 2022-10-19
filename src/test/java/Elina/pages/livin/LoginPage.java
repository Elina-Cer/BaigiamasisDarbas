package Elina.pages.livin;

import Elina.pages.Common;
import Elina.pages.Locators;

public class LoginPage {
    public static void open() {
        Common.openUrl("https://www.livinn.lt/login");
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

        try {
            Common.waitForElementWithVisibilityChange(Locators.Livin.Login.cookiesAccept);
            Common.clickElement(Locators.Livin.Login.cookiesAccept);
        } catch (Exception e) {
            System.out.println("UUUUPPPPSSS!");
        }

    }

    public static String readLoginMessage() {
        return Common.getElementText(
                Locators.Livin.Login.headerManoPaskyra);
    }
    public static String readLoginMessageError() {
        return Common.getElementText(
                Locators.Livin.Login.loginError);
    }
}