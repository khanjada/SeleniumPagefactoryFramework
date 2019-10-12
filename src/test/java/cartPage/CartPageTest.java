package cartPage;

import base.ScriptBase;
import controller.CartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CartPageTest extends ScriptBase {

    CartPage cartPage;


    @BeforeTest
    public void beforetest() throws MalformedURLException {

//        init();

        saucelab();
    }


    @Test
    public void VerifyMyCart() {
        log.info("########  Verify Summary  >Test Start ###########");

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Summary", driver);

        log.info("########  Verify Summary  >Test End ###########");


    }

    @Test
    public void VerifySummary() {
        log.info("########  Verify Summary  >Test Start ###########");

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Summary", driver);

        log.info("########  Verify Summary  >Test Start ###########");


    }

    @Test
    public void VerifyAddres() {
        log.info("########  Verify Address  >Test Start ###########");

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Address", driver);

        log.info("########  Verify Address  >Test End ###########");


    }

    @Test
    public void VerifyShipping() {
        log.info("########  VerifyShopping  >Test Start ###########");

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Shipping", driver);

        log.info("########  VerifyShopping  >Test End ###########");


    }

    @Test
    public void Verifypayment() {
        log.info("########  Verify Payment  >Test Start ###########");

        cartPage = new CartPage(driver);
        cartPage.VieMyCart(" Payment", driver);

        log.info("########  Verify Payment  >Test End ###########");


    }

    @Test
    public void VerifyAddCart() throws InterruptedException {
        log.info("########  VerifyAddCart  Test Start ###########");

        cartPage = new CartPage(driver);
        cartPage.Addcart(driver);

        log.info("########  VerifyAddCart  Test End ###########");


    }

    @Test
    public void VerifyAddCartMultipleBlouseProduct() {
        log.info("######## Verify AddCart Multiple Blouse Product  >Test Start ###########");

        cartPage = new CartPage(driver);
        cartPage.addCartwithMultipleQuantity(driver, "Blouse", 6);

        log.info("######## Verify AddCart Multiple Blouse Product  >Test End ###########");


    }

    @Test
    public void VerifyAddCartMultipleFadedSleeveProduct() {
        log.info("######## Verify AddCart Multiple FadedSleeveProduct  >Test Start ###########");

        cartPage = new CartPage(driver);
        cartPage.addCartwithMultipleQuantity(driver, "Faded Short Sleeve T-shirts", 6);

        log.info("########  Verify Add Cart Multiple FadedSleeveProduct  >Test End ###########");

    }

    @Test
    public void VerifyAddCartMultiplePrintedDressTWo() {
        log.info("######## Verify Add Cart Multiple Printed Dress 2nd  >Test Start ###########");

        cartPage = new CartPage(driver);
        cartPage.addCartMultipleQuantityWithPrintedDressTwo(driver, 7);

        log.info("######## Verify Add Cart Multiple Printed Dress 2nd  >Test End ###########");


    }

    @Test
    public void verifCartMultipleQuantityWithPrintedDressOne() {
        log.info("######## Verify Cart Multiple Quantity With Printed Dress 1st  >Test Start ###########");
        cartPage = new CartPage(driver);
        cartPage.addCartMultipleQuantityWithPrintedDress(driver, 10);
        log.info("######## Verify Cart Multiple Quantity With Printed Dress 1st  >Test End ###########");

    }

    @Test
    public void VerifyRemoveProduct() {
        log.info("######## VerifyRemoveProduct  >Test Start ###########");

        cartPage = new CartPage(driver);
       // cartPage.removeProductQuantity(driver, "Blouse", 9);

        log.info("######## VerifyRemoveProduct >Test End ###########");


    }


//    @Test
//    public void VerifyDecreasetMultiplePrintedDressTwo()  {
//        cartPage = new CartPage(driver);
//        cartPage.productQuantityDecrease(driver,30);
//
//
//    }


    @AfterTest
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }


}
