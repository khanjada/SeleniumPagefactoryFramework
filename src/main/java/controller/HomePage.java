package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends ScriptBase {

//    @FindBy(linkText = "Call us now: ")
//    WebElement callusNow;
    @FindBy(id = "search_query_top")
    WebElement searchQueryTop;
    @FindBy(xpath = "//*[@id='searchbox']/button")
    WebElement searchButton;
    @FindBy(xpath = "//*[@id='center_column']/h1/span[1]")
    WebElement oneResultfound;



    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


//public void DispInfo(){
//        callusNow.isDisplayed();
//
//
//
//}
public  void TopSearch(String input,WebDriver driver,String quantity){

        searchQueryTop.sendKeys(input);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']/h1/span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();


}



}


