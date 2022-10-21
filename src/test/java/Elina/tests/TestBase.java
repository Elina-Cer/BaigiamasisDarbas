package Elina.tests;

import Elina.pages.flowyy.LoginPage;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
    public void setUp() {
        LoginPage.open();


        String ElPastas = "elina.cerniavskaja@gmail.com";
        String Slaptazodis = "GoodPassword44";

        LoginPage.enterEmail(ElPastas);
        LoginPage.enterPassword(Slaptazodis);
        LoginPage.clickBottomSubmit();
    }

  //  @AfterMethod
    //public void tearDown() {
      //  Common.closeDriver();
   // }
}


