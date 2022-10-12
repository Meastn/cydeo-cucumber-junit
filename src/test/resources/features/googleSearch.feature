Feature: Google Search Functionality
  Agile story :
  As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search functionality results with title verification
    Given user is on Google search page
    When user types apple and clicks Enter
    Then user sees apple in the google search title


  Scenario: Search functionality results with title verification
    Given user is on Google search page
    When user types "pebbles" and clicks Enter
    Then user sees "pebbles" in the google search title