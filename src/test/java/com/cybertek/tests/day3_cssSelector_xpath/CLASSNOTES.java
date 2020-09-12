package com.cybertek.tests.day3_cssSelector_xpath;
/*
September 6TH, Sunday

Maven: built automation tool

What is built?
	- A built is the repeated processes when we create a new project.
	- Basically Maven is automating these repeated steps.


.findElement(LOCATOR);
	- What does it do?
		- Find element method finds and returns one single web element.

	- What does it accept as parameter? What does it need to locate a web element?
		- It accepts a locator, and uses that locator to find and return the web element.

	- What does it return?
		- It returns a WebElement type.

	- What kind of exception does it throw when it does not find a web element?
		- throws NoSuchElementException when it does not find a web element.

	Reasons you might get NoSuchElementException are:
		#1 -> The web element might not be on the page
		#2 -> The web element comes after your driver tries to locate it.
		#3 -> Your locator might not be correct.


.click(); -->
	- clicks to the given web element
	- does not accept any argument
	- does not return anything

.sendKeys(STRING);
	- this method will send the given string into the given web element in the browser.
	- it accepts a string parameter
	- no return type

Keys.ENTER --> It is a command that allows selenium to imitate the user pressing ENTER from the keyboard.

There are 8 LOCATORS in Selenium.


LOCATORS:
	1- name 			:
		- looks for the "name" attribute's value.
		- returns the value with matching result.

	2- id:				:

		- looks for the "id" attribute's value.
		- id attribute's value is always unique to that web element
		- sometimes developers are putting DYNAMIC values to id, therefore it makes it hard to use as a locator.
		- just need to be careful when you refresh the page, if the value is not changing, it means it is not DYNAMIC.

	3- linkText :
		- Looks through the String of the links on the page and returns the matching link as a web element.
		- We can ONLY use this with <a> tags (links)
		- It looks for EXACT text match.

		<a href=""> text </a>

		driver.findElement(By.linkText("text")) --> this will return me the link above


	4- partialLinkText: exactly same as linkText, but only looks for partial text match.

	5- className 		:
		- same as the name and "id".
		- But it looks for the attribute value of "class"

	6- tagName
		- looks for the tagName and returns the matching webElement(s)
		- this will usually return multiple web elements


.getText();
	- Gets the text that is in between the opening tag and the closing tag
	- It does not accept any arguments
	- Return type: String

	ex:

	<div class="uh7" id="ba83" name="uk99">
		<a href="https://www.tesla.com"> Tesla WebPage </a>
	</div>

driver.findElement(By.className("uh7")); --> This will return the web element
driver.findElement(By.className("uh7")).getText() --> This will return the text : Tesla WebPage


driver.findElement(By.id("ba83")).getText() --> This will return the text : Tesla WebPage


.getAttribute("attribute");
	- Gets the the values of the attributes
	- This method can only read inside of the OPENING TAG.
	- Return type: String
	- Accepts one String parameter as an argument.
	- Uses that String to determine which attribute value should be returned.

	<div class="uh7" id="ba83" name="uk99">
		<a href="https://www.tesla.com"> Tesla WebPage </a>
	</div>

	ex:
		To get the value of the name attribute:

		driver.findElement(By.id("ba83")).getAttribute("name") --> returns "uk99" as a String


WHAT IS EMAIL FORMAT?

	username@domain.com
	username@domain.gov
	username@domain.edu


	TLD --> top level domain


.isDisplayed(); -->
	- This method will check if given web element is displayed on the page or not.
	- Return type is boolean.
	- If the web element is displayed, it returns : true
	- If the web element is NOT displayed, it returns : FALSE

	driver.findElement(by.locator).isDisplayed(); --> true/false



SHORTCUT TO INTRODUCE A LOCAL VARIABLE
// Windows -> alt enter
// Mac -> option enter


WebElement type:
	- Comes from Selenium.
	- You can store web elements that is located by findElement method.
	- WHY DO WE USE THIS?
		- More reusable, easy to re-use
		- Easy to maintain
		- Easy to read and understand


UTILITIES:
	- In "utilities" package we create new classes, and new methods for the reasons below:
		#1 -> to remove repetitive steps
		#2 -> to create a new logic
		#3 -> or to create a new logic AND to remove repetitive steps
		#4 -> to make our code easy to maintain.

	Let's say you used
		 WebDriverManager.chromedriver().setup();

 	in 30 different places. And you need to do minor change on your code where you have to change the driver type from chromedriver() to chromedriverA(), then you would have to go in 30 different places and fix it.

 	But if you were to use a utility class&method, you would have only 1 place to go and fix just one line.

 	Shoe factory -> shoe
 	Cell phone factories -> cell phones
 	WebDriverFactory --> web driver

How do we call the method from now on:
	WebDriver driver = WebDriverFactory.getDriver("chrome");


We covered 6 of 8 Selenium locators previously.

#7 -> cssSelector:
	-> cssSelector has its own SYNTAX.
	-> using cssSelector you will be able to locate pretty much every single web element on the page
	-> cssSelector has 2 types of syntaxes:

	#1- tagName[attribute='value']

		<div class="uh7" id="ba83" name="uk99">
			<a href="https://www.tesla.com"> Tesla WebPage </a>
		</div>

		-> Using this syntax of cssSelector, locate div below:

		div[class='uh7'] --> this will locate the webelement above using cssSelector with class
		div[id='ba83'] --> this will use id attr value to locate same web element
		div[name='uk99'] --> this will use name attr value to locate same web element

		-> locate link using cssSelector
		a[href='https://www.tesla.com']

		tagName[attribute='value']

		input[id='twotabsearchtextbox']

	#2 - 2nd syntax of cssSelector.
		.classValue
		#idValue
		tagName.classValue --> . stands for class attribute in css selector
		tagName#idValue --> # stands for id attribute in css selector

	To open the search box in chrome developer tools:
		You need to open the developer first> right click > inspect
		MAC: COMMAND + F
		WINDOWS : CONTROL + F


#8 - xpath
	- xpath is one of the 8 locators of Selenium
	- xpath has its own syntax
	- xpath syntax is different than cssSelector syntax
	- There are 2 different types of xpath:

	#1 - ABSOLUTE XPATH:
		- Absolute xpath starts with single forward slash --> /
		- Absolute xpath starts looking from the root element in HTML page
		- This is not a reliable locator.
		- It will easily break when there is anything simple changes in the HTML structure
		- TRY AVOID USING IT.

	<html>
		<head>
		</head>
		<body>
			<div>
				<h3>this is my header</h3>
			</div>
		</body>
	</html>

	/html/body/div/h3

	#2 - RELATIVE XPATH
		- Relative xpath starts with double slash --> //
		- Starting with double slash means you can look/start from anywhere in the HTML code
		- This is a lot more reliable then absolute xpath
		- This is a lot more specific then absolute xpath
			//tagName --> simple syntax that will find and return the first matching tagName
		css syntax: tagName[attribute='value']

		COMMONLY USED XPATH LOCATORS:

		#1-	//tagName[@attribute='value']
		#2- //tagName[contains(@attribute, 'value')]
		#3- //tagName[.='text']
		#4- //*[@attribute='value']

		EXPLANATIONS:

		#1-	//tagName[@attribute='value']
			-> Looks for the matching tagName with given attribute and value.

		#2- //tagName[contains(@attribute, 'value')]
			-> Looks for the matching tagname with attribute that contains given value

		#3- //tagName[.='text']
			-> Looks for exact text match in webElement

		#4- //*[@attribute='value']
			-> Using * does not care about the tag name, only looks for given attribute and attribute value


ex: //tagName[@attribute='value']

<button class="btn btn-primary" onclick="button2()" name="button2">Button 2</button>

Different ways of locating the same web element above:
	//button[@name='button2'] 			--> using name attribute value to locate
	//button[@class='btn btn-primary'] 	--> using class attribute value to locate
	//button[@onclick='button2()'] 		--> using custom attribute value to locate
	//button[.='Button 2'] 				-->using text value to locate

How to copy xpath from Chrome developer tools?
	- Open inspect tool
	- Right click on the web element you want to get the locator
	- Go to COPY > xpath 	: This one will give you relative xpath
	- Go to COPY > FULL XPATH : this one will give you absolute xpath

------------------
TOPICS COVERED TODAY:
	#1 - RECAP
	#2 - isDisplayed
	#3 - WebElement
	#4 - WebDriverFactory.getDriver() utility
	#5 - cssSelector
	#6 - XPATH



 */



public class CLASSNOTES {

}
