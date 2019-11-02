package homePage;

import base.ScriptBase;
import controller.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class HomePageTest extends ScriptBase {
    HomePage homePage;

    @BeforeTest
    public void beforetest() throws MalformedURLException {
//        init();
      //  saucelab();

    }


    @Test
    public void VerifyTopSearch() {

        log.info("###### Verify Top Search : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.TopSearch("printed dress", driver, "5");

        log.info("###### Verify Top Search  : > Test End ########" );


    }

    @Test
    public void VerifyBYShoeSearch() {

        log.info("###### Verify BY Shoe Search : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.TopSearchone("Shoe", driver, "7");

        log.info("###### Verify BY Shoe Search  : > Test End ########" );


    }

    @Test
    public void VerifyByBlouseSearch() {

        log.info("###### Verify BY Blouse Search : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.TopSearchTwo("Blouse", driver, "1");

        log.info("###### Verify BY Blouse Search  : > Test End ########" );


    }

    @Test
    public void VerifySkirtSearch() {

        log.info("###### Verify Skirt Search : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.SearchSkirt("skirt", driver, "1");

        log.info("###### Verify Skirt Search  : > Test End ########" );


    }

    @Test
    public void VerifyCategoryWomen() {

        log.info("###### Verify Category Women : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.Category(driver, "Women");

        log.info("###### Verify Category Women  : > Test End ########" );


    }

    @Test
    public void VerifyCategoryDresses() {

        log.info("###### Verify Category Dresses : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.Category(driver, "Dresses");

        log.info("###### Verify Category Dresses  : > Test End ########" );


    }

    @Test
    public void VerifyCategoryTshirt() {

        log.info("###### Verify Category Tshirt : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.Category(driver, "T-shirts");

        log.info("###### Verify Category Tshirt  : > Test End ########" );


    }

    @Test
    public void VerifyPopular1() {

        log.info("###### Verify Popular  : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.PopularSeller(driver, "Popular");

        log.info("###### Verify Popular   : > Test End ########" );


    }

    @Test
    public void VerifyBestseller() {

        log.info("###### Verify Best seller : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.PopularSeller(driver, "Best Sellers");

        log.info("###### Verify Best seller  : > Test End ########" );




    }


    @Test
    public void VerifyInformation() {

        log.info("###### Verify Information : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.InformationCascade(driver, "Specials");

        log.info("###### Verify Information  : > Test End ########" );


    }

    @Test
    public void VerifyInformationTwo() {

        log.info("###### Verify Information 2 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.InformationCascade(driver, "New products");

        log.info("###### Verify Information 2 : > Test End ########" );


    }

    @Test
    public void VerifyInformationThree() {

        log.info("###### Verify Information 3 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.InformationCascade(driver, "Best sellers");

        log.info("###### Verify Information 3 : > Test End ########" );


    }

    @Test
    public void VerifyInformationFour() {

        log.info("###### Verify Information 5 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.InformationCascade(driver, "Contact us");

        log.info("###### Verify Information 5 : > Test End ########" );


    }

    @Test
    public void VerifyInformationFive() {

        log.info("###### Verify Information 5 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.InformationCascade(driver, "Our stores");

        log.info("###### Verify Information 5 : > Test End ########" );


    }

    @Test
    public void VerifyInformationSix() {

        log.info("###### Verify Information 6 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.InformationCascade(driver, "Terms and conditions of use");

        log.info("###### Verify Information 6 : > Test End ########" );


    }

    @Test
    public void VerifyInformationSeven() {

        log.info("###### Verify Information 7 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.InformationCascade(driver, "About us");

        log.info("###### Verify Information 7 : > Test End ########" );


    }

    @Test
    public void VerifyInformationEight() {

        log.info("###### Verify Information 8 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.InformationCascade(driver, "Sitemap");

        log.info("###### Verify Information 8 : > Test End ########" );


    }

    @Test
    public void VerifyMyAccountCascade() {

        log.info("###### My Account Cascade 1 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.MyAccountCascade(driver, "My orders");

        log.info("###### Verify My Account Cascade 1 : > Test End ########" );




    }

    @Test
    public void VerifyMyAccountCascadeTwo() {

        log.info("###### Verify My Account Cascade 2 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.MyAccountCascade(driver, "My credit slips");

        log.info("###### Verify My Account Cascade 2 : > Test End ########" );


    }

    @Test
    public void VerifyMyAccountCascadeThree() {

        log.info("###### Verify My Account Cascade 3 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.MyAccountCascade(driver, "My addresses");

        log.info("###### Verify My Account Cascade 3 : > Test End ########" );


    }

    @Test
    public void VerifyMyAccountCascadeFour() {

        log.info("###### Verify My Account Cascade 4 : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.MyAccountCascade(driver, "Manage my personal information");

        log.info("###### Verify My Account Cascade 4 : > Test End ########" );


    }

    @Test
    public void verifyContactUs() {
        log.info("###### Verify Contuct Us : > Test Start ########" );

        homePage = new HomePage(driver);
        homePage.NewContactUs();

        log.info("###### Verify Contuct Us : > Test End ########" );

    }


    @AfterTest
    public void closebrowser() {
        //driver.close();
        //driver.quit();
    }
}
