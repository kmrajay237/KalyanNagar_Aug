Feature: Smoke Test for Facebook

  Scenario Outline: Checking Login Operation with Multiple Credentials
    Given Open browser and Navigate to app
    When  provide "<username>" and "<password>"
    And Click on Login Button
    Then Close the Browser

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |
