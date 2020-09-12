package com.cybertek.homework.vyTrack.Tests;

import com.cybertek.homework.vyTrack.Pages.LoginPage;
import com.cybertek.homework.vyTrack.Verifications.VyTrackVerifications;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class LoginTests {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUrl();
        loginPage.login();

        VyTrackVerifications verification = new VyTrackVerifications(driver);
        verification.verifyLogoIsPresent();
        driver.quit();
        System.out.println("Login test PASS");
    }
}
