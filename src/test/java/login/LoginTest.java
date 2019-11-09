package login;

import base.ScriptBase;
import controller.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import reporting.ExtentsReport.ExtentTestManager;

import java.net.MalformedURLException;

public class LoginTest extends ScriptBase {
    LoginPage loginPage;

    @Test(alwaysRun =true,priority = 1,description = "Verify Invalid SignIn")
    public void VerifyinvalidSignin() {

        ExtentTestManager.startTest("VerifyinvalidSignin","Invalid SignIn Scenario With Empty user name and Pass");

        log.info("##########  Verify invalid Signin :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.invalidSignin("test@gmail.com", "abdc1234");

        log.info("##########  Verify invalid Signin :> Test End ###########");

    }

    @Test(alwaysRun =true,priority = 2,description = "Verify Valid SignIn")

    public void VerifyValidSignin() {

        ExtentTestManager.startTest("Verify Valid Signin","Valid SignIn Scenario With  user name and Pass");

        log.info("##########  Verify valid Signin :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.validSignin("futureitgroup@gmail.com", "admin123");

        log.info("##########  Verify valid Signin :> Test End ###########");
    }

    @Test(alwaysRun =true,priority = 3,description = "Verify Valid Signin With LogOut")
    public void VerifyValidSigninWithLogOut() {

        ExtentTestManager.startTest("Verify Valid Signin With LogOut","Valid SignIn Scenario With  user name and Pass");

        log.info("##########  Verify Valid Login With LogOut :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.validSigninWithLogOut();

        log.info("##########  Verify Valid Login With LogOut :> Test End ###########");
    }

    @Test(alwaysRun =true,priority = 4,description = "Verify Invalid Create Account")
    public void VerifyInvalidCreateAccount() {

        ExtentTestManager.startTest("Verify Invalid Create Account","Valid SignIn Scenario With  user name and Pass");

        log.info("##########  Verify valid Verify Invalid CreateAccount :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.invalidCreateAccount("abcd");

        log.info("##########  Verify Invalid CreateAccount :> Test End ###########");
    }

    @Test(alwaysRun =true,priority = 5,description = "Verify Invalid SignUp Account")
    public void VerifyInvalidSignUpAccount() {

        ExtentTestManager.startTest("Verify Invalid SignUp Account","Valid SignIn Scenario With  user name and Pass");

        log.info("##########  Verify Invalid SignUp Account :> Test Start ###########");

        loginPage = new LoginPage(driver);
        loginPage.invalidSignup("test420@gmail.com", driver, "Ashraf", "Khan", "test420@gmail.com", "admin1234");

        log.info("##########  Verify Invalid SignUp Account :> Test End ###########");
    }

    @AfterTest
    public void closebrowser() {
       //driver.close();
       //driver.quit();
    }


}
