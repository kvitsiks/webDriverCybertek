package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) {

        //TC #4: Facebook header verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        //3. Verify “Create a page” link href value contains text:
        //Expected: “registration_form”

        String expectedInAttribute = "registration_form";
        String actualAttribute = driver.findElement(By.linkText("Create a Page")).getAttribute("href");

        System.out.println("expectedInAttribute = " + expectedInAttribute);
        System.out.println("actualAttribute = " + actualAttribute);

        if (actualAttribute.contains(expectedInAttribute)){
            System.out.println("Attribute value verification PASSED!");
        }else{
            System.out.println("Attribute value verification FAILED!!!");
        }

        String usingGetTextMethod = driver.findElement(By.linkText("Create a Page")).getText();
        System.out.println("usingGetTextMethod = " + usingGetTextMethod);
    }
}
