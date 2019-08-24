package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends ScriptBase {

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

    @FindBy(css = "#add_to_cart > button > span")
    WebElement addToCart;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    WebElement cartViewTab;

    @FindBy(xpath = "//*[@id='button_order_cart']/span[contains(text(),'Check out')]")
    WebElement cartViewCheckOutTab;


    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
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


    public void mouseOver(WebElement element, WebDriver driver) {

        Actions actions = new Actions(driver);
        element = element;
        actions.moveToElement(element).perform();

    }

    public void Addcart(WebDriver driver) throws InterruptedException {
        mouseOver(sleeveTshirts, driver);
        sleeveTshirts.click();
        addToCart.click();
        Thread.sleep(5000);
        continueShoppingButton.click();
        mouseOver(cartViewTab, driver);
        cartViewCheckOutTab.isDisplayed();


    }


}
