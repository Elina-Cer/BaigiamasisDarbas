package Elina.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Livin {
        public static class Login {
            public static By inputElPastas = By.xpath("//input[@id='_username']");
            public static By inputSlaptazodis = By.xpath("//input[@id='_password']");
            public static By buttonPrisijungti = By.xpath("//button[@type='submit']");
            public static By headerManoPaskyra = By.xpath("//*[@class='ui dividing header hide-on-mobile']");
            public static By loginError = By.xpath("//div[@class='field-error']");
            public static By cookiesAccept = By.xpath("//button[@id='onetrust-accept-btn-handler']");
        }

        public static class SearchProduct {

            public static By inputProduct = By.xpath("//*[@id='search-input']");
            public static By searchProduct = By.xpath("//*[@class='text--s text--bold']");
          ;
        }
    }
}
