Feature: User wants to Sign in and Sign Off from Oscommerce

In order to Sign in and Sign Off  from account
As a register user
I want to enter  E-Mail Adrress,Password, and click sign-in to login and click sign off for sign Out



Scenario Outline:Positive user login and logout with valid E-Mail Address and Password

Given user visiting homepage
And click My Account button
When user enter "<E-Mail Address>" and "<Password>"
And user click on Sign In button
Then user successfully login to the system
And user click on Log off button for logout

Examples:

| E-Mail Address | Password |
| pat@yahoo.com | Abc123 |