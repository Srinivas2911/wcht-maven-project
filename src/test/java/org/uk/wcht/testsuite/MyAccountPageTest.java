package org.uk.wcht.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.uk.wcht.pages.HomePage;
import org.uk.wcht.pages.MyAccountPage;
import org.uk.wcht.testbase.TestBase;

public class MyAccountPageTest extends TestBase {
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void verifyThatUserIsAbletoNavigateToYourAccountPage(){
        homePage.setYourAccountLink();
        myAccountPage.verifyMyAccountText();
        String expectedText = "My Account";
        String actualText = myAccountPage.getMyAccountText();
        Assert.assertEquals(expectedText, actualText);

    }
}
