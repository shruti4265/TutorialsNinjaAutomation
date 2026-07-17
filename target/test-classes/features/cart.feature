Feature: Add Product to Cart

Scenario: Add Product to Cart Successfully

Given User launches the browser
And User opens TutorialsNinja website
When User searches for product "iPhone"
And User opens the product
And User clicks Add To Cart
And User opens Shopping Cart
Then Product should be added successfully