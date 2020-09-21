package com.cybertek.tests.day6_dropdown_review_javafaker;
/*
SEPTEMBER 20TH, SUNDAY

#1 recap
	-testNG
		- priority
		- dependency
	-dropdown

#2 dropdown tasks
#3 smartbear tasks

#4 javafaker


===============================================
PIQ.

--> findElement vs findElements
	-> findElement
		- return type : WebElement
		- what kind of exception does it throw : NoSuchElementException

	-> findElements
		- return type: List <WebElement> --> returns list of webelements
		- what kind of exception does it throw : it does not throw exception if it cannot find a web element.

DROPDOWNS:

	How many different types of dropdown are there in HTML?
		- There are 2 types of dropdowns.

		#1 - HTML Dropdown
		#2 - Select Dropdown

	#1 - HTML Dropdown:
		- When we inspect, if the tag of the dropdown is not <select> it means it is an HTML dropdown.
		- In this situation, we cannot use Select class that comes from Selenium library.
		- We just need to handle this dropdown as any other web element.
		- Which is just by locating with any locator, and then clicking.

	#2 - Select Dropdowns:
		- When you inspect a dropdown, if you see <select> tag in the HTML, it means this dropdown is a select dropdown.
		- In this case we need to use Select class from Selenium library.

		What is Select class?
			- It is just a class that has methods related to handling <select> dropdowns.

		How to use Select class when you want to handle <select> tags?
		What is the syntax?
PIQ:	How to answer "How do you handle select dropdowns in Selenium" question VERBALLY:

		#1- We need to create an object of Select class
		#2- We need to make sure it is a <select> dropdown
		#3- Then locate the <select> dropdown with any Selenium locators
		#4- Then pass the dropdown web element into Select class object's constructor

	Two different ways to approach:

	#1- syntax:
			WebElement dateDropdown = driver.findElement(By.LOCATOR);

			Select select = new Select(dateDropdown);

	#2- syntax:
			Select dateDropdown = new Select(driver.findElement(By.LOCATOR));


How many ways to select from a dropdown?
	- We have 3 ways selecting an option from dropdown.

	#1 - select by index
	#2 - select by value
	#3 - select by visible text

	<select>
		<option value="OR">ORANGE</option>				index 0
		<option value="KI">KIWI</option>				index 1
		<option value="ST">STRAWBERRY</option>			index 2
	</select>


#1 - select by index --> Selecting STRAWBERRY:
	- indexes start from 0

		fruitDropdown.selectByIndex(2);

#2- select by value --> Selecting KIWI:
	- We need to use the value of attribute "value"

		fruitDropdown.selectByValue("KI");

#3 - select by visible text --> ORANGE
	- We use the text we see on the page
	- Literally what you see on the page is used in the method as a String
	- It will find the text, and select the option

		fruitDropdown.selectByVisibleText("ORANGE");


--> How do we get all the options from a Select dropdown?

	- We use .getOptions() method to get all the options.
	- It will return all of the options from dropdown.

	What is the return type of this method?
		-> Returns a List of WebElements

--> How do we verify which option is currently selected?
	- .getFirstSelectedOption();
	- This method will return the currently selected option.

	What is the return type of this method?
		-> Returns a single web element.

--> How do you get all of the selected options if there are multiple ones selected?
	- .getAllSelectedOptions();
	- This method will return all of the currently selected options.

For mac --> Using "command + click with mouse"
	--> or shift + click ==> For shift Points A to B
For windows --> Using "control + click with mouse"
	--> or shift + click ==> For shift Points A to B


======================================================================

PIQ:
	How do you handle dynamic web elements?

	#1- We can locate a static parent, and come to the desired child. (if exists)
	#2- We can locate a static child, and come to the parent. (if exists)

	-> startswith
	-> endswith
	-> contains

	-> I could find a static parent or child to locate my web element. If I dont have any one those, I can use one of the 3 methods that comes from xpath: contains, startswith and ends with.

=========================================================================

	Some of the common Maven alternatives:
		- Ant
		- Gradle

===========================================================================
	-> Maven stores all the dependencies in a folder called .m2
	-> this is a hidden folder

	#1- Finder
	#2- Select "Go" from top
	#3- Select "Go to folder" from that menu
	#4- Enter: 	~/.m2 --> press enter
	#5- Go into the folder
	#6- DELETE ALL FOLDERS IF YOU HAVE PROBLEM WITH DEPENDENCIES.



===========================================================================


How many dependencies we have used so far?
	- java-selenium
	- boni-garcia -> WebDriverManager
	- TestNG

Today we will add 4th dependency:

	- JAVAFAKER: library is used to create a fake data that can be used for testing purposes.

		-> It is a small library that has the ability to generate random data.
		-> Useful when you have a bunch of input boxes on the page
		-> You can use javafaker to generate some of the following data:
			-name
			-last name
			-full name
			-address
			-zipcode
			-creditcard
			-ssn
			- and dozens and dozens other more things


==========================================================================================

NullPointerException
	-> Most of the time you get this exception in Selenium because have some kind of a driver problem.
	-> Usually when your driver has multiple instances or it does not connect well with the test automation flow you created.
	-> In this case, your driver value will be null -->  driver == null








 */
public class TODAYSNOTES {
}
