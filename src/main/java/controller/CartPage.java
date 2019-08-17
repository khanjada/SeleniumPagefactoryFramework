package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


    public CartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void VieMyCart(String input,WebDriver driver){

        myCart.click();
        ShoppingcartLogoText.isDisplayed();
        Assert.assertEquals(ShoppingCartSummary,ShoppingCartSummary);
        cartSummeryBar(input,driver);
        Assert.assertEquals(ShoppingCartEmpty,ShoppingCartEmpty);


    }

    public void cartSummeryBar(String input,WebDriver driver){
        myCart.click();

        driver.findElement(By.xpath("//span[contains(text(),'"+input+"')]")).isDisplayed();

    }



}
