import io.appium.java_client.MobileElement;
import org.junit.Test;

public class Exemple2 extends TestBase{


        @Test
        public void sampleTest() {
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.Button[2]");
            el1.click();
//        MobileElement textButton = (MobileElement) driver.findElementByClassName("android.widget.Button");
//        textButton.isDisplayed();
            MobileElement closeButton = (MobileElement) driver.findElementById("com.anydog.t2m.test:id/btnSubmit");
            closeButton.isDisplayed();
            closeButton.click();
        }


    }

