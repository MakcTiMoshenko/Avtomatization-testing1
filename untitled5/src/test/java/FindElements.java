import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Test;

import javax.xml.xpath.XPath;

public class FindElements extends TestBase{

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Отмена\"]")
    MobileElement el2;

    @AndroidFindBy(id = "us.zoom.videomeetings:id/txtTitle")
    MobileElement el3;

    @AndroidFindBy(uiAutomator = "textContains(\"ПАРАМЕТРЫ ВХОДА\")")
    MobileElement el9;


    @Test
    public void sampleTest() {

        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text=\"Войти в конференцию\"]");
        el1.click();
        //MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text=\"Отмена\"]");
        el2.isDisplayed();
        //MobileElement el3 = (MobileElement) driver.findElementById("us.zoom.videomeetings:id/txtTitle");
        el3.isDisplayed();
        MobileElement el4 = (MobileElement) driver.findElementById("us.zoom.videomeetings:id/edtConfNumber");
        el4.isDisplayed();
        MobileElement el5 = (MobileElement) driver.findElementById("us.zoom.videomeetings:id/btnGotoVanityUrl");
        el5.isDisplayed();
        MobileElement el6 = (MobileElement) driver.findElementById("us.zoom.videomeetings:id/panelScreenName");
        el6.isDisplayed();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text=\"Войти\"]");
        el7.isDisplayed();
        MobileElement el8 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("textContains(\"Если вы получили ссылку с приглашением, коснитесь ссылки, чтобы войти в конференцию\")"));
        el8.isDisplayed();
        //MobileElement el9 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("textContains(\"ПАРАМЕТРЫ ВХОДА\")"));
        el9.isDisplayed();
        MobileElement el10 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("textContains(\"Не подключать звук\")"));
        el10.isDisplayed();
        MobileElement el11 = (MobileElement) driver.findElementById("us.zoom.videomeetings:id/chkNoAudio");
        el11.isDisplayed();


    }
}
