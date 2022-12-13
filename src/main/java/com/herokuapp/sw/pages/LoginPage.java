package com.herokuapp.sw.pages;


import com.aventstack.extentreports.Status;
import com.herokuapp.sw.customlisteners.CustomListeners;
import com.herokuapp.sw.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='username']")
    WebElement emailIdField;
    // By emailIdField =By.xpath("//input[@id='username']"); //"tomsmith");

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;
    // By passwordField = By.xpath("//input[@id='password']");

    @CacheLookup
    @FindBy(xpath = "//i[normalize-space()='Login']")
    WebElement loginButton;
    //By loginButton = By.xpath("//i[normalize-space()='Login']");


    public void enterEmailIdField(String email) {
        Reporter.log("Enter email " + email + "to email field" + emailIdField.toString());
        sendTextToElement(emailIdField, email);
        CustomListeners.test.log(Status.PASS,"Your emaild id \""+email.toString()+"\"");
    }

    public void enterPasswordField(String password) {
        Reporter.log("Enter password" + password + "to password field" + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Your password is \"" + password.toString() + "\"");
    }

    public void clickOnLoginButton() {
        Reporter.log("click on loging button" + loginButton);
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"click\""+"\"");
    }

}

