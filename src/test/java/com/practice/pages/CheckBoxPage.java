package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='box2']")
    public WebElement checkBox2Button;

    @FindBy(xpath = "//input[@id='box1']")
    public WebElement checkBox1Button;

    @FindBy(xpath = "//input[@id='isAgeSelected']")
    public WebElement checkBox3Button;

    @FindBy(xpath = "//div[.='Success - Check box is checked']")
    public WebElement successText;
    //TC #1:checkboxes
    //1. Go to http://practice.cybertekschool.com/checkboxes
    //2. Confirm checkbox #1 is NOT selected by default
    //3. Confirm checkbox #2 is SELECTED by default.
    //4. Click checkbox #1 to select it.
    //5. Click checkbox #2 to deselect it.
    //6. Confirm checkbox #1 is SELECTED.
    //7. Confirm checkbox #2 is NOT selected.

    //TC #2:checkboxes
    //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    //3. Verify “Success – Check box is checked” message is NOT displayed.
    //4. Click to checkbox under “Single Checkbox Demo” section
    //5. Verify “Success – Check box is checked” message is displayed.
}
