package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_FacebookTitleVerification {

    public static void main(String[] args) {

        //TC #1: Facebook title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup(); //sets up the chrome browser driver

        //Creating an instance of ChromeDriver.
        //Also opening an empty Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Facebook title verification passed!");
        }else{
            System.out.println("Facebook title verification failed!");
        }


    }

}
