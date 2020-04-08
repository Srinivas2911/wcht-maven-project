package org.uk.wcht.pages;

import org.openqa.selenium.By;
import org.uk.wcht.utility.Utility;

public class MyAccountPage extends Utility {
    By myAccountText = By.xpath("//div[@class='panel-heading']");
    By registerLink = By.partialLinkText("Regist");

public void verifyMyAccountText () {
    verifyThatTextIsDisplayed(myAccountText, " My Account ");
    }

    public String getMyAccountText (){
    return getTextFromElement(myAccountText);
    }

    public void setRegisterLink(){
    clickOnElement(registerLink);
    }
}