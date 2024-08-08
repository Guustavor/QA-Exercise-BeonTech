package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class GoogleSearchElementPage {

    @AndroidFindBy(id = "Chrome")
    protected RemoteWebElement btnChrome;

    @AndroidFindBy(id = "search_box_text")
    protected RemoteWebElement btnSearchbox;

    @AndroidFindBy(accessibility = "Refinar: zaraki kenpachi")
    protected RemoteWebElement btnRefinar;

}
