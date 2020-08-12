Feature: Oscommerce user credintial validation
@SmokeTest
Scenario Outline: user login and logout with valid E-Mail Address and Password also user login with invalid email and valid password

Given open the browser with url
And click My Account button
When user enter "<E-Mail Address>" and "<Password>"
And user click on Sign In button
Then user successfully login to the page
And user click on Log off button for logout
Then user close the browser

Examples:

| E-Mail Address | Password |
| pat@yahoo.com | Abc123|
|pet@yahoo.com|Abc123|