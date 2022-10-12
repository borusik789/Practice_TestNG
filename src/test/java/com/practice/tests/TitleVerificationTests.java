package com.practice.tests;

import com.practice.pages.TitleVerification;
import com.practice.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TitleVerificationTests {
    TitleVerification titleVerification = new TitleVerification();

    @Test
    public void testFacebookTitle() {
        //TC #1: Facebook Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        Driver.getDriver().get("https://www.facebook.com");
        //3. Verify title:
        //Expected: Facebook - Log In or Sign Up
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = Driver.getDriver().getTitle();

        //Actual: we need to get from browser using selenium
        assertEquals(expectedTitle, actualTitle, "Title's did not match.");
    }

    @Test
    public void testGooglePage() {
        //TC #2: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        Driver.getDriver().get("https://google.com");

        //3- Click to Gmail from top right.
        titleVerification.gmailLinkButton.click();

        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = Driver.getDriver().getTitle();
        assertTrue(actualTitle.contains(expectedTitle), "Gmail title verification failed.");

        //5- Go back to Google by using the .back();
        Driver.getDriver().navigate().back();

        //6- Verify title equals:
        //Expected: Google
        expectedTitle = "Google";
        actualTitle = Driver.getDriver().getTitle();
        //  assertTrue(actualTitle.contains(expectedTitle),"Google title verification failed.");
        assertEquals(expectedTitle, actualTitle, "Google title verification failed.");
    }

    @Test
    public void googleSearch() {
        //TC #3: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        Driver.getDriver().get("https://google.com");

        //3- Write “apple” in search box
        //4- Click google search button
        titleVerification.searchApple();
        // //(instead of clicking to search button we press ENTER)
        //5- Verify title:
        //Expected: Title should contain “apple” word
        String expectedTitle = "apple";
        String actualTitle = titleVerification.getTitle();
        assertTrue(actualTitle.contains(expectedTitle), "Search title failed.");
    }

}
