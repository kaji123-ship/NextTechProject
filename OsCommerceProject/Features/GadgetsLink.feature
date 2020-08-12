Feature: oscommerce GadgetsLink

Scenario: shopping from gadgets option

Given customer start the browser with url
When customer click the Gadgets link
Then customer see the selected gadgets
And customer click the buy now option 
Then customer can see the cartpage