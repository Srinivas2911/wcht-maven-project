package org.uk.wcht.pages;

import org.openqa.selenium.By;
import org.uk.wcht.utility.Utility;

public class HomePage extends Utility {

    By yourHomeLink = By.linkText("Your home");
    By yourCommunityLink = By.linkText("Your community");
    By findAHomeLink = By.linkText("Find a home");
    By aboutUsLink = By.linkText("About us");
    By helpAndSupportLink = By.xpath("//a[contains(text(),'Help & support')]");
    By yourAccountLink = By.xpath("//span[contains(text(),'Your account')]");

    public void homeLinkIsDisplayed() {
        verifyThatElementIsDisplayed(yourHomeLink);
    }

    public void communityLinkIsDisplayed() {
        verifyThatElementIsDisplayed(yourCommunityLink);
    }

    public void findAHomeLinkIsDisplayed() {
        verifyThatElementIsDisplayed(findAHomeLink);
    }

    public void aboutUsLinkIsDisplayed() {
        verifyThatElementIsDisplayed(aboutUsLink);
    }

    public void helpAndSupportLinkIsDisplayed() {
        verifyThatElementIsDisplayed(helpAndSupportLink);
    }

    public void yourAccountLinkIsDisplayed() {
        verifyThatElementIsDisplayed(yourAccountLink);
    }

    public String getYourAccountText(){
        return getTextFromElement(yourAccountLink);

    }

    public void setYourHomeLink() {
        clickOnElement(yourHomeLink);
    }

    public void setYourCommunityLink() {
        clickOnElement(yourCommunityLink);
    }

    public void setFindAHomeLink() {
        clickOnElement(findAHomeLink);
    }

    public void setAboutUsLink() {
        clickOnElement(aboutUsLink);
    }

    public void setHelpAndSupportLink() {
        clickOnElement(aboutUsLink);
    }

    public void setYourAccountLink() {
        clickOnElement(yourAccountLink);
    }
}
