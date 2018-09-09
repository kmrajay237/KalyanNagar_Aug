Feature: Smoke Test for Facebook

  Scenario: Checking Login Operation
    Given launch browser and Navigate to app
    When I provide "zxcv1234" and "zxcv1234"
    Then Click on Login 
    And Close Browser