package android.app.utils.core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportProvider
{
    public static ExtentReports extent;

    public static ExtentReports extentreportProvider()
    {

       ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/CinkoApp_result.html");

        htmlreport.config().setTheme(Theme.DARK);
        htmlreport.config().setDocumentTitle("Appium Result");
        htmlreport.config().setReportName("Test Result");
       // htmlreport.config().setAutoCreateRelativePathMedia(true);
       // htmlreport.config().s

        extent= new ExtentReports();
        extent.attachReporter(htmlreport);
        return extent;
    }

}
