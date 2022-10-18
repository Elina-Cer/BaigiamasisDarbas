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
        super.setUp();
        LoginPage.open(
                "https://www.livinn.lt/login");
    }


    @Test
    private void loginTest() {
        String expectedText = "Mano paskyra";
        String actualText = "";

        String ElPastas = "elina.cerniavskaja@gmail.com";
        String Slaptazodis = "Elmika85";


        LoginPage.enterElPastas(ElPastas);
        LoginPage.enterSlaptazodis(Slaptazodis);
        LoginPage.clickBottomPrisijungti();
        LoginPage.clickBottomCookies();

        actualText = LoginPage.readMessage();

        Assert.assertTrue(
                actualText.contains(expectedText),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualText,
                        expectedText
                )
        );


    }
}

