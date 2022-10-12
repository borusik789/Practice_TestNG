package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {

    public DropDownPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "state")
    public WebElement stateSelector;

    @FindBy(xpath = "//select[@id='day']")
    public WebElement daySelector;

    @FindBy(xpath = "//select[@id='year']")
    public WebElement yearSelector;

    @FindBy(xpath = "//select[@id='month']")
    public WebElement monthSelector;

    @FindBy(xpath = "//select[@name='Languages']")
    public WebElement languages;

    //TC#1
    //1. Go to http://practice.cybertekschool.com/dropdown
    //2. Select Illinois --> select by visible text
    //3. Select Virginia --> select by value
    //4. Select California --> select by index
    //5. Verify final selected option is California.

    //TC#2
    //Select “December 1st, 1950g” and verify it is selected.
    //1. Go to http://practice.cybertekschool.com/dropdown
    //2. Select Year --> by visible text
    //3. Select Month -->  by value
    //4. Select Day -->  by index
    //5. Verify final selected option is California.

    //TC#3
    //1.Go to http://practice.cybertekschool.com/dropdown
    //2. Select all the options from multiple select dropdown.
    //3. Print out all selected values and verify each is selected.
    //4.Deselect all values and verify each is deselected.


}
