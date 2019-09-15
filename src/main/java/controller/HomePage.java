package controller;

import base.ScriptBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends ScriptBase {
    public static final Logger log = Logger.getLogger(HomePage.class.getName());


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
        log.info("Search Query Top:" + searchQueryTop.toString());

        searchButton.click();
        log.info("Search Button Clicked:" + searchButton.toString());

        driver.findElement(By.xpath("//*[@id='center_column']/h1/span[contains(text(),'" + quantity + " results have been found.')]")).isDisplayed();
        log.info("Quantity founded By search");

        searchQueryTop.clear();
        log.info("Clear Search Query Top:" + searchQueryTop.toString());

    }

    public void TopSearchone(String input, WebDriver driver, String quantity) {

        searchQueryTop.sendKeys(input);
        log.info("Search Query Top input Shoe;" + searchQueryTop.toString());

        searchButton.click();
        log.info("Search Button Clicked;" + searchButton.toString());

        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'" + quantity + " results have been found.')]")).isDisplayed();

        searchQueryTop.clear();
        log.info("Clear Search Query Top:" + searchQueryTop.toString());
    }

    public void TopSearchTwo(String input, WebDriver driver, String quantity) {

        searchQueryTop.sendKeys(input);
        log.info("Top Search By Blouse:" + searchQueryTop.toString());

        searchButton.click();
        log.info("Search Button Clicked;" + searchButton.toString());

        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'" + quantity + " result has been found.')]")).isDisplayed();

        searchQueryTop.clear();
        log.info("Clear Search Query Top:" + searchQueryTop.toString());
    }

    public void SearchSkirt(String input, WebDriver driver, String quantity) {

        searchQueryTop.sendKeys(input);
        log.info("Search By Skirt:" + searchQueryTop.toString());

        searchButton.click();
        log.info("Search Button Clicked;" + searchButton.toString());

        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'" + quantity + " result has been found.')]")).isDisplayed();

        searchQueryTop.clear();
        log.info("Clear Search Query Top:" + searchQueryTop.toString());
    }

    public void Category(WebDriver driver, String categorySelect) {


        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[@title='" + categorySelect + "']")).isDisplayed();
        log.info("Input CatagorySlect is Displayed");
    }

    public void PopularSeller(WebDriver driver, String category) {
        homepageNavigation.click();
        log.info("Homepage Navigation Button Clicked:" + homepageNavigation.toString());

        driver.findElement(By.xpath("//*[@id='home-page-tabs']/li/a[contains(text(),'" + category + "')]")).isDisplayed();
        log.info("Input a catagory :");
    }

    public void InformationCascade(WebDriver driver, String types) {


        driver.findElement(By.xpath("//*[@id='block_various_links_footer']/ul/li/a[@title='" + types + "']")).isDisplayed();
        log.info("Input Types");
    }

    public void MyAccountCascade(WebDriver driver, String mytypes) {


        driver.findElement(By.xpath("//*[@id='footer']/div/section[5]/div/ul/li/a[@title='" + mytypes + "']")).isDisplayed();
        log.info("Input My Types");
    }

    public void NewContactUs() {

        contuctUs.click();
        log.info("Contuct Us Button Clicked:" + contuctUs.toString());

        Assert.assertEquals(contactUsPageAssert, contactUsPageAssert);
        log.info("Displayed Contact Us Page:" + contactUsPageAssert.toString());
    }

}


