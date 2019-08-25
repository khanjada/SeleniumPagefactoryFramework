package socialBlock;

import base.ScriptBase;
import controller.SocialBlock;
import controller.WomenCatalog;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SocialBlockTest extends ScriptBase {


SocialBlock socialBlock;


    @BeforeTest
    public void beforetest() {
        init();
    }


    @Test
    public void verifyGooglePlus() {

        socialBlock = new SocialBlock(driver);
        socialBlock.SocialMediaPageVerification(driver,"google-plus", "Sign in - Google Accounts");
    }

    @Test
    public void verifyfaceBook() {

        socialBlock = new SocialBlock(driver);
        socialBlock.SocialMediaPageVerification(driver,"facebook", "Selenium Framework Public Group | Facebook");
    }
    @Test
    public void verifyTwitter() {

        socialBlock = new SocialBlock(driver);
        socialBlock.SocialMediaPageVerification(driver,"twitter", "Selenium Framework (@seleniumfrmwrk) | Twitter");
    }
    @Test
    public void verifyYoutube() {

        socialBlock = new SocialBlock(driver);
        socialBlock.SocialMediaPageVerification(driver,"youtube", "Selenium Framework - YouTube");
    }





    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();
    }


}
