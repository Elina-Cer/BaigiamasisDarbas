package Elina.tests.livin;

import Elina.pages.livin.LoginPage;
import Elina.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open();
        LoginPage.clickBottomCookies();

    }

    @Test
    private void PositiveLoginTest() {
        String expectedText = "Mano paskyra";
        String actualText = "";

        String ElPastas = "elina.cerniavskaja@gmail.com";
        String Slaptazodis = "Elmika85";


        LoginPage.enterElPastas(ElPastas);
        LoginPage.enterSlaptazodis(Slaptazodis);
        LoginPage.clickBottomPrisijungti();


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
        String expectedText = "Prisijungti nepavyko. Pasitikrinkite ar teisingai įvedėte prisijungimo duomenis.";
        String actualText = "";

        String ElPastas = "elina.cerniavskaja@gmail.com";
        String Slaptazodis = "NotPassword";

        LoginPage.enterElPastas(ElPastas);
        LoginPage.enterSlaptazodis(Slaptazodis);
        LoginPage.clickBottomPrisijungti();

        actualText = LoginPage.readLoginMessageError();

        Assert.assertEquals(actualText, expectedText);

    }
}
