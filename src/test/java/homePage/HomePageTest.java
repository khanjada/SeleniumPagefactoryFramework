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
        homePage.Category(driver,"Women");


    }
    @Test
    public void VerifyCategoryDresses() {
        homePage = new HomePage(driver);
        homePage.Category(driver,"Dresses");


    }
    @Test
    public void VerifyCategoryTshirt() {
        homePage = new HomePage(driver);
        homePage.Category(driver,"T-shirts");


    }

    @Test
    public void VerifyPopular1() {
        homePage = new HomePage(driver);
        homePage.PopularBestseller(driver,"Popular");


    }

    @Test
    public void VerifyBestseller() {
        homePage = new HomePage(driver);
        homePage.PopularBestseller(driver,"Best Sellers");


    }


    @Test
    public void VerifyInformation() {
        homePage = new HomePage(driver);
        homePage.InformationCascade(driver,"Specials");


    }

    @Test
    public void VerifyInformationTwo() {
        homePage = new HomePage(driver);
        homePage.InformationCascade(driver,"New products");


    }

    @Test
    public void VerifyInformationThree() {
        homePage = new HomePage(driver);
        homePage.InformationCascade(driver,"Best sellers");


    }

    @Test
    public void VerifyInformationFour() {
        homePage = new HomePage(driver);
        homePage.InformationCascade(driver,"Contact us");


    }

    @Test
    public void VerifyInformationFive() {
        homePage = new HomePage(driver);
        homePage.InformationCascade(driver,"Our stores");


    }

    @Test
    public void VerifyInformationSix() {
        homePage = new HomePage(driver);
        homePage.InformationCascade(driver,"Terms and conditions of use");


    }

    @Test
    public void VerifyInformationSeven() {
        homePage = new HomePage(driver);
        homePage.InformationCascade(driver,"About us");


    }

    @Test
    public void VerifyInformationEight() {
        homePage = new HomePage(driver);
        homePage.InformationCascade(driver,"Sitemap");


    }

    @Test
    public void VerifyMyAccountCascade() {
        homePage = new HomePage(driver);
        homePage.MyAccountCascade(driver,"My orders");


    }

    @Test
    public void VerifyMyAccountCascadeTwo() {
        homePage = new HomePage(driver);
        homePage.MyAccountCascade(driver,"My credit slips");


    }

    @Test
    public void VerifyMyAccountCascadeThree() {
        homePage = new HomePage(driver);
        homePage.MyAccountCascade(driver,"My addresses");


    }

    @Test
    public void VerifyMyAccountCascadeFour() {
        homePage = new HomePage(driver);
        homePage.MyAccountCascade(driver,"Manage my personal information");


    }

    @Test
    public void verifyContactUs(){
     homePage = new HomePage(driver);
     homePage.NewContactUs();

    }



    @AfterTest
    public void closebrowser(){
        driver.close();
        driver.quit();
    }
}
