package com.practice.tests;

import com.practice.pages.AlertClass;
import com.practice.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest {

    AlertClass alertClass=new AlertClass();

    @Test
    public void testAlert(){
        //1. Go to website: http://practice.cybertekschool.com/javascript_alerts

        Driver.getDriver().get(" http://practice.cybertekschool.com/javascript_alerts");

        //2.Clicking to the button for alert to be displayed
        alertClass.clickJSAlert.click();
        Alert alert1=Driver.getDriver().switchTo().alert();
        Alert alert = Driver.getDriver().switchTo().alert();
        String expected="You successfuly clicked an alert";
        alert1.accept();
        String actual=alertClass.textResult.getText();

        assertEquals(actual,expected);

        //3. Click to OK button from the alert
        alertClass.confirmJSAlert.click();
        Alert alert2=Driver.getDriver().switchTo().alert();
        alert2.accept();
        expected="You clicked: Ok";
        actual=alertClass.textResult.getText();
        assertEquals(actual,expected);


        alertClass.promptJSAlert.click();
        Alert alert3=Driver.getDriver().switchTo().alert();
        expected="You entered: hello";
        alert3.sendKeys("hello");
        alert3.accept();
        actual=alertClass.textResult.getText();
        assertEquals(actual,expected);

        //4. Verify "You successfully clicked an alert" text is displayed.
    }
}
