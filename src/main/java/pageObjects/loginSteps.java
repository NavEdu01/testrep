package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class loginSteps {

        @Given("^I login to android app on virtual device$")
        public void launchApp() throws MalformedURLException {

            File app=new File("src");
            File fapp=new File(app,"org.openintents.shopping_100221.apk");

            //startServer();
            DesiredCapabilities cap= new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
            cap.setCapability(MobileCapabilityType.APP, fapp.getAbsolutePath());
            cap.setCapability("autoGrantPermissions",true);
            cap.setCapability("appWaitActivity","org.openintents.shopping.ui.LayoutChoiceActivity");

            AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            System.out.println(driver);
            //stopServer();
        }
}
