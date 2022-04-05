package android.app.utils.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BaseTest {

    public static AndroidDriver androidDriver;

    public static Logger logger= LogManager.getLogger(BaseTest.class.getName());

    public String getScreenshotpath(String TestCaseName) throws Exception
    {
        String dateName=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

       TakesScreenshot ts=(TakesScreenshot)androidDriver;
        File scrfile=ts.getScreenshotAs(OutputType.FILE);

        String newdest="./ScreenShots/"+TestCaseName+"-"+getDateTime()+".png";

        File destfile=new File(newdest);
        try {
                FileUtils.copyFile(scrfile, destfile.getAbsoluteFile());
                // FileHandler.copy(scrfile, destfile);
        }catch(Exception e) {}
        System.out.println("Screenshot taken");
        return newdest;
    }

    public static void scrollAndClick(String visibleText) {
        androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))." +
                "scrollIntoView(new UiSelector().text(\""+visibleText+"\").instance(0))").click();
    }

    public static String getDateTime()
    {
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        // get current date time with Date()
        Date date = new Date();
        // Now format the date
        String currentDate = dateFormat.format(date);
        String newDate = currentDate.replace('/', '_');
        String newCurrentDate = newDate.replace(':', '.');
        return newCurrentDate;
    }

    public static void refreshPage()
    {
        int deviceWidth = androidDriver.manage().window().getSize().getWidth();
        int deviceHeight = androidDriver.manage().window().getSize().getHeight();
        int midX = (deviceWidth / 2);
        int midY = (deviceHeight / 2);
        int bottomEdge = (int) (deviceHeight * 0.85f);
        new TouchAction(androidDriver)
                .press(point(midX,midY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(midX, bottomEdge))
                .release().perform();
    }
}


