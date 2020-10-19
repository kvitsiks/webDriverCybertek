package com.cybertek.tests.day7_webtables;
/*
September 22nd, Tuesday

Today's schedule:
	-> Brief recap
	-> How to handle webtables?


=====================================================

What is TestNG?
	-> TestNG is a Unit testing framework.
	-> TestNG is a unit testing framework inspired by JUNIT.

Is it for TESTERS?
	-> No.
	-> It is created for developers. But as testers we are taking advantage of some of its functionalities.

Why do we use this tool as tester?
	-> Because we get to create a certain test flow using ANNOTATIONS that comes from TESTNG.
	-> Also we get ASSERTIONS that help us determine if a test has passed or failed.
	-> Assertions also help us generating test reports.

How do you implement TestNG?
	-> We add the dependency into pom.xml file


What is maven?
	-> It's a "built" automation tool that helps us to automate creating JAVA projects.

What is a built?
	-> A built is the repeated steps when you create a java project such as: creating folder structure, compiling the code, testing, deploying
	-> Since maven automates all of these steps, we say maven is "BUILT" automation tool.

How do we handle dynamic web elements?
	-> If there is a static parent or a child, then we would create locator using those.
	->  There are 3 xpath methods that help us handle dynamic web elements.
		- startswith
		- endswith
		- contains

		syntax:
		//div[contains(@attribute, ‘value’)]
		//div[starts-with(@attribute, ‘value’)]
		//div[ends-with(@attribute, ‘value’)]


What is absolute xpath vs relative xpath?
	- Absolute xpath:
		- starts with single slash --> /
		- starts from the root element --> <html>
		- comes down to child by child until we find the desired web element
		- not suggested to use, because it will be breaking very easy if there is any change in the html structure


	- Relative xpath:
		- starts with double slash --> //
		- every time you use double slash it will find and jump to the given element
		- you are able to start from anywhere in the HTML code


How to go from parent to child using xpath?

	-> we use single slash to go from parent to child.
	//div[@class='something']/a

How to go from child to parent using xpath?

	-> we use /.. to go from child to parent

	//div[@class='something']/..

===========================================================

How do we create web tables in HTML?

1- We create <table> tag
2- We create <thead> <tbody>
3- We create rows first using <tr>
4- We create cells using <td>

tr --> stands for table row
<td> stands for table data
<th> --> stands for table header. just makes things centered and bold.
THEAD AND TBODY:
they are indicators of where the tablehead and the tablebody starts and ends

<table>
	<thead>
		<tr>
			<td></td>
			<td></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>

	</tbody>

</table>


====================================================

How do we handle web tables using Selenium webdriver?

	-> We create specific xpath locators to locate what we want to get from the table itself.


P1_LOCATING THE TABLE ITSELF: (Consider there might be other tables on the page)

	-> //table[@id='ctl00_MainContent_orderGrid']

P2_LOCATING ALL OF THE ROWS IN THE TABLE:

	#1- locating the table, moving to tbody, move to tr
	//table[@id='ctl00_MainContent_orderGrid']/tbody/tr

	#2- locating the table, then jumping to the rows using relative xpath //

	//table[@id='ctl00_MainContent_orderGrid']//tr

P3_LOCATING ALL OF THE ROWS IN ALL OF THE CELLS:

	//table[@id='ctl00_MainContent_orderGrid']//tr/td


P4_LOCATING ONLY THE NAMES FROM THE TABLE

	//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]

P5_LOCATING PAUL BROWN FROM THE TABLE

	Locating using text of the cell:
		//table[@id='ctl00_MainContent_orderGrid']//td[.='Paul Brown']

	Locating using index numbers:

		//table[@id='ctl00_MainContent_orderGrid']//tr[2]/td[2]

	What we are saying is:
		//tr[2] -> get me the second row
		//td[2] -> get me the second cell


P6_LOCATE LAS VEGAS WITHOUT USING TEXT

	//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[7]

P7_LOCATE STEVE JOHNS USING TEXT (ACKNOWLEDGING THAT THERE IS ONLY ONE TABLE ON THIS PAGE)

	//td[.='Steve Johns']
	//td[text()='Steve Johns']

	Locate steve johns without using text:

	//tr[4]/td[2]

P8_LOCATE STEVE JOHNS' ORDER DATE USING ITS TEXT

	Your starting point: //td[.='Steve Johns']

	First way is to move to parent, then move back to the <td> we want to return

	//td[.='Steve Johns']/../td[5]

	Second way is to directly move to other siblings:

	//td[.='Steve Johns']/following-sibling::td[3]

	--> the sibling that we use as a base (STEVE JOHNS) is "point 0", or "index number 0", then you start counting until the web element you want to locate.


P9_LOCATE CLARE JEFFERSON'S CITY
	Take clare jefferson as a base:

	//td[.='Clare Jefferson']/following-sibling::td[5]


	//td[.='Clare Jefferson']/../td[7]


P10_LOCATE STEVE JOHN'S CHECKBOX
	Take "steve johns" as base

	First way is to move to parent, then move back to the <td> we want to return

	//td[.='Steve Johns']/../td[1]


	Second way is to directly move to other siblings:
	//td[.='Steve Johns']/preceding-sibling::td[1]


P11_LOCATE 2ND CANADA FROM THE TABLE AND GET THE NAME FROM THAT ORDER

	(//td[.='Canada'])[2]/preceding-sibling::td[6]


When you create a locator that returns more than one option, you have the freedom to pass index number to select which one you want to get.

	if they are siblings you can directly pass the index number:
	syntax:
		//div[@class='something'][2]
		//div[@class='something'][3]
		//div[@class='something'][4]

	if they are not siblings: you must surround the whole locator with paranthesis (), then pass index number.

		(//div[@class='something'])[2]
		(//div[@class='something'])[3]
		(//div[@class='something'])[4]

/following-sibling::<tag> --> Will return only web elements that comes AFTER
/preceding-sibling::<tag> --> Will return only web elements that comes BEFORE



 */
public class TODAYSNOTES {
}
