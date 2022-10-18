package Elina.tests;
import Elina.pages.Common;
import Elina.pages.livin.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    @BeforeMethod
    public void setUp() {
        Common.setUpDriver();
    }

   // @AfterMethod
    //public void tearDown() {
       // Common.closeDriver();
   // }
}


