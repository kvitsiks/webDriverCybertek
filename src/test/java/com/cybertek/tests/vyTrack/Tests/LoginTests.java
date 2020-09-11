package com.cybertek.tests.vyTrack.Tests;

import com.cybertek.tests.vyTrack.Pages.LoginPage;
import com.cybertek.tests.vyTrack.Verifications.VyTrackVerifications;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUrl();
        loginPage.login();

        VyTrackVerifications verification = new VyTrackVerifications(driver);
        verification.verifyLogoIsPresent();
        driver.quit();
        System.out.println("Login test PASS");
    }
}
