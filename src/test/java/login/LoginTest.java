package login;

import base.ScriptBase;
import controller.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest extends ScriptBase {
    LoginPage loginPage;

    @BeforeTest
    public void beforetest() throws MalformedURLException {

//        init();
        saucelab();

    }


    @Test
    public void VerifyinvalidSignin() {

        log.info("##########  Verify invalid Signin :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.invalidSignin("test@gmail.com", "abdc1234");

        log.info("##########  Verify invalid Signin :> Test End ###########");

    }

    @Test
    public void VerifyValidSignin() {

        log.info("##########  Verify valid Signin :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.validSignin("futureitgroup@gmail.com", "admin123");

        log.info("##########  Verify valid Signin :> Test End ###########");
    }

    @Test
    public void VerifyValidSigninWithLogOut() {

        log.info("##########  Verify Valid Login With LogOut :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.validSigninWithLogOut();

        log.info("##########  Verify Valid Login With LogOut :> Test End ###########");
    }

    @Test
    public void VerifyInvalidCreateAccount() {

        log.info("##########  Verify valid Verify Invalid CreateAccount :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.invalidCreateAccount("abcd");

        log.info("##########  Verify Invalid CreateAccount :> Test End ###########");
    }

    @Test
    public void VerifyInvalidSignUpAccount() {

        log.info("##########  Verify Invalid SignUp Account :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.invalidSignup("test420@gmail.com", driver, "Ashraf", "Khan", "test420@gmail.com", "admin1234");

        log.info("##########  Verify Invalid SignUp Account :> Test End ###########");
    }

    @AfterTest
    public void closebrowser() {
       driver.close();
       driver.quit();
    }


}
