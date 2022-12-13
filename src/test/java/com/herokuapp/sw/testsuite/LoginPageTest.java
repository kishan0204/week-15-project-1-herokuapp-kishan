package com.herokuapp.sw.testsuite;

import com.herokuapp.sw.customlisteners.CustomListeners;
import com.herokuapp.sw.pages.LoginPage;
import com.herokuapp.sw.pages.UserNameErrorMessagePage;
import com.herokuapp.sw.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    UserNameErrorMessagePage userNameErrorMessagePage ;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        userNameErrorMessagePage = new UserNameErrorMessagePage();
        loginPage = new LoginPage();
    }


    @Test (groups =   { "sanity" , "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        loginPage.enterEmailIdField("tomsmith");
        loginPage.enterPasswordField("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
    }
    @Test (groups =   { "smoke" , "regression"})
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterEmailIdField("tomsmith1");
        loginPage.enterPasswordField("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        //userNameErrorMessagePage.closeBrowser();
        //userNameErrorMessagePage.verifyTextMessage();
    }
    @Test (groups =   {"regression"})
    public void verifyThePasswordErrorMessage(){
        loginPage.enterEmailIdField("tomsmith");
        loginPage.enterPasswordField("SuperSecretPassword");
        loginPage.clickOnLoginButton();

    }
}



