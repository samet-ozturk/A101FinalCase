Feature: Case Study Tests

  Background:
    Given homepage is open
    And I close the pop up

  Scenario: Verify page title
    When Page title verification
    Then Maximize windows
    And Search for Drone
    And Verify search results are listed for Drone


  Scenario: Verify successful login

    When I open "Account" dropdown menu
    Then I Choose "Sign In" submenu
    Then Sign in page should open
    Then I filled account information
    And I press Enter button
    And Verify successful login


   Scenario: Sign in with Google and open new tab
     When I open "Account" dropdown menu
     Then I Choose "Sign In" submenu
     Then Sign in page should open
     Then Sign in with Google
