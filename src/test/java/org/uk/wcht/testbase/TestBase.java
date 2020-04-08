package org.uk.wcht.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.uk.wcht.basepage.BasePage;
import org.uk.wcht.browserselector.BrowserSelector;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://www.wcht.org.uk/";

    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
