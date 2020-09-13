package com.cybertek.homework.vyTrack.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OdometerPage {
    WebDriver driver;
    By threeDotsMenu = By.xpath("//td[@class='action-cell grid-cell grid-body-cell']");
    By editButton = By.xpath(("//a[@title='Edit']"));

    public OdometerPage(WebDriver driver){
        this.driver = driver;
    }

    public void hoverOverDotsMenu () {
        Actions action = new Actions(driver);
        WebElement dotsMenu = driver.findElement(threeDotsMenu);
        action.moveToElement(dotsMenu).perform();
    }

}