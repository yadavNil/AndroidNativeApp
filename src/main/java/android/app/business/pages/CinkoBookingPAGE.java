package android.app.business.pages;

import android.app.utils.core.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.support.PageFactory;
@Getter
public class CinkoBookingPAGE extends BaseTest
{
    private AndroidDriver<AndroidElement> driver;

    public CinkoBookingPAGE() {
        this.driver = BaseTest.androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath="// android.widget.ImageView[@resource-id='com.cinko.app:id/navigationIcon']")
    private MobileElement naviIcon;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search your area']")
    private MobileElement clickTosearch;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search your area']")
    private MobileElement enterTosearch;

//    @AndroidFindBy(xpath="//android.widget.TextView[@text='Yamuna Kunj, Sector-10, New Panvel East, Panvel, Navi Mumbai, Maharashtra, India']")
//    private MobileElement selectedHotel;
      @AndroidFindBy(xpath = "//android.widget.TextView[@text='Senapati Bapat Road']")
              private MobileElement selectedHotel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1/2 mile']")
    private MobileElement selectMileDistance;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2 mile']")
    private MobileElement mileSelected;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Book']")
    private MobileElement bookingDone;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Yes']")
    private MobileElement clickYes;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My Bookings']")
    private MobileElement myBookings;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Previous Bookings']")
    private MobileElement element1;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Invoice']")
    private MobileElement element2;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.cinko.app:id/imgBack']")
    private MobileElement returnToHome;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='vina']")
    private MobileElement bookedHotelName;



}
