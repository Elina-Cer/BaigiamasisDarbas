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
        String expectedText = "Brazil Santos";
        String actualText = "";
        String Product = "Brazil Santos";

        SearchPage.clickSearchButton();
        SearchPage.enterProduct(Product);
        SearchPage.clickSearchProduct();
        actualText = SearchPage.readMessageFromCart();

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
    private void addProductToCartWithOutLoggingIn(){
    String expectedText = "“Raffaello” - įdėtas į krepšelį";
    String actualText = "";

    SearchPage.clickOnProductFromMainPage();
    SearchPage.clickOnSelectedProductFromMainPage();
    SearchPage.clickCartButton();
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
        SearchPage.clickCartButton();
        SearchPage.readMessageFromCart();
        actualText = SearchPage.readMessageFromCart();

        Assert.assertTrue(actualText.contains(expectedText));
    }
}
