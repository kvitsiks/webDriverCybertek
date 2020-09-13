package com.cybertek.tests.day4_findElements_checkboxes_radio;
/*
SEPTEMBER 12, SATURDAY

Today's schedule:
	- Recap
	- Tasks shared
	- findElements
	- how to handle checkboxes and radiobuttons
	- lots of practices

#cssSelector
	- One of the 8 locators of the selenium library.
	- This locator is different then the others, because we are able to use the attributes and attribute values to locate any web element we want
	- We can locate one of the parents of the web element we want to locate, and go down to the desired web element
	- Or we can even locate siblings as well


	#1- Syntax: this syntax allows us to locate any element(tagName) with its existing attribute and attribute values

			tagName[attribute='attributeValue']

	#2- Syntax: This works for only when you want to locate with class or id attribute values

		tagName#attributeValue --> When you want to locate using id attribute value

		tagName.attributeValue --> When you want to locate using class attribute value


		<div id="h5" name="ff2" class="asd5">

			<a href="https://www.google.com"> Click here for GOOGLE </a>

		</div>


		ex#1: Write a locator that will locate above 'div' element with syntax #1.

			tagName[attribute='attributeValue']

			div[id='h5']
			div[name='ff2']
			div[class='asd5']

			All of these 3 locators are locating the same web element using different attributes and attribute values.

		ex#2: Write a locator that will locate the above 'div' with syntax#2.

		<div id="h5" name="ff2" class="asd5">

			<a href="https://www.google.com"> Click here for GOOGLE </a>

		</div>

			tagName#attributeValue --> for id

				div#h5

			tagName.attributeValue --> for class

				div.asd5


How to go from parent to child using css selector?
	- We use ">" to go from parent to child.

	->   div[id='h5']>a --> this will point to the child of div


================

	XPATH:

		P.I.Q (Possible interview question)

		How many different types of xpath locators we have?
		- We have two different types of xpath.

		#1- Absolute xpath:
			- Starts with single slash: "/"
			- Which means we start from the root of the page: /html
			- It goes 1 element by 1 element down to desired web element
			- It is NOT STABLE, therefore it is not reliable.
			- It will break with any minimal changes in the html structure.

			/html/body/div/div/div/a/span

			/html/body/div[2]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]

		#2- Relative xpath:

			- Relative xpath starts with double slash: //
			- Starts from anywhere in the html page
			- A lot more reliable then absolute xpath


		<div id="h5" name="ff2" class="asd5">

			<a href="https://www.google.com"> Click here for GOOGLE </a>

		</div>

		//tagName --> this is also a relative xpath

Common relative xpath locators to use and be familiar with:


	#1 - //tagName[@attribute='value']
		--> tagname, attribute, value to locate a web element.

		//div[@class='asd5']

	#2 - //tagName[.='text']
		--> we can locate a webelement using its text

		//a[.='Click here for GOOGLE']

	#3 - //tagName[contains(@attribute, 'value')]
		--> it will locate the given web element by checking the "value" and if it is contained in the given attribute

		//div[contains(@class, 'asd')]


		<div id="h5" name="ff2" class="asd5">

			<a href="https://www.google.com"> Click here for GOOGLE </a>

			<div>
				<span> Powered by something</span>
			</div>

		</div>


How do we go from parent to child using xpath?

	-->ex:	Locating anchor tag by its parent using xpath.

	//div[@class='asd5'] --> this is locating the div
	//div[@class='asd5']/a --> this is now locating the anchor tag using its parent

	-->ex#2: Locate the above span by its grand parent div using relative xpath

	//div[@id='h5']/div/span --> this will return me the span



How do we go from CHILD TO PARENT using xpath?
	- When we want to go from child to parent: /..


	<div id="h5" name="ff2" class="asd5">

		<a href="https://www.google.com" id="kk9"> Click here for GOOGLE </a>

		<div>
			<span> Powered by something</span>
		</div>

	</div>

	ex: //a[@id='kk9'] --> this is pointing to a tag
	    //a[@id='kk9']/.. --> this is pointing to div (the parent of anchor tag)


How do we use index numbers to select desired web element.

	--> To use index numbers to go to different web elements we need to use square brackets.
	--> This is when the web elements are directly siblings to each other.

	//div[@class='container']/div[1] -> this will go to the first child
	//div[@class='container']/div[2] -> this will go to the second child
	//div[@class='container']/div[3] -> this will go to the third child

If the web elements are not siblings to each other, then we need to put the locator inside of paranthesis, THEN we pass index numbers


	(//div[@class='container']/div)[1]


 //to open search box in inspection tool:
            //MAC: command + F
            //Windows : control + F


Why people getting different results on the same page?
	- It can be because different OS: Mac, windows
	- It can be different browser type
	- It can be different browser version
	- It can be different screen size

#1 thing to check:

File -> Project Structure -> Modules -> Make sure Language Level is 8

#2:
MAC:
	Preferences > Search : 'java compiler' in search box > Make sure your target byte code version is matching with the one you have in the project structure

WINDOWS:
	SETTINGS > Search : 'java compiler' in search box > Make sure your target byte code version is matching with the one you have in the project structure



------------------
	p.i.q.

	FindElement vs FindElements
		-findElement:
			-> finds and returns a single web element
			-> return type is WebElement
			-> throws NoSuchElementException if it cannot find web element

		-findElements:
			-> finds and returns multiple web elements
			-> return type is List<WebElement>
			-> if it does not find any web element, it will NOT throw exception.
			-> it will just return EMPTY LIST.

How do we handle radio buttons and check boxes?
	-> We use .isSelected() method or .isEnabled() method to handle checkboxes and radio buttons.

	-> These methods will return boolean value.
	-> These methods will return true if the given condition is true.
	-> meaning: it will return true if the checkbox is selected.
	-> it will return true if checkbox is enabled.


StaleElementException:
	-> Happens in two conditions:
	#1 -> If the web element we are looking is deleted from the page, we will get stale element exception.

	#2 -> When your driver looses the reference to the located web element.
	-> This happens usually when some kind of navigation happens on the page. Such as: forward(), back(), refresh()

 */
public class TODAYS_NOTES {
}
