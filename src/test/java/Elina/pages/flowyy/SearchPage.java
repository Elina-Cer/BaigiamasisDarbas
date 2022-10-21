package Elina.pages.flowyy;

import Elina.pages.Common;
import Elina.pages.Locators;

public class SearchPage {
    public static void open() {
        Common.openUrl("https://flowyy.lt");
    }

    public static void clickSearchButton() {Common.clickElement(Locators.Flowyy.SearchProduct.searchButton);
    }

    public static void enterProduct(String Product) {Common.sendKeysToElement(Product,
                Locators.Flowyy.SearchProduct.inputProduct);
    }

    public static void clickSearchProduct() {Common.clickElement(
                Locators.Flowyy.SearchProduct.searchProduct);
    }

    public static void clickOnProductFromMainPage() {
        Common.clickElement(Locators.Flowyy.SearchProduct.ProductFromMainPage);
    }

    public static void clickOnSelectedProductFromMainPage() {
        Common.clickElement(Locators.Flowyy.SearchProduct.selectedProductFromMainPage);
    }
    public static String readMessageFromCart(){
        return Common.getElementText(
    Locators.Flowyy.SearchProduct.MessageFromCart);
}
    public static void clickCartBooton(){
        Common.clickElement(Locators.Flowyy.SearchProduct.cartButon);
    }
}


