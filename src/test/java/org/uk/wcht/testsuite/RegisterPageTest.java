package org.uk.wcht.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.uk.wcht.pages.HomePage;
import org.uk.wcht.pages.MyAccountPage;
import org.uk.wcht.pages.RegisterPage;
import org.uk.wcht.testbase.TestBase;

public class RegisterPageTest extends TestBase {

    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatUserisAbletoNavigatetoLoginPageThruMyAccountPage(){
        homePage.setYourAccountLink();
        myAccountPage.setRegisterLink();
        String expectedText = "Register";
        String actualText = registerPage.getRegisterText();

    }
}
