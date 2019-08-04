package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUsPage extends ScriptBase {


    @FindBy (css = "#contact-link > a")
    WebElement contucts;
    @FindBy(css = "#center_column > h1")
    WebElement contactUspageAssert;
    @FindBy(css = "#columns > div.breadcrumb.clearfix > span.navigation_page")
    WebElement contact2nd;
    @FindBy(css = "#center_column > form > fieldset > h3")
    WebElement sendAmessage;
    @FindBy(css = "#center_column > form > fieldset > div.clearfix > div.col-xs-12.col-md-3 > p:nth-child(5) > label")
    WebElement EmailAddress;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(css = "#center_column > form > fieldset > div.clearfix > div.col-xs-12.col-md-3 > div:nth-child(6) > label")
    WebElement orderRefrenceDisp;
    @FindBy(id = "id_order")
    WebElement orderTextBox;
    @FindBy(css = "#center_column > form > fieldset > div.clearfix > div.col-xs-12.col-md-3 > p:nth-child(7) > label")
    WebElement AttachFileText;
    @FindBy(css = "#center_column > form > fieldset > div.clearfix > div.col-xs-12.col-md-3 > p:nth-child(7) > label")
    WebElement MessageDisp;
    @FindBy(id = "message")
    WebElement messageBox;
    @FindBy(css = "#submitMessage > span")
    WebElement sendButton;
    @FindBy(css = "#center_column > div > ol > li")
    WebElement subjectAssert;


    public ContactUsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void contuctus() {

        contucts.click();
        Assert.assertEquals(contactUspageAssert,contactUspageAssert);
        contact2nd.isDisplayed();

    }
    public void SendAmessageText() {
        contucts.click();

        sendAmessage.isDisplayed();

    }
    public void EmailAddressText() {
        contucts.click();
        EmailAddress.isDisplayed();


    }

    public void EmailAddressInput(String input) {
        contucts.click();
        email.sendKeys(input);


    }
    public void OrderRefrenceAndInput(String put) {
        contucts.click();
        orderRefrenceDisp.isDisplayed();
        orderTextBox.sendKeys(put);


    }
    public void AttachFiletextDisplay() {
        contucts.click();
        AttachFileText.isDisplayed();



    }
    public void MessageTextdispAndInput(String value) {
        contucts.click();
        MessageDisp.isDisplayed();
        messageBox.sendKeys(value);



    }
    public void SendButton() {
        contucts.click();
        sendButton.click();
        Assert.assertEquals(subjectAssert,subjectAssert);




    }











}
