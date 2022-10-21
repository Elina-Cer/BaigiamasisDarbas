package Elina.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Flowyy {
        public static class Login {
            public static By logInButton = By.xpath("//*[text()='Prisijungti']");
            public static By inputEmail = By.xpath("//*[@id='username']");
            public static By inputPassword = By.xpath("//input[@id='password']");
            public static By buttonSubmit = By.xpath("//button[@class='woocommerce-Button button']");
            public static By headerManoPaskyra = By.xpath("//*[text()='elina.cerniavskaja@gmail.com']");
            public static By loginError = By.xpath("//*[@class='woocommerce-error']");

        }

        public static class SearchProduct {
            public static By searchButton = By.xpath("//*[text()='dgwt-wcas-search-input-1']");
            public static By inputProduct = By.xpath("//*[@class='js-dgwt-wcas-enable-mobile-form dgwt-wcas-enable-mobile-form']");
            public static By searchProduct = By.xpath("//*[@class='text--s text--bold']");
            public static By ProductFromMainPage = By.xpath("//*[text()='Produktai']");
            public static By selectedProductFromMainPage = By.xpath("//*[text()='Raffaello']");
            public static By cartButon = By.xpath("//*[@class='single_add_to_cart_button button alt']");

            public static By MessageFromCart = By.xpath("//*[@class='woocommerce-message']");
        }
    }
}

