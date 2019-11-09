package base;

import com.relevantcodes.extentreports.ExtentReports;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.omg.CORBA.Context;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;


public   class ScriptBase {

    public static WebDriver driver;
    public static final Logger log = Logger.getLogger(ScriptBase.class.getName());
    public static final String USERNAME = "khanjada";
    public static final String ACCESS_KEY = "8ff5cf92-8752-4b8f-9f00-2ca54ff894de";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
    private static ExtentReports extent;
    public WebDriverWait wait;


    public WebDriver getDriver() {
        return driver;
    }

    @Parameters("browser")
    @BeforeClass
    public void beforeTest(String browser) throws MalformedURLException {

        if (browser.equalsIgnoreCase("chrome")) {
            String Log4jConfigPath = "log4j.properties";
            PropertyConfigurator.configure(Log4jConfigPath);
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {

            String Log4jConfigPath = "log4j.properties";
            PropertyConfigurator.configure(Log4jConfigPath);
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("sauceLabChrome")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browserName", "chrome");
            caps.setCapability("platform", "macOS 10.13");
            caps.setCapability("version", "latest");
            driver = new RemoteWebDriver(new URL(URL), caps);
//        } else if (browser.equalsIgnoreCase("opera")) {
//
//            String Log4jConfigPath = "log4j.properties";
//            PropertyConfigurator.configure(Log4jConfigPath);
//            System.setProperty("webdriver.opera.driver", "./drivers/operadriver");
//            driver = new OperaDriver();
//        } else if (browser.equalsIgnoreCase("safari")) {
//
//            String Log4jConfigPath = "log4j.properties";
//            PropertyConfigurator.configure(Log4jConfigPath);
//            System.setProperty("webdriver.safari.noinstall", "true");
//            driver = new SafariDriver();
//        }
            driver.get("http://automationpractice.com/index.php");
        }
        driver.get("http://automationpractice.com/index.php");

    }
}