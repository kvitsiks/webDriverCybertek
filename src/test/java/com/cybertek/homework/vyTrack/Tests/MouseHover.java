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
        WebElement we = driver.findElement(By.xpath("//*[@id=\"grid-custom-entity-grid-390103899\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[7]"));
        ////a[@title="Edit"]
        action.moveToElement(we).perform();
        Thread.sleep(6000);
        //driver.findElement(By.xpath("(//ul[@class='nav nav-pills icons-holder launchers-list']/li[2])[1]/a")).click();
        // /html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div/ul/li/ul/li[2]/a
        //*[@id="grid-custom-entity-grid-1558213033"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div/ul/li/ul/li[2]/a
        // driver.findElement(By.tagName())
        // driver.findElement(By.id("user-menu")).click();
        // Thread.sleep(1000);
        //driver.findElement(By.linkText("Logout")).click();
        //Thread.sleep(1000);
        //driver.close();
    }
}