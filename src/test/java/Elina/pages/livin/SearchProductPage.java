package Elina.pages.livin;

import Elina.pages.Common;
import Elina.pages.Locators;

public class SearchProductPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickBottomSearch() {
        Common.clickElement(
                Locators.Livin.SearchProduct.buttonSearch);
    }
    public static void enterProduct(String Product) {
        Common.sendKeysToElement(
                Product,
                Locators.Livin.SearchProduct.inputProduct);


}
    public static void clickBottomCookies() {
        Common.clickElement(
                Locators.Livin.Login.cookiesAccept);
    }

}
