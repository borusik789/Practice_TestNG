package com.practice.tests;

import com.practice.pages.DropDownPage;
import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

public class DropDownTests_stream {
    DropDownPage dropDownPage = new DropDownPage();

    @Test
    public void dropDownTest1() {
        //TC#1
        //1. Go to http://practice.cybertekschool.com/dropdown

        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

        Select stateSelect = new Select(dropDownPage.stateSelector);

        //2. Select Illinois --> select by visible text
        stateSelect.selectByVisibleText("Illinois");
        String expected = "Illinois";
        String actual = stateSelect.getFirstSelectedOption().getText();
        assertEquals(actual, expected, "Illinois was not selected");

        //3. Select Virginia --> select by value
        stateSelect.selectByValue("VA");
        expected = "Virginia";
        actual = stateSelect.getFirstSelectedOption().getText();
        assertEquals(actual, expected, "Virginia was not selected");

        //4. Select California --> select by index
        stateSelect.selectByIndex(5);
        //5. Verify final selected option is California.

        expected = "California";
        actual = stateSelect.getFirstSelectedOption().getText();
        assertEquals(actual, expected, "California was not selected");
    }

    @Test
    public void dropDownTest2() {
        //TC#2
        //Select “December 1st, 1950” and verify it is selected.
        //1. Go to http://practice.cybertekschool.com/dropdown
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
        Select yearSelector = new Select(dropDownPage.yearSelector);
        //2. Select Year --> by visible text
        yearSelector.selectByVisibleText("1950");
        //3. Select Month -->  by value
        Select monthSelector = new Select(dropDownPage.monthSelector);
        monthSelector.selectByValue("11");

        //4. Select Day -->  by index
        Select daySelector = new Select(dropDownPage.daySelector);
        daySelector.selectByIndex(0);
        String expectedYear = "1950";
        String actualYear = yearSelector.getFirstSelectedOption().getText();

        String expectedMonth = "December";
        String actualMonth = monthSelector.getFirstSelectedOption().getText();

        String expectedDay = "1";
        String actualDay = daySelector.getFirstSelectedOption().getText();

        assertEquals(actualYear, expectedYear, "Year failed");
        assertEquals(actualMonth, expectedMonth, "Month failed");
        assertEquals(actualDay, expectedDay, "Day Failed");


    }

    @Test
    public void dropDownTest3() {
        //TC#3
        //1.Go to http://practice.cybertekschool.com/dropdown
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
        Select select = new Select(dropDownPage.languages);

        List<WebElement> list = select.getOptions();
        List<String> stringList = select.getOptions().stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println("stringList = " + stringList);
        //2. Select all the options from multiple select dropdown.
        for (WebElement eachElement : list) {
            String eachLanguage = eachElement.getText();
            select.selectByVisibleText(eachLanguage);

            assertTrue(eachElement.isSelected(), "Webelement was not selected");
        }
        //3. Print out all selected values and verify each is selected.
        //4.Deselect all values and verify each is deselected.
        select.deselectAll();
        List<WebElement> list2 = select.getOptions();

        for (WebElement webElement : list2) {
            assertFalse(webElement.isSelected(), "Webelement was selected");

        }

    }

}
