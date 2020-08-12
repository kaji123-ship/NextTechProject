Feature: checkOutValidation for oscommerce

Scenario Outline: customer checkout with valid E-Mail Address and Password

Given customer open the browser with urls
And click checkout button
When customer enter "<E-Mail Address>" and "<Password>"
And customer click on Sign In button
Then customer see  checkoutpage and click continue button
Then customer landing on payment page


Examples:

|E-Mail Address | Password |
| pat@yahoo.com | Abc123 |