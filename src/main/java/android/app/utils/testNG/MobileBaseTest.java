package android.app.utils.testNG;

import android.app.business.AppiumServiceHelper;
import android.app.utils.core.BaseTest;
import android.app.utils.core.ProperitesFiles;
import com.testinium.deviceinformation.DeviceInfo;
import com.testinium.deviceinformation.DeviceInfoImpl;
import com.testinium.deviceinformation.device.DeviceType;
import com.testinium.deviceinformation.model.Device;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class MobileBaseTest extends BaseTest {


    private int aapiumPort = 4723;

    @BeforeSuite
    public void serviceSetup() throws Exception {
        AppiumServiceHelper.startDefaultService(aapiumPort);

        DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ANDROID);
        DesiredCapabilities capabilites = new DesiredCapabilities();

        capabilites.setCapability(MobileCapabilityType.APP, "D:\\Nilesh_Appium_Project\\AndroidNativeApp\\src\\main\\java\\android\\app\\apkFile\\Cinko_dev_17.apk");

        if (deviceInfo.anyDeviceConnected()) {
            Device device = deviceInfo.getFirstDevice();
            capabilites.setCapability("deviceName", device.getModelNumber());
            capabilites.setCapability("udid", device.getUniqueDeviceID());
            capabilites.setCapability("platformVersion", device.getProductVersion());
            capabilites.setCapability("platformName", device.getDeviceProductName());
            capabilites.setCapability("autoGrantPermissions", true);

            capabilites.setCapability("appPackage", "com.cinko.app");
            capabilites.setCapability("appActivity", "com.cinko.app.activity.SplashActivity");

            BaseTest.androidDriver = new AndroidDriver(new URL("http://127.0.0.1:" + aapiumPort + "/wd/hub"), capabilites);
            BaseTest.androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    @AfterSuite
    public void stopAppium()
    {
        AppiumServiceHelper.stopService();

    }

}
