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
        homePage.TopSearch("printed dress",driver,"5");


    }

    @Test
    public void VerifyShoeSearch() {
        homePage = new HomePage(driver);
        homePage.TopSearchone("Shoe",driver,"7");


    }

    @Test
    public void VerifyBlouseSearch() {
        homePage = new HomePage(driver);
        homePage.TopSearchTwo("Blouse",driver,"1");


    }
    @Test
    public void VerifySkirtSearch() {
        homePage = new HomePage(driver);
        homePage.TopSearchThree("skirt",driver,"1");


    }
    @Test
    public void VerifyCategoryWomen() {
        homePage = new HomePage(driver);
        homePage.Category(driver,"women");


    }
    @Test
    public void VerifyCategoryTshirt() {
        homePage = new HomePage(driver);
        homePage.Category(driver,"T-shirts");


    }



    @AfterTest
    public void closebrowser(){
        driver.close();
        driver.quit();
    }
}
