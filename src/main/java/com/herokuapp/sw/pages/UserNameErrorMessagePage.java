package com.herokuapp.sw.pages;


import com.aventstack.extentreports.Status;
import com.herokuapp.sw.customlisteners.CustomListeners;
import com.herokuapp.sw.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class UserNameErrorMessagePage extends Utility {

    @CacheLookup
    @FindBy(xpath="//a[@class='close']")
    WebElement closeBrowser;

    @CacheLookup
    @FindBy(xpath="//div[@id='flash']")
    WebElement textMessage;



    //By closeBrowser = By.xpath("//a[@class='close']");
   // By textMessage = By.xpath("//div[@id='flash']");

    public void clickOnCloseBrowser() {
        Reporter.log("click on " + closeBrowser);
        clickOnElement(closeBrowser);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }
   // public void verifyTextMessage(){verifyTextFromElements(textMessage,"Your username is invalid!\n" +
          //  "×");}


    }


