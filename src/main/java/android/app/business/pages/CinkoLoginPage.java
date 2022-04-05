package android.app.business.pages;

import android.app.utils.core.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class CinkoLoginPage extends BaseTest
{
    private AndroidDriver<AndroidElement> driver;

    public CinkoLoginPage() {
        this.driver = BaseTest.androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="//android.widget.Button[@text='Skip']")
    private MobileElement skipCinko;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Login']")
    private MobileElement loginCinko;


    @AndroidFindBy(xpath="//android.widget.EditText[@text='Email Address']")
    private MobileElement emailCinko;
    @AndroidFindBy(xpath="//android.widget.EditText[@text='Password']")
    private MobileElement passwordCinko;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Sign In']")
    private MobileElement signInCinko;


    @AndroidFindBy(xpath="//android.widget.Button[@text='Book']")
    private MobileElement bookIn;

    @AndroidFindBy(xpath="// android.widget.Button[@text='LOCATE ME']")
    private MobileElement locateMe;

    @AndroidFindBy(xpath="// android.widget.ImageView[@resource-id='com.cinko.app:id/navigationIcon']")
    private MobileElement naviIcon;

    @AndroidFindBy(xpath="// android.widget.TextView[@text='My Ticket']")
    private MobileElement myTicket;

    @AndroidFindBy(xpath="// android.widget.TextView[@text='Add Tickets']")
    private MobileElement addTicket;

    @AndroidFindBy(xpath="// android.widget.TextView[@text='High']")
    private MobileElement selectPriority;
    @AndroidFindBy(xpath="// android.widget.TextView[@text='Medium']")
    private MobileElement MediumPriority;


    @AndroidFindBy(xpath="// android.widget.Spinner[@resource-id='com.cinko.app:id/spr_category']")
    private MobileElement selectCategoryOption;

    @AndroidFindBy(xpath="// android.widget.TextView[@text='New Tickets']")
    private MobileElement newTicket;

    @AndroidFindBy(xpath="// android.widget.EditText[@text='Choose File']")
    private MobileElement chooseFileOption;
    @AndroidFindBy(xpath="// android.widget.TextView[@text='Take Photo']")
    private MobileElement  takePhoto;

    @AndroidFindBy(xpath="// android.widget.ImageView[@resource-id='com.oppo.camera:id/shutter_button']")
    private MobileElement  clickPhoto;
    @AndroidFindBy(xpath="// android.widget.ImageView[@resource-id='com.oppo.camera:id/done_button']")
    private MobileElement  donePhoto;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"Submit\"))")
    private  MobileElement finalSubmit;

    @AndroidFindBy(xpath="// android.widget.EditText[@text='Subject']")
    private MobileElement subject;
    @AndroidFindBy(xpath="// android.widget.EditText[@text='Description']")
    private MobileElement description;
    @AndroidFindBy(xpath="// android.widget.TextView[@text='Submit']")
    private MobileElement submitButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"New Testing By Me\"))")
    private  MobileElement addedSubject;




}
