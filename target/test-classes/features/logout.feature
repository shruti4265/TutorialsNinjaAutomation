Feature: Logout

Scenario: Logout Successfully

Given User launches the browser
And User opens TutorialsNinja website
When User clicks on My Account
And User clicks on Login
And User enters email and password
And User clicks Login button
And User clicks Logout
Then User should be logged out successfully