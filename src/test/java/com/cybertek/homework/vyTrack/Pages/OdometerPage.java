package com.cybertek.homework.vyTrack.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class OdometerPage {

    WebDriver driver;

    By threeDotsMenu = By.xpath("(//*[@class='action-cell grid-cell grid-body-cell'])[1]");
    By editButton = By.xpath(("//a[@title='Edit']"));

    public OdometerPage(WebDriver driver){
        this.driver = driver;
    }

    public void pageLoadTimeout() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public void hoverOverDotsMenu () throws InterruptedException {
        Actions action = new Actions(driver);
        implicitlyWait();
        pageLoadTimeout();
        WebElement dotsMenu = driver.findElement(threeDotsMenu);
        action.moveToElement(dotsMenu).perform();
    }
    public void clickOnEditButton(){
        pageLoadTimeout();
        WebElement edit = driver.findElement(editButton);
        edit.click();
    }

}