package controller;

import base.ScriptBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPage extends ScriptBase {

    public static final Logger log = Logger.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//a[@class='login']")
    WebElement signinButton;


    @FindBy(id = "passwd")
    WebElement passwordSendKey;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    WebElement submitButton;

    @FindBy(linkText = "Zaman Dewan")
    WebElement signInSuccessful;

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    WebElement signInMessageFailed;

    @FindBy(xpath = "//*[@id='header']//a[@title='Log me out']")
    WebElement signOut;

    @FindBy(id = "email_create")
    WebElement emailCreateInput;

    @FindBy(css = "#SubmitCreate > span")
    WebElement submitCreateAccountButton;

    @FindBy(xpath = "//*[@id='create_account_error']")
    WebElement inValidEmailErrorMessage;

    @FindBy(css = "#id_gender1")
    WebElement titleMrButton;

    @FindBy(id = "customer_firstname")
    WebElement firstNameSendKey;

    @FindBy(id = "customer_lastname")
    WebElement lastNameSendKey;


    @FindBy(id = "passwd")
    WebElement signupPassword;

    @FindBy(css = "#submitAccount > span")
    WebElement submitRegisterButton;

    @FindBy(xpath = "//*[@id='center_column']/div")
    WebElement invalidSignpErrorMessage;

    @FindBy(xpath = "//*[@id='email']")
    WebElement emailBox;

    @FindBy(xpath = "//*[@id='passwd']")
    WebElement validPasswrd;

    @FindBy(xpath = "//*[@id='header_logo']//img[@class='logo img-responsive']")
    WebElement homepage;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void invalidSignin(String email, String password) {

        signinButton.click();
        log.info("Signin Button Clicked:"+signinButton.toString());

        emailBox.sendKeys(email);
        log.info("Email SendKey Is Given::"+emailBox.toString());

        passwordSendKey.sendKeys(password);
        log.info("Password SendKey Is Given:"+passwordSendKey.toString());

        submitButton.click();
        log.info("submit Button Clicked:"+submitButton.toString());


        Assert.assertEquals(signInMessageFailed, signInMessageFailed);
        log.info("There are 6 errors:"+signInMessageFailed.toString());


    }

    public void validSignin(String email, String password) {

        signinButton.click();
        log.info("Signin Button clicked:"+signinButton.toString());

        emailBox.sendKeys(email);
        log.info("Email SendKey Is Given::"+emailBox.toString());

        passwordSendKey.sendKeys(password);
        log.info("Password SendKey Is Given:"+passwordSendKey.toString());

        submitButton.click();
        log.info("submit Button Clicked:"+submitButton.toString());

        Assert.assertEquals(signInSuccessful, signInSuccessful);
        log.info("SignIn Successful Showedup:"+signInSuccessful.toString());

        signOut.click();
        log.info("Sign out Button clicked"+signOut.toString());
    }

    public void validSigninWithLogOut() {

        signinButton.click();
        log.info("Signin Button clicked:"+signinButton.toString());

        emailBox.sendKeys("futureitgroup@gmail.com");
        log.info("Email Box is Filledup with email:"+emailBox.toString());


        validPasswrd.sendKeys("admin123");
        log.info("Valid pass is given By sendkey:"+validPasswrd.toString());


        submitButton.click();
        log.info("submit Button Clicked:"+submitButton.toString());



        signOut.click();
        log.info("Sign out Button clicked"+signOut.toString());
    }

    public void invalidCreateAccount(String email) {

        signinButton.click();
        log.info("Signin Button clicked:"+signinButton.toString());

        emailCreateInput.sendKeys(email);
        log.info("Invalid Email Address Given"+emailCreateInput.toString());

        submitCreateAccountButton.click();
        log.info("Submit Creat account Button is Clicked:"+emailCreateInput.toString());

        Assert.assertEquals(inValidEmailErrorMessage, inValidEmailErrorMessage);
        log.info("InValid Email Error Message is Displayed:" +inValidEmailErrorMessage.toString());


    }


    public void invalidSignup(String email, WebDriver driver, String firstname, String lastname, String signupemail, String signuppassword) {

        signinButton.click();
        log.info("Signin Button clicked:"+signinButton.toString());

        emailCreateInput.sendKeys(email);
        log.info("Invalid Email Address Given"+emailCreateInput.toString());

        submitCreateAccountButton.click();
        log.info("Submit Creat account Button is Clicked:"+emailCreateInput.toString());

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        log.info("driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)");

        titleMrButton.click();
        log.info("Title Mr Button Clicked:"+titleMrButton.toString());

        firstNameSendKey.sendKeys(firstname);
        log.info("First Name SendKey:"+firstNameSendKey.toString());

        lastNameSendKey.sendKeys(lastname);
        log.info("Last Name SendKey:"+lastNameSendKey.toString());

        emailBox.sendKeys(signupemail);
        log.info("Signup Email - Sendkey:"+emailBox.toString());

        signupPassword.sendKeys(signuppassword);
        log.info("Signup Password - Sendkey:"+signupPassword.toString());

        submitRegisterButton.click();
        log.info("Submit  Register Button is Clicked:"+submitRegisterButton.toString());

        Assert.assertEquals(invalidSignpErrorMessage, invalidSignpErrorMessage);
        log.info("There are 6 errors"+invalidSignpErrorMessage.toString());


        homepage.click();
        log.info("Back to Home Page"+homepage.toString());




    }
}

