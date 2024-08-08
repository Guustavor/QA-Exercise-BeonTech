package search;

import driver.DriverFactory;
import org.testng.annotations.Test;
import pages.GoogleSearchPageInteractions;

public class GoogleSearchTest extends DriverFactory {

    @Test
    public void GoogleSearch() throws InterruptedException {
        GoogleSearchPageInteractions googleSearchPageInteractions = new GoogleSearchPageInteractions();
        googleSearchPageInteractions.googleSearch();

    }

}
