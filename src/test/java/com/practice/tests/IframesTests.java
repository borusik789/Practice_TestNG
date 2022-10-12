package com.practice.tests;

import com.practice.pages.IframePage;
import com.practice.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

import static org.testng.Assert.assertTrue;

public class IframesTests {

    IframePage iframePage=new IframePage();

    @Test
    @Tag(name = "smoke")
    public void iframeTest(){
        //1. Go to website: http://practice.cybertekschool.com/iframe
        Driver.getDriver().get("http://practice.cybertekschool.com/iframe");
        //2. Locate as WebElement
       // Driver.getDriver().switchTo().frame(iframePage.iframe);
        //Driver.getDriver().switchTo().frame(iframePage.iframeIndex);
        Driver.getDriver().switchTo().frame(iframePage.iframeId);
        assertTrue(iframePage.textDisplayed.isDisplayed(),"Text was not displayed");
        //3.Pass index number
        //4.Pass id or name attribute value (IF THERE ARE ANY)
        //5.Assert: "Your content goes here." Text is displayed.
        //6.switch back to default frame

    }
}
