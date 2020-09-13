package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0_FindElements_Practice1 {
    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Print out the texts of all links
        //shortcut to introduce the local variable:
        // mac : option + enter
        // windows: alt + enter

        //Locating all the links on the page and storing them into a List of WebElements
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        //Looping through the list of webelements we just created above
        for (WebElement eachLink : listOfLinks){
            //Getting the text of each element in each iteration, and printing the values
            System.out.println(eachLink.getText());
        }

        //4. Print out how many total link
        int numberOfLinks = listOfLinks.size();

        System.out.println("numberOfLinks = " + numberOfLinks);

    }
}
