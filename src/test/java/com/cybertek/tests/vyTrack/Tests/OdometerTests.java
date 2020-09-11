package com.cybertek.tests.vyTrack.Tests;

import com.cybertek.tests.vyTrack.Pages.DashboardPage;
import com.cybertek.tests.vyTrack.Pages.LoginPage;
import com.cybertek.tests.vyTrack.Verifications.VyTrackVerifications;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OdometerTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUrl();
        loginPage.login();

        DashboardPage page = new DashboardPage(driver);
        page.goToOdometerPage();

        VyTrackVerifications verification = new VyTrackVerifications(driver);
        verification.verifyVehicleOdometerPageIsDisplayed();
    }

}
