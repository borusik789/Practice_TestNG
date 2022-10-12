package com.practice.tests;

import com.practice.pages.RadioButtonPage;
import com.practice.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RadioButtonsTest {
    RadioButtonPage radioButtonPage =new RadioButtonPage();
    @Test
    public void radioButtonTest1(){

        //1.GO TO: https://www.seleniumeasy.com/test/basic-radiobutton-demo.html
        Driver.getDriver().get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

        //2. Confirm radio button #Male is NOT  enabled by default
        //3. Confirm radio button #Female is NOT enabled by default
        assertFalse(radioButtonPage.maleRadioButton.isSelected(), "Male button was selected");
        assertFalse(radioButtonPage.femaleRadioButton.isSelected(), "Female button was selected");

        //4. Click radio button #Male to select it.
        radioButtonPage.maleRadioButton.click();

        //5. Click to button “Get Checked value”
        radioButtonPage.getValueButton.click();

        //7. Verify “Radio button 'Male' is checked” message is displayed.
        String expected="Radio button 'Male' is checked";
        String actual=radioButtonPage.getValueAsText.getText();
        assertTrue(radioButtonPage.getValueAsText.isDisplayed(),"Message is not displayed");
        assertEquals(expected,actual,"Messages did not match");

        //8. Click radio button #Female to select it.
        radioButtonPage.femaleRadioButton.click();

        //9. Click to button “Get Checked value”
        radioButtonPage.getValueButton.click();

        //10. Verify “Radio button 'Female' is checked” message is displayed.
        expected="Radio button 'Female' is checked";
        actual=radioButtonPage.getValueAsText.getText();
        assertTrue(radioButtonPage.getValueAsText.isDisplayed(),"Message was not displayed");
        assertEquals(expected,actual,"Messages did not match");

    }

}
