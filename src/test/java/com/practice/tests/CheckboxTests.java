package com.practice.tests;

import com.practice.pages.CheckBoxPage;
import com.practice.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxTests {

    CheckBoxPage checkBoxPage = new CheckBoxPage();

    @Test
    public void checkBoxTest1() {
        //TC #1:checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes
        Driver.getDriver().get("http://practice.cybertekschool.com/checkboxes");
        //2. Confirm checkbox #1 is NOT selected by default
        assertTrue(!checkBoxPage.checkBox1Button.isSelected(),"Check box 1 was selected");

        //3. Confirm checkbox #2 is SELECTED by default.
        assertTrue(checkBoxPage.checkBox2Button.isSelected(),"Check box 2 was NOT selected");

        //4. Click checkbox #1 to select it.
        checkBoxPage.checkBox1Button.click();

        //5. Click checkbox #2 to deselect it.
        checkBoxPage.checkBox2Button.click();

        //6. Confirm checkbox #1 is SELECTED.
        assertTrue(checkBoxPage.checkBox1Button.isSelected(),"Check box 1 was NOT selected");

        //7. Confirm checkbox #2 is NOT selected.

        assertTrue(!checkBoxPage.checkBox2Button.isSelected(),"Check box 2 is selected");
    }


    @Test
    public void checkBoxTest2(){
        //TC #2:checkboxes
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        Driver.getDriver().get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        //3. Verify “Success – Check box is checked” message is NOT displayed.
        assertFalse(checkBoxPage.successText.isDisplayed(),"Checkbox three was displayed");
       // assertTrue(!checkBoxPage.successText.isDisplayed(),"Checkbox three was displayed");

        //4. Click to checkbox under “Single Checkbox Demo” section
        checkBoxPage.checkBox3Button.click();

        //5. Verify “Success – Check box is checked” message is displayed.

        assertTrue(checkBoxPage.successText.isDisplayed(),"Success text was not displayed");
    }


}
