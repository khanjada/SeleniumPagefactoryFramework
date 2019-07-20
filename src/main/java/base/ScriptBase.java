package base;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScriptBase {
      public WebDriver driver;

      public void init(){
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
       driver = new ChromeDriver();
       driver.get("http://automationpractice.com/index.php");

   }

}
