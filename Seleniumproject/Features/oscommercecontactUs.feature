Feature: User wants to see contact Us

In order to contact with company
As a site visitor
I want to click contact Us button and put Full Name, E-Mail Adrress,Enquiry, and click continue 



Scenario Outline:Positive visitor contact Us with valid Full Name ,E-Mail Adrress and Enquiry

Given visitor opening the browser
And click the contact Us link
When visitor put "<Full Name>" , "<E-Mail Address>"and"<Enquiry>" 
And visitor click on continue button
Then visitor successfully enquiry the store Owner


Examples:

| Full Name |E-Mail Address  |Enquiry |
| Tom| tom@yahoo.com |I want a know product information |