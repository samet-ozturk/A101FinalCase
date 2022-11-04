Feature: Case Study Tests

  Background:
    Given homepage is open

  Scenario:
    When Login hover and click
    And login with facebook
    And Search for products
    And Product is Select
    And Verify product in Basket
@scenario2
  Scenario:
    When Search for products
    And Product is Select
    And Verify product in Basket