package Elina.pages.flowyy;

import Elina.pages.Common;
import Elina.pages.Locators;

public class SearchPage {
    public static void open() {
        Common.openUrl("https://flowyy.lt");
    }

    public static void clickSearchButton() {
        Common.waitForElementToBeClickable(Locators.Flowyy.SearchProduct.searchButton);
        Common.clickElement(Locators.Flowyy.SearchProduct.searchButton);
    }

    public static void enterProduct(String Product) {
        Common.sendKeysToElement(Product,
                Locators.Flowyy.SearchProduct.inputProduct);
    }

    public static void clickSearchProduct() {
        Common.clickElement(
                Locators.Flowyy.SearchProduct.searchProduct);
    }

    public static void clickSearchResult() {
        Common.clickElement(Locators.Flowyy.SearchProduct.searchResult);
    }

    public static String readMessageFromCart() {
        return Common.getElementText(
                Locators.Flowyy.SearchProduct.messageFromCart);
    }

    public static void clickOnProductFromMainPage() {
        Common.clickElement(Locators.Flowyy.SearchProduct.productFromMainPage);
    }

    public static void clickOnSelectedProductFromMainPage() {
        Common.clickElement(Locators.Flowyy.SearchProduct.selectedProductFromMainPage);
    }

    public static void clickCartButton() {
        Common.clickElement(Locators.Flowyy.SearchProduct.cartButton);
    }

}



