Feature: OrangHRM Application Test
@SmokeTest
Scenario: Validate OrangHRM Login and Home Page Test

   Given user opens browser with url
   When user is on login page
   Then user enters the login credintials
   Then user validate Dashboard page title
   Then user validate logged username
   Then user validate employeechart
   Then user click to leaveLink
   And user is on leaveListPage
   
   
   @sanityTesting
   Scenario Outline: searching leaveList by employee
   Given user opens browser with url
   When user is on login page
   Then user enters the login credintials
   Then user validate Dashboard page title
   Then user validate logged username
   Then user validate employeechart
   Then user click to leaveLink
   And user is on leaveListPage
   Then user enter "<startDateLeave>" and "<endDateLeave>"
   Then click on All checkbox
   When user type "<employeeName>" and "<subUnit>"
   Then click on searchBtn 
   And click on saveBtn
   
   Examples:

| startDateLeave | endDateLeave |employeeName |subUnit |
| 2020-06-30     |2020-07-15    |Corona shrestha|IT |

Scenario: Adding the employee in addemployee page with dataTable approach With List

	Given user opens browser with url 
	When user is on login page 
	Then user enters the login credintials 
	Then user validate Dashboard page title 
	Then user validate logged username 
	Then user validate employeechart 
	When user go to PIM Link 
	And click the addEmpoyee option 
	Then user landed on addEmployee page
	Then user enter employee details 
	| suman | virus | Thapa | 0109 |
				
	Then user upload the file 
	And Click the save button 
	Then user navigate to personalDetails page
   
   @UATTesting
   Scenario: Adding the employeeDetails in personaldetails page with dataTable approach With list and map

	Given user opens browser with url 
	When user is on login page 
	Then user enters the login credintials 
	Then user validate Dashboard page title 
	Then user validate logged username 
	Then user validate employeechart 
	When user go to PIM Link 
	And click the addEmpoyee option 
	Then user landed on addEmployee page
	Then user enter employee details 
	| sum | virus | Thapa | 0112 |
				
	Then user upload the file 
	And Click the save button 
	Then user navigate to personalDetails page
	Then user click on edit button
	Then user enters the personaldetails
	| DLnumber | licenseExpiryDate | DateOfBirth |
	| 18926563 | 2021-05-09        | 1987-05-08  |
	
	Then user click on radio button
	Then user select the martial status
	Then user select nationality
	And ClickOn Save button
   
   