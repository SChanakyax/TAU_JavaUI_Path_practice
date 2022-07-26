Feature: Login Functionality

  Scenario Outline: Login Successful
    Given I am in the login page of the Para Bank Application
    When I enter valid <username> and <password>
    Then I should be taken to the Overview page

    Examples:
    |username|password|
    |"autotester"|"password"|
    |"tautester" |"password"|
