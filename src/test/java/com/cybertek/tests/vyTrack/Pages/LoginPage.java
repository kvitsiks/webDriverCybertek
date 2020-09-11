package com.cybertek.tests.vyTrack.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;
    String baseUrl = "https://qa2.vytrack.com/user/login";
    String username = "user165";
    String password = "UserUser123";
    By usernameField = By.cssSelector("[id=prependedInput]");
    By passwordField = By.cssSelector("[id=prependedInput2]");
    By logInButton = By.cssSelector("[id*=_submit]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void pageLoadTimeout() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void getUrl() {
        pageLoadTimeout();
        implicitlyWait();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    public void login() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        pageLoadTimeout();
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(logInButton)).click();
    }
}
