package contactUsPage;

import base.ScriptBase;
import controller.ContactUsPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ContactUsTest extends ScriptBase {

    ContactUsPage contactUsPage;


    @BeforeTest
    public void beforetest() throws MalformedURLException {
//        init();
        //saucelab();
    }

    @Test
    public void VerifyContuctUs() {
        log.info("##### Verify Contuct Us ######:+ >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.contuctus();

        log.info("##### Verify Contuct Us ######:+ >Test End");


    }

    @Test
    public void VerifySendButtonPic() {
        log.info("##### Verify Send A message text ######:+ >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.SendTabText();

        log.info("##### Verify Send A message text ######:+ >Test End");


    }

    @Test
    public void VerifyEmailAdressDisplay() {
        log.info("##### Verify Email Adress Display ######:+ >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.EmailAddressText();

        log.info("##### Verify Email Adress Display ######:+ >Test End");


    }

    @Test
    public void VerifyEmailAdressInput() {
        log.info("##### Verify Email Adress Input ######:+ >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.EmailAddressInput("khanjada@hotmail.com");

        log.info("##### Verify Email Adress Input ######:+ >Test End");


    }

    @Test
    public void VerifyOrderRefrenceAndInput() {

        log.info("##### Verify Order Refrence And Input ######:+ >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.OrderRefrenceAndInput("janina");

        log.info("##### Verify Order Refrence And Input ######:+ >Test End");


    }


    @Test
    public void VerifyAttachFileTextDisplay() {

        log.info("####### Verify Attach File Text Display ########:  >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.AttachFiletextDisplay();

        log.info("####### Verify Attach File Text Display ########:  >Test End");


    }

    @Test
    public void VerifyMessageTextDispAndInput() {

        log.info("####### Verify Message Text Disp And Input ########:  >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.MessageTextdispAndInput("hi every one");

        log.info("####### Verify Message Text Disp And Input ########:  >Test End");


    }

    @Test
    public void VerifySendButton() {

        log.info("####### Verify Send Button ########:  >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.SendButton();

        log.info("####### Verify Send Button ########:  >Test End");


    }

    @Test
    public void VerifyInvalidContactInfo() {

        log.info("####### Verify Invalid Contact Information ########:  >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.InvalidContactInfo("khanjada@hotmail.com", "test", "hi", "Customer service");

        log.info("####### Verify Invalid Contact Information ########:  >Test End");

    }


    @Test
    public void VerifySummary() {

        log.info("####### Verify Summary ########:  >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Summary", driver);

        log.info("####### Verify Summary ########:  >Test End");


    }

    @Test
    public void VerifySignin() {

        log.info("####### Verify Signin ########:  >Test Start");


        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Sign in", driver);

        log.info("####### Verify Signin ########:  >Test End");


    }

    @Test
    public void VerifyAddres() {

        log.info("####### Verify Addres ########:  >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Address", driver);

        log.info("####### Verify Addres ########:  >Test End");


    }

    @Test
    public void VerifyShipping() {

        log.info("####### Verify Shipping ########:  >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Shipping", driver);

        log.info("####### Verify Shipping ########:  >Test End");


    }

    @Test
    public void Verifypayment() {

        log.info("####### Verify Payment ########:  >Test Start");

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Payment", driver);

        log.info("####### Verify Payment ########:  >Test End");


    }


    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();
    }


}
