package reporting;

import base.ScriptBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.Utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ListenerOld extends ScriptBase implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName=result.getName();
        if (result.isSuccess()){
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                String reportDirectory=new
                        File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/successScreenShots";
                File destFile=new
                        File((String)reportDirectory+"/"+methodName+"_"+formater.format(calendar.getTime())+".png");

                //Utils.(srcFile,destFile);
                Reporter.log("<a href='"+destFile.getAbsolutePath()+"'><image src='"+destFile.getAbsolutePath()+"'height='100'/></a>");


            }catch(Exception e){


            }
        }

    }

    @Override
    public void onTestFailure(ITestResult result) {
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName=result.getName();
        if (result.getStatus()==ITestResult.FAILURE){
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                String reportDirectory=new
                        File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/FailureScreenShots";
                File destFile=new
                        File((String)reportDirectory+"/"+methodName+"_"+formater.format(calendar.getTime())+".png");
                //Utils.copyFile(srcFile,destFile);
                Reporter.log("<a href='"+destFile.getAbsolutePath()+"'><image src='"+destFile.getAbsolutePath()+"'height='100'/></a>");


            }catch(Exception e){


            }
        }

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
