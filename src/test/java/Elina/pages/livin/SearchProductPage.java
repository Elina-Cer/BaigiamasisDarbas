package Elina.pages.livin;

import Elina.pages.Common;
import Elina.pages.Locators;

public class SearchProductPage {
    public static void enterProduct(String Product) {
        Common.sendKeysToElement(
                Product,
                Locators.Livin.SearchProduct.inputProduct);
    }
    public static void clickSearchProduct() {
        Common.clickElement(
                Locators.Livin.SearchProduct.searchProduct);
    }
    }


