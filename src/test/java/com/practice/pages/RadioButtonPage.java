package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  RadioButtonPage {

    public RadioButtonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='panel-body']/label/input)[1]")
    public WebElement maleRadioButton;

    @FindBy(xpath = "(//div[@class='panel-body']/label/input)[2]")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//button[@id='buttoncheck']")
    public WebElement getValueButton;


    @FindBy(xpath = "//p[@class='radiobutton']")
    public WebElement getValueAsText;
    //TC #1:radio buttons
    //1.GO TO: https://www.seleniumeasy.com/test/basic-radiobutton-demo.html
    //2. Confirm radio button #Male is NOT  enabled by default
    //3. Confirm radio button #Female is NOT enabled by default
    //4. Click radio button #Male to select it.
    //5. Click to button “Get Checked value”
    //7. Verify “Radio button 'Male' is checked” message is displayed.
    //8. Click radio button #Female to select it.
    //9. Click to button “Get Checked value”
    //10. Verify “Radio button 'Female' is checked” message is displayed.

}
