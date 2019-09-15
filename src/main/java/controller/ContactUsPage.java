package controller;

import base.ScriptBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactUsPage extends ScriptBase {

    public static final Logger log = Logger.getLogger(ContactUsPage.class.getName());

    @FindBy(css = "#contact-link > a")
    WebElement contucts;

    @FindBy(css = "#center_column > h1")
    WebElement contactUspageAssert;

    @FindBy(css = "#columns > div.breadcrumb.clearfix > span.navigation_page")
    WebElement contact2nd;

    @FindBy(xpath = "//*[@id='submitMessage']")
    WebElement sendButon;

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

    @FindBy(xpath = "//p[@class='alert alert-success']")
    WebElement messageSent;

    @FindBy(css = "#center_column > div > ol > li")
    WebElement subjectAssert;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    WebElement myCart;

    @FindBy(xpath = "//span[@class='navigation_page'] ")
    WebElement ShoppingcartLogoText;

    @FindBy(xpath = "//*[@id='cart_title']")
    WebElement ShoppingCartSummary;

    @FindBy(xpath = "//*[@class='alert alert-warning']")
    WebElement ShoppingCartEmpty;

    @FindBy(id = "id_contact")
    WebElement subjectHeadingSelect;


    public ContactUsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void contuctus() {

        contucts.click();
        log.info("Contact Us Tab Is Clicked:" + contucts.toString());

        Assert.assertEquals(contactUspageAssert, contactUspageAssert);
        log.info("CUSTOMER SERVICE - CONTACT US:" + contactUspageAssert.toString());


    }

    public void SendTabText() {

        contucts.click();
        log.info("Contact Us Tab Is Clicked:" + contucts.toString());

        sendButon.isDisplayed();
        log.info("Send Button is Displayed :" + sendButon.toString());

    }

    public void EmailAddressText() {
        contucts.click();
        log.info("Contact Us Tab Is Clicked:" + contucts.toString());

        EmailAddress.isDisplayed();
        log.info("Email Addess Field IS displayed:" + EmailAddress.toString());


    }

    public void EmailAddressInput(String input) {

        contucts.click();
        log.info("Contact Us Tab Is Clicked:" + contucts.toString());

        email.sendKeys(input);
        log.info("Email Field is ready to Put some value:" + email.toString());


    }

    public void OrderRefrenceAndInput(String put) {

        contucts.click();
        log.info("Contact Us Tab Is Clicked:" + contucts.toString());

        orderRefrenceDisp.isDisplayed();
        log.info("Order Refrence Displayed:" + orderRefrenceDisp.toString());

        orderTextBox.sendKeys(put);
        log.info("Order Text Box:" + orderTextBox.toString());


    }

    public void AttachFiletextDisplay() {

        contucts.click();
        log.info("Contact Us Tab Is Clicked:" + contucts.toString());

        AttachFileText.isDisplayed();
        log.info("Attach File Text displayed:" + AttachFileText.toString());


    }

    public void MessageTextdispAndInput(String value) {

        contucts.click();
        log.info("Contact Us Tab Is Clicked:" + contucts.toString());

        MessageDisp.isDisplayed();
        log.info("Message text Displayed:" + MessageDisp.toString());

        messageBox.sendKeys(value);
        log.info("Message Box is ready to put Some value:" + messageBox.toString());


    }

    public void SendButton() {

        contucts.click();
        log.info("Contact Us Tab Is Clicked:" + contucts.toString());

        sendButton.click();
        log.info("Send Button Is Clicked:" + sendButton.toString());

        Assert.assertEquals(subjectAssert, subjectAssert);
        log.info("There is 1 error,Invalid email address.:" + subjectAssert.toString());


    }

    public void InvalidContactInfo(String Email, String reference, String message, String valuee) {

        contucts.click();
        log.info("Contact Us Tab Is Clicked:" + contucts.toString());

        Assert.assertEquals(contactUspageAssert, contactUspageAssert);
        log.info("CUSTOMER SERVICE - CONTACT US:" + contactUspageAssert.toString());

        dropdown(subjectHeadingSelect, valuee);
        log.info("Drop Down Working:" + subjectHeadingSelect.toString());

        email.sendKeys(Email);
        log.info("Email Field is Ready to put Invalid Email Address;" + email.toString());

        orderTextBox.sendKeys(reference);
        log.info("Order Text Box is Ready to put Sendkey" + orderTextBox.toString());

        messageBox.sendKeys(message);
        log.info("Message Box is Ready to put Sendkey" + messageBox.toString());

        sendButton.click();
        log.info("Send Button Clicked" + sendButton.toString());

        Assert.assertEquals(messageSent, messageSent);
        log.info("Your message has been successfully sent to our team.:" + messageSent.toString());


    }


    public void dropdown(WebElement element, String value) {
        element = subjectHeadingSelect;
        Select select = new Select(element);
        select.selectByVisibleText(value);

    }

    public void VieMyCart(String input, WebDriver driver) {

        myCart.click();
        log.info("My Cart is Clicked:" + myCart.toString());

        ShoppingcartLogoText.isDisplayed();
        log.info("Shopping cart Logo Text Displayed:" + ShoppingcartLogoText.toString());

        Assert.assertEquals(ShoppingCartSummary, ShoppingCartSummary);
        log.info("SHOPPING-CART SUMMARY:" + ShoppingCartSummary.toString());


        cartSummeryBar(input, driver);

        Assert.assertEquals(ShoppingCartEmpty, ShoppingCartEmpty);
        log.info("Your shopping cart is empty.:" + ShoppingCartEmpty.toString());


    }

    public void cartSummeryBar(String input, WebDriver driver) {

        myCart.click();
        log.info("My Cart Tab is Clicked:" + myCart.toString());

        driver.findElement(By.xpath("//span[contains(text(),'" + input + "')]")).isDisplayed();


    }


}
