package socialBlock;

import base.ScriptBase;
import controller.SocialBlock;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class  SocialBlockTest extends ScriptBase {


    SocialBlock socialBlock;


    @BeforeTest
    public void beforetest() throws MalformedURLException {

//        init();
  //      saucelab();
    }


    @Test
    public void verifyGooglePlus() {

        log.info("####### Verify Google plus ########:  > Test Start ");

        socialBlock = new SocialBlock(driver);
        socialBlock.SocialMediaPageVerification(driver, "google-plus", "Sign in - Google Accounts");

        log.info("####### Verify Google plus ########:  > Test End ");
    }

    @Test
    public void verifyFaceBook() {

        log.info("####### Verify FaceBook ########:  > Test Start ");

        socialBlock = new SocialBlock(driver);
        socialBlock.SocialMediaPageVerification(driver, "facebook", "Selenium Framework Public Group | Facebook");

        log.info("#######  Verify FaceBook ########:  > Test End ");
    }

    @Test
    public void verifyTwitter() {

        log.info("####### Verify Twitter ########:  > Test Start ");


        socialBlock = new SocialBlock(driver);
        socialBlock.SocialMediaPageVerification(driver, "twitter", "Selenium Framework (@seleniumfrmwrk) | Twitter");

        log.info("####### Verify Twitter ########:  > Test End ");
    }

    @Test
    public void verifyYoutube() {

        log.info("####### Verify Youtube ########:  > Test Start ");

        socialBlock = new SocialBlock(driver);
        socialBlock.SocialMediaPageVerification(driver, "youtube", "Selenium Framework - YouTube");

        log.info("####### Verify Youtube ########:  > Test End ");
    }


    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();
    }


}
