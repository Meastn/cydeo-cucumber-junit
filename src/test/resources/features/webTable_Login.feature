Feature: Testing user login on Web Table Cydeo


  Scenario Outline: user should login with his credentials
    Given user is at login page
    When user enters "<username>" username
    And user enters "<password>" password
    And user clicks to login button
    Then verify that target URL contains "orders"

    Examples: test credentials are stored here
      | username | password |  |
      | Test     | Tester   |  |


  Scenario: user should NOT login with invalid credentials
    Given user is at login page
    When user enters wrong "<username>" username and "<password>" password
    And user clicks to login button
    Then verify that wrong credentials warning is displayed

  Scenario: user should NOT login with blank credentials
    Given user is at login page
    When user enters blank "<username>" username
    And user enters blank "<password>" password
    And user clicks to login button
    Then verify that wrong credentials warning is displayed

    @smoke
  Scenario: user should login with his credentials
    Given user is at login page
#      When username is
#        | Mest | Mester |
#        | Pest | Pester |
#        | Kast | Kaster |
    When user enters below credentials
      | username  | Test     |
      | password  | Tester   |
      And user clicks to login button
    Then verify that target URL contains "orders"


