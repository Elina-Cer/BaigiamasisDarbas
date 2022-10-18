package Elina.tests;
import Elina.pages.Common;
import Elina.pages.livin.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
    public void setUp() {
        LoginPage.open();
        LoginPage.clickBottomCookies();

        String ElPastas = "elina.cerniavskaja@gmail.com";
        String Slaptazodis = "Elmika85";

        LoginPage.enterElPastas(ElPastas);
        LoginPage.enterSlaptazodis(Slaptazodis);
        LoginPage.clickBottomPrisijungti();
    }

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }
}


