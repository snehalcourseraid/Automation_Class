Feature: As a user i want to test login feature

  Scenario: To test login scenario with valid credentials
    Given application is up and running
    When I enter valid credentials
    Then next page"Flightfinder" is displayed
