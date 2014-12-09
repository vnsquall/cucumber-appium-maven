@iOS
Feature: Select Country before using Lazada iOS App.

  As a user
  I want to select country

  @iOS
  Scenario: Select country/venture
    Given user is on InitPage
    When user click on country dropdown
    Then user can choose from list and done