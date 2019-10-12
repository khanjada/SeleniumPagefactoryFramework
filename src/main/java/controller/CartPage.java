package controller;

import base.ScriptBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends ScriptBase {

    public static final Logger log = Logger.getLogger(CartPage.class.getName());


    @FindBy(xpath = "//*[@id='header']//a[@class='login']")
    WebElement signinButton;


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

    @FindBy(xpath = "//*[@id='homefeatured']//h5[@itemprop='name']/a[@title='Faded Short Sleeve T-shirts']")
    WebElement sleeveTshirts;

    @FindBy(xpath = "//*[@id='homefeatured']//h5[@itemprop='name']/a[@title='Blouse']")
    WebElement blouse;

    @FindBy(css = "#add_to_cart > button > span")
    WebElement addToCart;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    WebElement cartViewTab;

    @FindBy(xpath = "//*[@id='button_order_cart']/span[contains(text(),'Check out')]")
    WebElement cartViewCheckOutTab;

    @FindBy(xpath = "//*[@id='homefeatured']/li[6]//h5/a[@title='Printed Summer Dress']")
    WebElement printedSummereDress;


    @FindBy(xpath = "//*[@class='logo img-responsive']")
    WebElement homePage;

    @FindBy(xpath = "//*[@id='quantity_wanted_p']//i[@class='icon-plus']")
    WebElement cartQuantity;

    @FindBy(xpath = "//i[@class='icon-minus']")
    WebElement cartQuantityDecrease;

    @FindBy(xpath = "//*[@id='homefeatured']/li[3]//h5/a[@title='Printed Dress']")
    WebElement printedDressOne;

    @FindBy(xpath = "//*[@id='homefeatured']/li[4]//h5/a[@class='product-name']")
    WebElement printedDressTwo;

    @FindBy(id = "group_1")
    WebElement sizeSlelect;

    @FindBy(xpath = "//*[@id='add_to_cart']/button")
    WebElement addChartMultiple;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]//span[contains(text(),'10')]")
    WebElement totalQuantityDisplay;

    @FindBy(xpath = "//*[@id='layer_cart']//span[contains(text(),'Proceed to checkout')]")
    WebElement procedToCheckOut;

    @FindBy(xpath = "//*[@id='cart_quantity_down_2_7_0_0']/span")
    WebElement removeProduct;


    @FindBy(linkText = "//*[@id='summary_products_quantity'][contains(text(),'1 Products')]")
    WebElement finalQuantityDisplay;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void VieMyCart(String input, WebDriver driver) {


        myCart.click();
        log.info("My Cart is Clicked:" + myCart.toString());

        ShoppingcartLogoText.isDisplayed();
        log.info("Shopping Cart Logo Text is Displayed:" + ShoppingcartLogoText.toString());

        Assert.assertEquals(ShoppingCartSummary, ShoppingCartSummary);
        log.info("Your shopping cart is empty.:" + ShoppingCartSummary.toString());

        cartSummeryBar(input, driver);
        log.info("Cart summary  Box Successfully Open to Input some value");

        Assert.assertEquals(ShoppingCartEmpty, ShoppingCartEmpty);
        log.info("Your shopping cart is empty.:" + ShoppingCartEmpty.toString());


    }

    public void cartSummeryBar(String input, WebDriver driver) {

        myCart.click();

        log.info("My Cart Tab Is CliCked:" + myCart.toString());

        driver.findElement(By.xpath("//span[contains(text(),'" + input + "')]")).isDisplayed();
        log.info("");
    }


    public void mouseOver(WebElement element, WebDriver driver) {

        Actions actions = new Actions(driver);
        element = element;
        actions.moveToElement(element).perform();

    }

    public void Addcart(WebDriver driver) throws InterruptedException {
        mouseOver(sleeveTshirts, driver);
        log.info("Mouse Over on Fadded Sleeve T-Shirt:" + sleeveTshirts.toString());

        sleeveTshirts.click();
        log.info("Fadded Sleeve T-Shirt Clicked:" + sleeveTshirts.toString());

        addToCart.click();
        log.info("Add to Cart Tab is Clicked:" + addToCart.toString());

        Thread.sleep(1000);
        log.info("Thread Sleep 5000 millis Applying");

        continueShoppingButton.click();
        log.info("Continue Shopping Button is Clicked:" + continueShoppingButton.toString());

        mouseOver(cartViewTab, driver);
        log.info("Mouse Over on Cart view Tab:" + cartViewTab.toString());

        cartViewCheckOutTab.isDisplayed();
        log.info("Cart view Checkout Tab Is Displayed:" + cartViewCheckOutTab.toString());


    }

    public void addCartwithMultipleQuantity(WebDriver driver, String addProduct, int quantity) {

        homePage.click();
        log.info("Home button is Clicked:" + homePage.toString());

        addCartProduct(driver, addProduct);
        log.info("Product Added Successfully:");

        productQuantity(cartQuantity, quantity);
        log.info("Product Quanity Added");

        homePage.click();
        log.info("Home button is Clicked:" + homePage.toString());


    }

    public void removeProductQuantity(WebDriver driver, String addProduct, int quantity) throws InterruptedException {

        homePage.click();
        log.info("Home button is Clicked:" + homePage.toString());

        addCartProduct(driver, addProduct);
        log.info("Product Added Successfully:");

        productQuantity(cartQuantity, quantity);
        log.info("Product Quanity Added");
        addChartMultiple.click();
        Thread.sleep(1000);
        totalQuantityDisplay.isDisplayed();
        procedToCheckOut.click();
        productQuantity(removeProduct, quantity);

        finalQuantityDisplay.isDisplayed();


    }

    public void addCartProduct(WebDriver driver, String addProduct) {

        driver.findElement(By.xpath("//*[@id='homefeatured']/li//h5/a[@title='" + addProduct + "']")).click();

    }

    public void productQuantity(WebElement element, int quantity) {

        for (int i = 0; i < quantity; i++) {
            element.click();

        }


    }

//    public void productQuantityRemove(WebElement element, int quantityRemove) {
//
//        for (int i = 0; i < quantityRemove; i++) {
//            element.click();
//
//        }



    //*[@id='cart_quantity_down_2_7_0_0']/span


    public void addCartMultipleQuantityWithPrintedDress(WebDriver driver, int quantity) {

        homePage.click();
        log.info("Home button is Clicked:" + homePage.toString());

        printedDressOne.click();
        log.info("Printed Dress 1 is clicked:" + printedDressOne.toString());

        productQuantity(cartQuantity, quantity);
        log.info("Product Quanity Added");


    }

    public void addCartMultipleQuantityWithPrintedDressTwo(WebDriver driver, int quantity) {

        homePage.click();
        log.info("Home button is Clicked:" + homePage.toString());

        printedDressTwo.click();
        log.info("Printed Dress 2 is clicked:" + printedDressTwo.toString());

        productQuantity(cartQuantity, quantity);
        log.info("Product Quanity Added");



    }

/*   public void dropdown(WebElement element) {
        element = sizeSlelect;
        Select select = new Select(element);
        select.selectByVisibleText();

    }


    public void DecreaseCartQuantityWithPrintedDressTwo(WebDriver driver,int quantityDec){

        homePage.click();
        printedDressTwo.click();
        productQuantityDec(cartQuantityDecrease,quantityDec);


*/
    }






