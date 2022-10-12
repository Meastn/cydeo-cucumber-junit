Feature: Wikipedia Search Functionality


  Scenario: search functionality results with title verification
    Given user is on wikipedia homepage
    When user types "Steve Jobs" in the search box
    And user clicks search button
    Then user sees "Steve Jobs" in the wiki page title
    Then user sees "Steve Jobs" in the main header
    Then user sees "Steve Jobs" in the image header

  @scenarioOutline
  Scenario Outline: search functionality results with title verification
    Given user is on wikipedia homepage
    When user types "<searchValue>" in the search box
    And user clicks search button
    Then user sees "<expectedTitle>" in the wiki page title
    Then user sees "<expectedMainHeader>" in the main header

    Examples: search values will be retrieved from this data table
      | searchValue   | expectedTitle | expectedMainHeader |
      | Steve Jobs    | Steve Jobs    | Steve Jobs         |
      | Chuck Norris  | Chuck Norris  | Chuck Norris       |
      | Lady Gaga     | Lady Gaga     | Lady Gaga          |
      | II. Elizabeth | II. Elizabeth | II. Elizabeth      |
      | Bob Marley    | Bob Marley    | Bob Marley         |
      | Marie Curie   | Marie Curie   | Marie Curie        |


