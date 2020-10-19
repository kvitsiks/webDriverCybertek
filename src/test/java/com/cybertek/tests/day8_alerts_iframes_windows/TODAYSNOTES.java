package com.cybertek.tests.day8_alerts_iframes_windows;
/*
September 27th, Sunday-Funday

Today Schedule
- Task solving 4-5, 7-8
- BrowserUtils
- Alerts
- Iframes
- Windows

----------------------------------------
PIQ.
ALERTS & HOW TO HANDLE THEM?

There are 2 types of alerts.

	1- HTML Alert/Pop Up
	2- JavaScript Alerts

1- HTML Alert:
	- Created using regular HTML tags, such as divs.
	- How to handle HTML ALERTS?
		- We locate just as any other web element.
		- And click to close/accept/dismiss.

2- JavaScript Alerts:
	- JS Alerts are created implementing JS in HTML.
	- When JS Alert is on the page, user cannot do any other action until handling the alert.

	To handle alerts, we need to create instance of "Alert" class, then switch driver's focus to the currently present alert.

	There are 3 types of JavaScript alerts

	1- Warning/Information Alert:
		- User has only one option: ACCEPT.
		- You can only accept this alert.

		syntax:
		Alert alert = driver.switchTo().alert();
		alert.accept();

	2- Confirmation Alert:
		- User has two options. ACCEPT or DECLINE.
		- You can accept or dismiss this alert.

		syntax:
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();

	3- Prompt Alert:
		- User can accept, dismiss, and also sendKeys to this alert.

		syntax:
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("Anything you want to send inside of the alert");

===============
P.I.Q.

IFRAME
	- Iframe stands for Inline Frame.
	- Basically <html> code inside of another <html> code.
	- Iframes are created using <iframe></iframe> tag
	- If there is an iframe in the page, and we are trying to locate a webelement that is inside of an iframe, YOU MUST SWITCH YOUR DRIVER'S FOCUS TO THAT IFRAME.
	- Otherwise you will get NoSuchElementException

<html>
	<head>
	</head>
	<body>

		<iframe id="value-id" name="value-name">
			<html>
			</html>
		</iframe>

	</body>

</html>

How to handle iframes / How do we switch to iframes?
	- There are 3 ways of switching to an iframe.
	- ALL OF THEM REQUIRES US TO USE THE SAME METHOD.
		driver.switchTo().frame();
	- This .frame() method can be overloaded with 3 different args.
		- int -> as index number of the iframe
		- String -> as id or name attribute value
		- WebElement -> as you locate the <iframe> then switch to it.

	1- Locate it as a web element and switch to it
		- Literally locate  <iframe> tag as any other web element using one of the 8 locators of Selenium.

		syntax:
			WebElement iframe = driver.findElement(By.LOCATOR);
			driver.switchTo().frame(iframe);

	2- Switch by index
		- Indexes start from 0.
		- We can pass the index number of the iframe we want to switch to.

		syntax:
			driver.switchTo().frame(0); --> switches to the first iframe
			driver.switchTo().frame(1); --> switches to the second iframe
			driver.switchTo().frame(2); --> switches to the third iframe


	3- Switch by id or name attribute value
		- If you have id or name attribute inside of <iframe> tag, you can PASS those values as a String into .frame() method.
		- driver will switch focus to the matching value

		syntax:
			driver.switchTo().frame("idValue");
			driver.switchTo().frame("nameValue");

- After switching to an iframe, if we want to continue back in the main <html> we have to switch back.
- If we do not switch, the selenium browser driver will keep looking inside of inner <html> code, and will not be able to locate any web element outside of it.
- There are 2 ways of switching back from the iframe.

	1- driver.switchTo().defaultContent();
		- Default content means, the main <html> code on the page.
		- No matter how many iframes inside of iframes, if we use this method, it will switch to the DEFAULT CONTENT.

		syntax: driver.switchTo().defaultContent();

	2- driver.switchTo().parentFrame();
		- This is similar to using /.. from xpath.
		- It just goes back to the direct parent of the currently focused iframe.


		html 			--> 1
			html 		--> 2
				html 	--> 3
				html
			html
		html

Practice:	When my driver is focused on iframe 3,
--> If I say driver.switchTo().defaultContent();
	Now where is it focused at:
	 -> The focus will turn back to default content, which is: #1

--> If I say driver.switchTo().parentFrame();
	Now where is it focused at:
	-> The focus will turn back to default content, which is: #2



 */
public class TODAYSNOTES {
}
