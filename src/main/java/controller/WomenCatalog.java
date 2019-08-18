package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCatalog extends ScriptBase {


    @FindBy(css ="#block_top_menu > ul > li:nth-child(1) > a") WebElement womenTab;
    @FindBy(css ="#categories_block_left > h2") WebElement womenFilterTab;


    public WomenCatalog(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void WomenProduct(String catalogTab, WebDriver driver) {

        mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[contains(text(),'" + catalogTab + "')]")), driver);


    }

    public void WomenTop(String product, String catalogTab, WebDriver driver) {

        mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[contains(text(),'" + catalogTab + "')]")), driver);
        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/ul/li//a[@title='" + product + "']")).isDisplayed();

    }

    public void WomenDresses(String dressesType, String catalogTab, WebDriver driver) {

        mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[contains(text(),'" + catalogTab + "')]")), driver);
        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/ul/li/a[@title='" + dressesType + "']")).isDisplayed();
    }

    public void womenCatalogeFilter(String filterCatagory,String dressCatagory,WebDriver driver){
        womenTab.click();
        if(womenFilterTab.isDisplayed()){
            driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li/a[contains(text(),'"+filterCatagory+"')]")).click();
            if (womenFilterTab.isDisplayed()){
                driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li/a[contains(text(),'"+dressCatagory+"')]")).isDisplayed();
            }else {
                System.out.println("Women Filter tab notn found "+womenFilterTab);
            }

        }else {
            System.out.println("Women Filter Tab not found "+womenFilterTab);
        }

    }


        public void mouseOver (WebElement element, WebDriver driver){

            Actions actions = new Actions(driver);
            element = element;
            actions.moveToElement(element).perform();

        }


    }
