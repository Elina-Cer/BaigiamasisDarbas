package Elina.tests;

import Elina.pages.Common;
import Elina.pages.flowyy.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
    public void setUp() {
        LoginPage.open();
    }

    @AfterMethod
    public void tearDown(){
        Common.closeDriver();

    }
}


