package driver;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class DriverFactory {

    public static AndroidDriver getAndroidDriver() {
        AndroidDriver driver = null;
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "R9XT6075Q6M");
            caps.setCapability("automationName", "UiAutomator2");
            URL appiumServerURL = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver<>(appiumServerURL, caps);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
