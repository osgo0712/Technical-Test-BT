package pageObject.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ValidateMathematicalOperationsMobilePageObject extends PageObject {

    AppiumDriver driver;
    public void OpenApp() throws MalformedURLException {

        try {
            DesiredCapabilities cap =  new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 30");
            cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
            cap.setCapability("appPackage", "com.millicomhn.mitienda");
            cap.setCapability("appActivity", "com.millicomhn.mitienda.MainActivity");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        } catch (Exception e) {
            System.out.println("La causa de la excepcion es: " + e.getCause());
            System.out.println("El mensaje es: " + e.getMessage());
        }
    }
}
