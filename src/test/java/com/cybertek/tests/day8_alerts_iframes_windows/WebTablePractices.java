package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTablePractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
    }


    //Using the verify order method from SmartBearUtilities class
    @Test
    public void task4_verify_order(){

        SmartBearUtilities.verifyOrder(driver, "Mark Smith");
        //SmartBearUtilities.verifyOrder(driver, "Mark Smiths");

    }

    //Using the printNamesAndCities method to print all names and their cities
    @Test
    public void task5_print_names_and_cities(){

        SmartBearUtilities.printNamesAndCities(driver);

    }


}
