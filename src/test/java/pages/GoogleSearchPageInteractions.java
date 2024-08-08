package pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPageInteractions extends GoogleSearchElementPage{

    public GoogleSearchPageInteractions(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void googleSearch() throws InterruptedException {

        btnChrome.click();
        btnSearchbox.click();
        btnRefinar.sendKeys("Zaraki Kenpachi");

    }
}
