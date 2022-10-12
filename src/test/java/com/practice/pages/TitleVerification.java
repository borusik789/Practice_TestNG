package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitleVerification {
    public TitleVerification(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  @FindBy(xpath = "(//a[.='Gmail'])[1]")
    public WebElement gmailLinkButton;

    @FindBy(name = "q")
    private WebElement searchLink;
//private final CustomElement=new CustomElement("BUTTON",WebElement)
    public void searchApple(){
        searchLink.sendKeys("apple"+ Keys.ENTER);
    }

    public String getTitle(){
        return Driver.getDriver().getTitle();
    }

    //TC #2: Back and forth navigation
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Click to Gmail from top right.
    //4- Verify title contains:
    //Expected: Gmail
    //5- Go back to Google by using the .back();
    //6- Verify title equals:
    //Expected: Google

    //TC #3: Google search
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write “apple” in search box
    //4- Click google search button
    // //(instead of clicking to search button we press ENTER)
    //5- Verify title:
    //Expected: Title should contain “apple” word
}
