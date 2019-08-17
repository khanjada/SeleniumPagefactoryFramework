package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCatalog extends ScriptBase {


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
        public void mouseOver (WebElement element, WebDriver driver){

            Actions actions = new Actions(driver);
            element = element;
            actions.moveToElement(element).perform();

        }


    }
