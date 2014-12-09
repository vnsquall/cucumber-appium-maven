@android
Feature: Select Country before using Lazada Android App.

  As a user
  I want to select country

  @android
  Scenario: Select country/venture
    Given user is on InitPage
    When user click on country list
    Then user choose Singapore