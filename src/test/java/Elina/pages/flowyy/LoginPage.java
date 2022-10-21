package Elina.pages.flowyy;

import Elina.pages.Common;
import Elina.pages.Locators;
import org.openqa.selenium.By;

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

//    public static void clickBottomCookies() {
//
//        try {
//            Common.waitForElementWithVisibilityChange(Locators.Flowyy.Login.cookiesAccept);
//            Common.clickElement(Locators.Flowyy.Login.cookiesAccept);
//        } catch (Exception e) {
//            System.out.println("UUUUPPPPSSS!");
//        }
//
//    }

    public static String readLoginMessage() {
        return Common.getElementText(
                Locators.Flowyy.Login.headerManoPaskyra);
    }
    public static String readLoginMessageError() {
        return Common.getElementText(
                Locators.Flowyy.Login.loginError);
    }
}