package Elina.tests.flowyy;

import Elina.pages.flowyy.LoginPage;
import Elina.pages.flowyy.SearchPage;
import Elina.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open();
    }

    @Test
    private void searchProductTest() {
        String expectedText = "";
        String actualText = "";
        String Product = "kava";

        SearchPage.clickSearchButton();
        SearchPage.enterProduct(Product);
        SearchPage.clickSearchProduct();
    }

@Test
    private void addProductToCartWithOutLoggingIn(){
    String expectedText = "“Raffaello” - įdėtas į krepšelį";
    String actualText = "";


    SearchPage.clickOnProductFromMainPage();
    SearchPage.clickOnSelectedProductFromMainPage();
    SearchPage.clickCartBooton();
    SearchPage.readMessageFromCart();
    actualText = SearchPage.readMessageFromCart();

    Assert.assertTrue(actualText.contains(expectedText));
}
    @Test
    private void addProductToCartWithLoggingIn(){
        String expectedText = "“Raffaello” - įdėtas į krepšelį";
        String actualText = "";

        String ElPastas = "elina.cerniavskaja@gmail.com";
        String Slaptazodis = "GoodPassword44";

        LoginPage.clickLoginButton();
        LoginPage.enterEmail(ElPastas);
        LoginPage.enterPassword(Slaptazodis);
        LoginPage.clickBottomSubmit();
        SearchPage.clickOnProductFromMainPage();
        SearchPage.clickOnSelectedProductFromMainPage();
        SearchPage.clickCartBooton();
        SearchPage.readMessageFromCart();
        actualText = SearchPage.readMessageFromCart();

        Assert.assertTrue(actualText.contains(expectedText));
    }
}
