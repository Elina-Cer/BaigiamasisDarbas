package Elina.tests;

import Elina.pages.Common;
import Elina.pages.flowyy.LoginPage;
import Elina.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
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


