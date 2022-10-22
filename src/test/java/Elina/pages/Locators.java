package Elina.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Flowyy {
        public static class Login {
            public static By logInButton = By.xpath("//*[text()='Prisijungti']");
            public static By inputEmail = By.xpath("//*[@id='username']");
            public static By inputPassword = By.xpath("//input[@id='password']");
            public static By buttonSubmit = By.xpath("//button[@class='woocommerce-Button button']");
            public static By headerManoPaskyra = By.xpath("//*[@class='header__upper__icons']");
            public static By loginError = By.xpath("//*[@class='woocommerce-error']");
            public static By userInformation = By.xpath("//*[text()='Vartotojo informacija']");
            public static By inputUserName = By.xpath("//*[@id='account_first_name']");
            public static By inputUserLastName = By.xpath("//*[@id='account_last_name']");
            public static By buttonSubmitNotification =By.xpath("//*[@class='btn btn--full']");
            public static By messageOfNotification = By.xpath("//div[@class='woocommerce-message']");
        }

        public static class SearchProduct {
            public static By searchButton = By.xpath("(//div[@class='header__lower__right sm-hide']//span)[1]");
            public static By inputProduct = By.xpath("//input[@id='dgwt-wcas-search-input-1']");
            public static By searchProduct = By.xpath("//div[@class='dgwt-wcas-st']");
            public static By searchResult = By.xpath("//span[text()='Brazil Santos']");
            public static By productFromMainPage = By.xpath("//*[text()='Produktai']");
            public static By selectedProductFromMainPage = By.xpath("//*[text()='Raffaello']");
            public static By cartButton = By.xpath("//*[@class='single_add_to_cart_button button alt']");
            public static By messageFromCart = By.xpath("//*[@class='product_title entry-title']");
        }
    }
}

