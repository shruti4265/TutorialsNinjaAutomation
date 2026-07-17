Feature: Product Search

Scenario: Search with a Valid Product Name

Given User launches the browser
And User opens TutorialsNinja website
When User searches for product "iPhone"
Then Matching products should be displayed