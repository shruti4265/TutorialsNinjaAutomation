Feature: Login Functionality

  Scenario: Login with Valid Credentials

    Given User launches the browser
    And User opens TutorialsNinja website
    When User clicks on My Account
    And User clicks on Login
    And User enters email and password
    And User clicks Login button
    Then User should be logged in successfully