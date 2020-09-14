package com.cybertek.homework.vyTrack.Tests;

import com.cybertek.homework.vyTrack.Pages.DashboardPage;
import com.cybertek.homework.vyTrack.Pages.LoginPage;
import com.cybertek.homework.vyTrack.Pages.OdometerPage;
import com.cybertek.homework.vyTrack.Verifications.VyTrackVerifications;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class OdometerTests {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUrl();
        loginPage.login();

        DashboardPage page = new DashboardPage(driver);
        page.goToOdometerPage();

        VyTrackVerifications verification = new VyTrackVerifications(driver);
        verification.verifyVehicleOdometerPageIsDisplayed();

        OdometerPage odometer = new OdometerPage(driver);
        odometer.hoverOverDotsMenu();
        odometer.clickOnEditButton();
        verification.verifyEditPageIsOpened();

        driver.quit();
    }
}
