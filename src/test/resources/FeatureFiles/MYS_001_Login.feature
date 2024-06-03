@login
Feature: Login page of Myshop website
#@login
Scenario: myshop website open successfully with valid username and password
  Given user open website
    When the user enter the valid username/email id
    And the user enter the valid password
    And the user clicks the login button
    Then myshop website open successfully with valid username and password
    
Scenario Outline: myshop website open successfully with valid username and password
  Given user open website
    When the user enter the valid username/email id "<username>"
    And the user enter the valid password "<password>"
    And the user clicks the login button
    Then myshop website open successfully with valid username and password
    Examples:
			|username|password|
			|vinayagamoorthy9808@gmail.com|12345@aA|
			|boyssk944@gmail.com|12345@aA|
			|deepthikumar21901@gmail.com|12345@aA|