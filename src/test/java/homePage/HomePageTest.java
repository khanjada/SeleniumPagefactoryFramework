package homePage;

import base.ScriptBase;
import controller.HomePage;
import controller.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends ScriptBase {
    HomePage homePage;

    @BeforeTest
    public void beforetest(){
        init();

    }
//    @Test
//    public void VerifyDisp() {
//        homePage = new HomePage(driver);
//        homePage.DispInfo();
//    }

    @Test
    public void VerifyTopSearch() {
        homePage = new HomePage(driver);
        homePage.TopSearch("sleeve",driver,"4");


    }

    @AfterTest
    public void closebrowser(){
        driver.close();
        driver.quit();
    }
}
