package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests_SB {
    LoginPage loginPage;

    @Test (description = "entering incorrect username")
    public void negative_login_test1(){

        String url = ConfigurationReader.getProperty("smartbearUrl");
        Driver.getDriver().get(url);

        //Lets start using PageObjectModel

        //#1- We need to create the object of the class we want to use
        loginPage = new LoginPage();
        //When we create the instance of this class, the constructor immediately
        //initializes our Driver and the object 'loginPage'

        //#2- Call the object to use the web elements
        // Entering incorrect username
        loginPage.usernameInput.sendKeys("asdfafa");

        // Enter CORRECT password
        String password = ConfigurationReader.getProperty("smartbear_password");
        loginPage.passwordInput.sendKeys(password);

        // Click to login button
        loginPage.loginButton.click();

        //assert true that error message is displayed on the page
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is not displayed. Verification Failed!");
        //BREAK UNTIL 8.15PM CST - 9.15PM EST

    }

    @Test (description = "using login method for negative test")
    public void negative_login_test2(){
        String url = ConfigurationReader.getProperty("smartbearUrl");
        Driver.getDriver().get(url);

        loginPage = new LoginPage();

        String username = "wrongusername";
        String password = ConfigurationReader.getProperty("smartbear_password");

        loginPage.login(username, password);

        //assert true that error message is displayed on the page
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is not displayed. Verification Failed!");



    }




}
