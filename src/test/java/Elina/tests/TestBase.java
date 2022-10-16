package Elina.tests;

import Elina.pages.livin.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    @BeforeMethod
    private void setUp() {
        LoginPage.setup();
        LoginPage.open("https://www.livinn.lt/login");
    }


    @AfterMethod
    private void tearDown() {
        LoginPage.close();
    }
}
