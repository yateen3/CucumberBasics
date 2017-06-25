Feature: login feature
  This feature deals with login functionality

  Scenario: Login with valid credential
    Given I navigate to login page
    And I enter the following credential
      | username | password |
      | tester   | test     |
      | teste2   | tester2  |
    And I click on enter button
    Then I should see on user form

  Scenario Outline: Login with valid credential outline scenario
    Given I navigate to login page
    And I enter <username> and <password>
    And I click on enter button
    Then I should see on user form

    Examples:
      | username | password |
      | tester   | test     |
      | teste2   | tester2  |
      | teste3   | tester2  |