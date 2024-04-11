import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.junit.Test;



public class FindElements extends TestBase{

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Отмена\"]")
    MobileElement cancel;

    @AndroidFindBy(id = "us.zoom.videomeetings:id/txtTitle")
    MobileElement  titleText;

    @AndroidFindBy(id = "us.zoom.videomeetings:id/edtConfNumber")
    MobileElement placeEnter;

    @AndroidFindBy(id = "us.zoom.videomeetings:id/btnGotoVanityUrl")
    MobileElement textUnderPlace;

    @AndroidFindBy(id = "us.zoom.videomeetings:id/panelScreenName")
    MobileElement placeWithText;




    @Test
    public void sampleTest() {

        //Assert.assertTrue(el1.isDisplayed());



        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text=\"Войти в конференцию\"]");
        el1.click();
        cancel.isDisplayed();
        titleText.isDisplayed();
        placeEnter.isDisplayed();
        textUnderPlace.isDisplayed();
        placeWithText.isDisplayed();
        MobileElement buttonJoin = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text=\"Войти\"]");
        buttonJoin.isDisplayed();
        MobileElement textUnderButtonJoin = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("textContains(\"Если вы получили ссылку с приглашением, коснитесь ссылки, чтобы войти в конференцию\")"));
        textUnderButtonJoin.isDisplayed();
        MobileElement titleJoinOption = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("textContains(\"ПАРАМЕТРЫ ВХОДА\")"));
        titleJoinOption.isDisplayed();
        MobileElement textSwitch = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("textContains(\"Не подключать звук\")"));
        textSwitch.isDisplayed();
        MobileElement switchWithText = (MobileElement) driver.findElementById("us.zoom.videomeetings:id/chkNoAudio");
        switchWithText.isDisplayed();


    }
}
