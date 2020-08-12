Feature: oscommerce ContactUs Link

Scenario Outline:Positive visitor contact Us with valid Full Name ,E-Mail Adrress and Enquiry

Given visitor opening the browser with url
And click the contactUs link
When visitor send "<Full Name>" , "<E-Mail Address>"and"<Enquiry>" 
And visitor click on continue button
Then visitor successfully enquiry the store Owner


Examples:

| Full Name |E-Mail Address  |Enquiry |
| Tom| tom@yahoo.com |I want a know product information |