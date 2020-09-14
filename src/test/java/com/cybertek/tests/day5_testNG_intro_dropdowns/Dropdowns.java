package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*


TC #2: Selecting state from State dropdown and verifyingresult1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/dropdown
3.Select Illinois
4.Select Virginia
5.Select California
6.Verify final selected option is California.Use all Select
options.(visible text, value, index)

TC #3: Selecting date on dropdown and verifying
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/dropdown
3.Select “December 1st, 1921” and verify it is selected.Select year using:
visible textSelect month using : value attributeSelect day using: index number

TC #4: Selecting value from multiple select dropdown
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/dropdown
3.Select all the options from multiple select dropdown.
4.Print out all selected values.5.Deselect all values.

TC #5: Selecting value from non-select dropdown
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/dropdown
3.Click to non-select dropdown
4.Select Facebook from dropdown
5.Verify title is “Facebook -Log In or Sign Up”


Syntax of how do we handle dropdowns?

    #1 - you need to locate the dropdown web element
    #2 - you need to create an object from Select class.
    #3 - you need to pass the previously located web element into the constructor of Select class.
FIRST WAY:
    WebElement dropdown1 = driver.findElement(By.LOCATOR);
    Select select = new Select(dropdown1);
SECOND WAY (Less complicated)
    Select select = new Select(driver.findElement(By.LOCATOR));
- What is important is that YOU MUST PASS the dropdown web element into Select class' constructor.
How do we actually select from a SELECT dropdown?
    - There are 3 ways of selecting.
        - selectByVisibleText()
            - this method accepts a string argument
            - then selects the given option with visible text
            syntax: select.byVisibleText("text goes here");
        - selectByValue
            - this method will select by the value of the attribute "value"
        - selectByIndex
            - this one selects by the index number of the <option>
            - index start from 0
How do we get what is selected from the dropdown?
    - getFirstSelectedOption();
        - This method will get the option that is currently selected.
        - This method will return the currently selected option as a web element
How do we get all of the options in a dropdown?
    - .getOptions();
        - This method just returns all of the existing options in the dropdown.
        - Return type: List<WebElement>
    - .getAllSelectedOptions();
        - This method will return all of the selected options.
    - .deDeselectAll();
        - IF there are multiple options selected, it will de selected whatever is selected.

 */
public class Dropdowns {
    WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdown_test_1() {
/*
    TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/dropdown
3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
4.Verify“State selection” default selected value is correctExpected: “Select a State”
     */
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String actualSelectedOption = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSelectedOption = "Please select an option";
        Assert.assertEquals(actualSelectedOption, expectedSelectedOption);
        simpleDropdown.selectByVisibleText("Option 2");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
