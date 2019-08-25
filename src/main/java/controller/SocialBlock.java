package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SocialBlock extends ScriptBase {

    public SocialBlock(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void SocialMediaPageVerification(WebDriver driver, String media,String title) {


        driver.findElement(By.xpath("//*[@class='" + media + "']")).click();
        windowhandle(driver,title);

    }

    public void windowhandle(WebDriver driver,String title){

        String winHandleBefore = driver.getWindowHandle();

        for (String winhandle : driver.getWindowHandles()){

            driver.switchTo().window(winhandle);
        }

        String actualTitle = driver.getTitle();
        String expectedTitle = ""+title+"";
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.close();


        driver.switchTo().window(winHandleBefore);

    }


}
