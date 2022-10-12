package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertClass {

    public AlertClass() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Click for JS Alert']")
    public WebElement clickJSAlert;
    @FindBy(xpath = "//button[.='Click for JS Confirm']")
    public WebElement confirmJSAlert;

    @FindBy(xpath = "//button[.='Click for JS Prompt']")
    public WebElement promptJSAlert;

    @FindBy(id = "result")
    public WebElement textResult;
    //1. Go to website: http://practice.cybertekschool.com/javascript_alerts
    //2.Clicking to the button for alert to be displayed
    //3. Click to OK button from the alert
    //4. Verify "You successfully clicked an alert" text is displayed.
}
