package com.cybertek.homework.vyTrack.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) throws InterruptedException {
//AC#3.Verify that truck driver should be able to edit Vehicle odometer.
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        2. Go to https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
//        3. Truck driver enter valid username
        //Thread.sleep(1000);
        driver.findElement(By.id("prependedInput")).sendKeys("user161");
//        4. Truck driver enter valid password
        // Thread.sleep(1000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);
//        5. Truck driver navigate "Fleet" module and click "Vehicle Odometers" sub module
        Thread.sleep(2000);
        //driver.findElement()
        driver.findElement(By.className("unclickable")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Vehicle Odometer")).click();
        Thread.sleep(6000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("(//*[@class='action-cell grid-cell grid-body-cell'])[1]"));
        action.moveToElement(we).perform();
        Thread.sleep(2000);
        WebElement edit = driver.findElement(By.xpath("//a[@title=\"Edit\"]"));
        edit.click();
        Thread.sleep(2000);
        driver.quit();
    }
}