package contactUsPage;

import base.ScriptBase;
import controller.ContactUsPage;
import controller.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactUsTest extends ScriptBase {

    ContactUsPage contactUsPage;


    @BeforeTest
    public void beforetest(){
        init();
    }

    @Test
    public void VerifyContuctUs() {
        contactUsPage = new ContactUsPage (driver);
        contactUsPage.contuctus();


    }

    @Test
    public void VerifySendAmessagetext() {
        contactUsPage = new ContactUsPage (driver);
        contactUsPage.SendAmessageText();


    }
    @Test
    public void VerifyEmailAdressDisplay() {
        contactUsPage = new ContactUsPage (driver);
        contactUsPage.EmailAddressText();


    }
    @Test
    public void VerifyEmailAdressInput() {
        contactUsPage = new ContactUsPage (driver);
        contactUsPage.EmailAddressInput("khanjada@hotmail.com");


    }
    @Test
    public void VerifyOrderRefrenceAndInput() {
        contactUsPage = new ContactUsPage (driver);
        contactUsPage.OrderRefrenceAndInput("janina");


    }


    @Test
    public void VerifyAttachFileTextDisplay() {
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.AttachFiletextDisplay();


    }
    @Test
    public void VerifyMessageTextDispAndInput() {
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.MessageTextdispAndInput("hi every one");


    }

    @Test
    public void VerifySendButton() {
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.SendButton();


    }

    @AfterTest
    public void closebrowser(){
//        driver.close();
//        driver.quit();
    }

}
