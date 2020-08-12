Feature: User wants to LogIn from facebook

In order to LogIn from account
As a register user
I want to enter  E-Mail Adrress,Password, and click sign-in to login 



Scenario Outline:Positive user LogIn  with valid E-Mail Address and Password

Given user visiting facebook homapage
When user put "<E-Mail Address>" and "<Password>"
And user click on Log In button
Then user successfully login to the account


Examples:

| E-Mail Address | Password |
| bhai_shree2009@yahoo.com| 9848079994sS$ |