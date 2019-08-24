package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactUsPage extends ScriptBase {


    @FindBy(css = "#contact-link > a")
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
        Assert.assertEquals(contactUspageAssert, contactUspageAssert);
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
        Assert.assertEquals(subjectAssert, subjectAssert);


    }

    public void InvalidContactInfo(String Email, String reference, String message, String valuee) {
        contucts.click();
        Assert.assertEquals(contactUspageAssert, contactUspageAssert);
        dropdown(subjectHeadingSelect, valuee);
        email.sendKeys(Email);
        orderTextBox.sendKeys(reference);
        messageBox.sendKeys(message);
        sendButton.click();
        Assert.assertEquals(messageSent, messageSent);


    }


    public void dropdown(WebElement element, String value) {
        element = subjectHeadingSelect;
        Select select = new Select(element);
        select.selectByVisibleText(value);

    }

    public void VieMyCart(String input, WebDriver driver) {

        myCart.click();
        ShoppingcartLogoText.isDisplayed();
        Assert.assertEquals(ShoppingCartSummary, ShoppingCartSummary);
        cartSummeryBar(input, driver);
        Assert.assertEquals(ShoppingCartEmpty, ShoppingCartEmpty);


    }

    public void cartSummeryBar(String input, WebDriver driver) {
        myCart.click();

        driver.findElement(By.xpath("//span[contains(text(),'" + input + "')]")).isDisplayed();

    }


}
