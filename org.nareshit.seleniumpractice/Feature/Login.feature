Feature: Login functionality

  Scenario: verify login functionality with valid credentials
    Given user is on OrangeHRM Login page
    When user enter valid username and password
    And user clicks on login button
    Then user should redirect to dashboard page
    And close the browser
