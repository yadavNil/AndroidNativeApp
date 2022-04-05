package android.app.utils.core;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitUtils extends BaseTest
{
   // BaseTest.androidDriver.
 public static void waitforSeconds(int seconds)
 {
     BaseTest.androidDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
 }

 public static void waitUntilVisibilityOfElement(MobileElement element)
 {
     WebDriverWait wait = new WebDriverWait(androidDriver, 30);
     //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
     //wait.until(ExpectedConditions.visibilityOfElementLocated((By)element));
     //you cannot pass the web element in place of XPath because the
     // method 'visibilityOfElementLocated()' will accept only By locator.

     wait.until(ExpectedConditions.visibilityOf(element));
    // return element;
 }


    public static void waitUntilElementToBeClickable(MobileElement element)
    {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

//    public static void visibilityOfElement(By xpath)
//        {
//            WebDriverWait wait = new WebDriverWait(androidDriver, 30);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()));
//        }





}
