package com.cybertek.tests.vyTrack.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DashboardPage {
    WebDriver driver;
    By fleetMenu = By.xpath("//a/span[contains(text(), 'Fleet')]");
    By odometerLink = By.xpath(("//span[contains(text(), 'Vehicle Odometer')]"));

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void pageLoadTimeout() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void goToOdometerPage(){
        pageLoadTimeout();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(fleetMenu)).click();
        implicitlyWait();
        wait.until(ExpectedConditions.visibilityOfElementLocated(odometerLink)).click();
    }
}
