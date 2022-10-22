package Elina.pages.flowyy;

import Elina.pages.Common;
import Elina.pages.Locators;

public class LoginPage {
    public static void open() {
        Common.openUrl("https://flowyy.lt");
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void clickLoginButton() {
        Common.clickElement(Locators.Flowyy.Login.logInButton);
    }

    public static void enterEmail(String ElPastas) {
        Common.sendKeysToElement(
                ElPastas,
                Locators.Flowyy.Login.inputEmail
        );
    }

    public static void enterPassword(String Slaptazodis) {
        Common.sendKeysToElement(
                Slaptazodis,
                Locators.Flowyy.Login.inputPassword
        );
    }

    public static void clickBottomSubmit() {
        Common.clickElement(
                Locators.Flowyy.Login.buttonSubmit);
    }

    public static String readLoginMessage() {
        return Common.getElementText(
                Locators.Flowyy.Login.headerManoPaskyra);
    }

    public static String readLoginMessageError() {
        return Common.getElementText(
                Locators.Flowyy.Login.loginError);
    }

    public static void clickUserInformationButton() {
        Common.clickElement(
                Locators.Flowyy.Login.userInformation);
    }

    public static void enterUserName(String Name) {
        Common.sendKeysToElement(
                Name,
                Locators.Flowyy.Login.inputUserName);

    }

    public static void enterUserLastName(String LastName) {
        Common.sendKeysToElement(
                LastName,
                Locators.Flowyy.Login.inputUserLastName);
    }

    public static void clickButtonSubmitNotification() {
        Common.clickElement(
                Locators.Flowyy.Login.buttonSubmitNotification);
    }

    public static String readMessageOfNotification() {
        return Common.getElementText(
                Locators.Flowyy.Login.messageOfNotification);
    }
}
