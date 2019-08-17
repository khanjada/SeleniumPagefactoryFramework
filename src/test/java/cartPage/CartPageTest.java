package cartPage;

import base.ScriptBase;
import controller.CartPage;
import controller.ContactUsPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartPageTest extends ScriptBase {

    CartPage cartPage;


    @BeforeTest
    public void beforetest(){
        init();
    }



    @Test
    public void VerifyMyCart(){

        cartPage = new CartPage(driver);



    }
    @Test
    public void VerifySummary(){

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Summary",driver);


    }
    @Test
    public void VerifySignin(){

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Sign in",driver);


    }
    @Test
    public void VerifyAddres(){

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Address",driver);


    }
    @Test
    public void VerifyShipping(){

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Shipping",driver);


    }
    @Test
    public void Verifypayment(){

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Payment",driver);


    }




    @AfterTest
    public void closebrowser(){
        driver.close();
        driver.quit();
    }



}
