package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by vnsquall on 11/26/14.
 */
public class DriverFactory {
    public static AppiumDriver driver = null;
    public static WebDriverWait driverWait = null;
    public String platformVersion = "7.1";
    public String appPackage = "com.lazada.android"; //for Live build

    public void setUp(String device) throws MalformedURLException {
        if (device.equals("iOS")) {
            getSetup_ios();
        }
        if (device.equals("android")) {
            getSetup_android();
        }
    }

    public void getSetup_ios() throws MalformedURLException {
        //Init Appium Instances:
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("deviceName", "iPhone 5s");

        //Set appPath
        String userDir = System.getProperty("user.dir");
        String localApp = "Lazada.app.zip";
        String appPath = userDir + "/" + localApp;
        capabilities.setCapability("app", appPath);

        driver = new IOSDriver(serverAddress, capabilities);
        driverWait = new WebDriverWait(driver, 90);
    }

    public void getSetup_android() throws MalformedURLException {
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("appium-version", "1.3.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", "pt.rocket.view.ChangeCountryFragmentActivity");

        String userDir = System.getProperty("user.dir");
        String localApp = "lazada-android-live.apk";
        String appPath = userDir + "/" + localApp;
        capabilities.setCapability("app", appPath);

        driver = new AndroidDriver(serverAddress, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }
}
