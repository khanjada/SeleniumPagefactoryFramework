package reporting.Listeners;

import base.ScriptBase;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reporting.ExtentsReport.ExtentManager;
import reporting.ExtentsReport.ExtentTestManager;

import java.sql.SQLOutput;

public class Listener extends ScriptBase implements ITestListener {


    private static String getTestMethodName(ITestResult iTestResult){
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("I Am in OnStart"+context.getName());
        context.setAttribute("WebDriver",this.driver);
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("I Am in OnFinish"+context.getName());
        ExtentTestManager.endTest();
        ExtentManager.getReporter().flush();
    }
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("I Am in OnTestStart"+getTestMethodName(result) +"Start");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("I Am in OnTestSuccess"+getTestMethodName(result) +"Succeed");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Test Passed ");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("I am On OnTestFailure"+getTestMethodName( result)+"Failed");
        Object testClass= result.getInstance();
        WebDriver webDriver=((ScriptBase)testClass).getDriver();
        String base64Screenshot="data:image/png;base64,"+((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BASE64);
        ExtentTestManager.getTest().log(LogStatus.FAIL,"Test Failed",ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("I Am in onTestSkipped"+getTestMethodName(result) +"Skipped");
        ExtentTestManager.getTest().log(LogStatus.SKIP,"Test Skipped ");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("I Am in onTestFailedButWithinSuccessPercentage"+getTestMethodName(result));

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }




}
