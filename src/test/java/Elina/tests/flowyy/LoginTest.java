package Elina.tests.flowyy;

import Elina.pages.flowyy.LoginPage;
import Elina.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open();


    }

    @Test
    private void PositiveLoginTest() {
        String expectedText = "elina.cerniavskaja@gmail.com";
        String actualText = "";

        String ElPastas = "elina.cerniavskaja@gmail.com";
        String Slaptazodis = "GoodPassword44";

        LoginPage.clickLoginButton();
        LoginPage.enterEmail(ElPastas);
        LoginPage.enterPassword(Slaptazodis);
        LoginPage.clickBottomSubmit();


        actualText = LoginPage.readLoginMessage();

        System.out.println( String.format(
                "Actual [%s]; Expected [%s]",
                actualText,
                expectedText
        ));

        Assert.assertTrue(
                actualText.contains(expectedText),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualText,
                        expectedText
                )
        );
    }
    @Test
    private void NegativeLoginTest() {
        String expectedText = "ERROR: The username or password you entered is incorrect. Lost your password?";
        String actualText = "";

        String ElPastas = "elina.cerniavskaja@gmail.com";
        String Slaptazodis = "NotPassword";

        LoginPage.clickLoginButton();
        LoginPage.enterEmail(ElPastas);
        LoginPage.enterPassword(Slaptazodis);
        LoginPage.clickBottomSubmit();
        actualText = LoginPage.readLoginMessageError();

        Assert.assertEquals(actualText, expectedText);
    }
}
