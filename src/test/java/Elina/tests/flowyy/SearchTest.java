package Elina.tests.flowyy;

import Elina.pages.flowyy.SearchPage;
import Elina.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        super.setUp();
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
    private void addingProductToCartWithOutLoggingIn(){
    String expectedText = "“Raffaello” - įdėtas į krepšelį";
    String actualText = "";


    SearchPage.clickOnProductFromMainPage();
    SearchPage.clickOnSelectedProductFromMainPage();
    SearchPage.clickCartBooton();
    SearchPage.readMessageFromCart();
    actualText = SearchPage.readMessageFromCart();

    Assert.assertTrue(actualText.contains(expectedText));
}
}
