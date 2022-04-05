package android.app.utils.testNG;

import android.app.utils.core.BaseTest;
import android.app.utils.core.ExtentReportProvider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends BaseTest implements ITestListener
{
    public CustomListeners() throws Exception {
        super();
        // TODO Auto-generated constructor stub
    }
    public static ExtentTest test;

    ExtentReports extent= ExtentReportProvider.extentreportProvider();

    @Override
    public void onTestStart(ITestResult result)
    {
        test=extent.createTest(result.getMethod().getMethodName());
        //System.out.println(result.getName()+" test case started");
        test.info(result.getMethod().getMethodName()+" Test Started");
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        test.log(Status.PASS, "Test Successful");
        try
        {
            test.pass(MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotpath(result.getMethod().getMethodName()),result.getMethod().getMethodName()).build());
            test.log(Status.PASS,"Added ScreenShot to Report");
        } catch (Exception e)
        {   e.printStackTrace();}
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        test.log(Status.FAIL,"Test Failed");
        test.fail(result.getThrowable());
        CustomListeners.test.log(Status.FAIL,"Test Failed Taking Screenshot");
        try
        {
           test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotpath(result.getMethod().getMethodName()), result.getMethod().getMethodName()).build());
            test.log(Status.FAIL,"Added ScreenShot to Report");
        } catch (Exception e)
        {  e.printStackTrace();}
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext context) { }

    @Override
    public void onFinish(ITestContext context)
    {
        extent.flush();
    }

}
