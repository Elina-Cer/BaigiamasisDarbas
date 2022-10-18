package Elina.tests.livin;

import Elina.pages.Locators;
import Elina.pages.livin.LoginPage;
import Elina.pages.livin.SearchProductPage;
import Elina.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open(
                "https://www.livinn.lt");
    }
    @Test
    private void searchProductTest () {
        String Product = "Arbata";

SearchProductPage.clickBottomSearch();
        SearchProductPage.clickBottomCookies();
SearchProductPage.enterProduct(Product);

    }




}