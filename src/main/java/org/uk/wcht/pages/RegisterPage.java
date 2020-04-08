package org.uk.wcht.pages;

import org.openqa.selenium.By;
import org.uk.wcht.utility.Utility;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h3[@class='panel-title']");


    public void setRegisterText() {
        getTextFromElement(registerText);
    }

    public void verifyRegisterText() {
        verifyThatTextIsDisplayed(registerText, "Register");
    }
    public String getRegisterText (){
        return getTextFromElement(registerText);
    }
}
