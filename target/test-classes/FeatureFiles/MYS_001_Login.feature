
Feature: Login page of haboom website
@login
Scenario: myshop website open successfully with valid username and password
  Given user open website URL
    When the user enter the valid username/email id
    And the user enter the valid password
    And the user clicks the login button
    Then myshop website open successfully with valid username and password