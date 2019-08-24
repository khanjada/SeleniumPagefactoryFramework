package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage extends ScriptBase {


    @FindBy(id = "search_query_top")
    WebElement searchQueryTop;
    @FindBy(xpath = "//*[@id='searchbox']/button")
    WebElement searchButton;
    @FindBy(xpath = "//*[@id='center_column']/h1/span[1]")
    WebElement oneResultfound;
    @FindBy(css = "#header_logo > a > img")
    WebElement homepageNavigation;

    @FindBy(css = "#contact-link > a")
    WebElement contuctUs;
    @FindBy(css = "#center_column > h1")
    WebElement contactUsPageAssert;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void TopSearch(String input, WebDriver driver, String quantity) {

        searchQueryTop.sendKeys(input);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']/h1/span[contains(text(),'" + quantity + " results have been found.')]")).isDisplayed();
        searchQueryTop.clear();
    }

    public void TopSearchone(String input, WebDriver driver, String quantity) {

        searchQueryTop.sendKeys(input);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'" + quantity + " results have been found.')]")).isDisplayed();
        searchQueryTop.clear();
    }

    public void TopSearchTwo(String input, WebDriver driver, String quantity) {

        searchQueryTop.sendKeys(input);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'" + quantity + " result has been found.')]")).isDisplayed();
        searchQueryTop.clear();
    }

    public void TopSearchThree(String input, WebDriver driver, String quantity) {

        searchQueryTop.sendKeys(input);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'" + quantity + " result has been found.')]")).isDisplayed();
        searchQueryTop.clear();
    }

    public void Category(WebDriver driver, String categorySelect) {


        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[@title='" + categorySelect + "']")).isDisplayed();

    }

    public void PopularBestseller(WebDriver driver, String category) {
        homepageNavigation.click();
        driver.findElement(By.xpath("//*[@id='home-page-tabs']/li/a[contains(text(),'" + category + "')]")).isDisplayed();

    }

    public void InformationCascade(WebDriver driver, String types) {


        driver.findElement(By.xpath("//*[@id='block_various_links_footer']/ul/li/a[@title='" + types + "']")).isDisplayed();

    }

    public void MyAccountCascade(WebDriver driver, String mytypes) {


        driver.findElement(By.xpath("//*[@id='footer']/div/section[5]/div/ul/li/a[@title='" + mytypes + "']")).isDisplayed();

    }

    public void NewContactUs() {

        contuctUs.click();

        Assert.assertEquals(contactUsPageAssert, contactUsPageAssert);
    }

}


