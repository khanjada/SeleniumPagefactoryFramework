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
    @Test
    public void VerifyInvalidContactInfo() {
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.InvalidContactInfo("khanjada@hotmail.com", "test","hi","Customer service");


    }


    @Test
    public void VerifyMyCart(){

        contactUsPage = new ContactUsPage(driver);



    }
    @Test
    public void VerifySummary(){

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Summary",driver);


    }
    @Test
    public void VerifySignin(){

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Sign in",driver);


    }
    @Test
    public void VerifyAddres(){

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Address",driver);


    }
    @Test
    public void VerifyShipping(){

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Shipping",driver);


    }
    @Test
    public void Verifypayment(){

        contactUsPage = new ContactUsPage(driver);
        contactUsPage.VieMyCart(" Payment",driver);


    }





      @AfterTest
      public void closebrowser(){
      driver.close();
      driver.quit();
    }





}
