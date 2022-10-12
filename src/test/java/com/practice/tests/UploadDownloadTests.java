package com.practice.tests;

import com.practice.pages.UploadPage;
import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;

public class UploadDownloadTests {

    UploadPage uploadPage=new UploadPage();

    @Test
    public void uploadTest(){
        //1. Go to http://practice.cybertekschool.com/upload

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        //2.Find any file that is not too big in size. And get the path of the file.
        String pathToFile="D:\\PC\\Downloads\\Курсы\\Cybertek\\SdetFastTrack\\Notes.txt";//windows users
        String pathToFile1="/Users/erjon/Desktop/download.jfif";//mac users
        //3.Upload the file
//        uploadPage.uploadFile.click();
        uploadPage.uploadFile.sendKeys(pathToFile);
        //UploadFile.fileAttachmentUsingRobot(pathToFile);
        uploadPage.submitFile.click();
        //4.Assert that file upload message is displayed
        assertTrue(uploadPage.uploadMessage.isDisplayed(),"Message was not displayed");
    }

    @Test
    public void testDownload(){
        //1. Go to https://www.seleniumeasy.com/test/generate-file-to-download-demo.html
        Driver.getDriver().get("http://practice.cybertekschool.com/download");
        List<WebElement> allFiles= uploadPage.eachFile;
        List<String> text=uploadPage.eachFile.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println("text = " + text);
        for (WebElement eachFile : allFiles) {
            eachFile.click();
        }
    }
}
