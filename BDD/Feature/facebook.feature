Feature: Smoke Test for Facebook

  Scenario: Checking Login Operation
    Given Launch browser and Navigate to app
    When I provide valid user name and password
    Then Login Should be succesful
