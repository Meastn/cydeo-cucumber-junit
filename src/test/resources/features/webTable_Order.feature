Feature: Processing orders

  Scenario: user should place order and see it on the orders table
    Given user is already logged in and is on orders page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects Credit Card Type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user clicks process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  Scenario Template: user should place order and see it on the orders table
    Given user is already logged in and is on orders page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<streetAddress>"
    And user enters city "<cityName>"
    And user enters state "<stateName>"
    And user enters zipcode "<zipCode>"
    And user selects Credit Card Type "<cardType>"
    And user enters credit card number "<cardNo>"
    And user enters expiry date "<cardExpDate>"
    And user clicks process order button
    Then user should see "<expectedName>" in first row of the web table

    @femaleScientists
    Examples: Famous female scientists
      | productType | quantity | customerName        | streetAddress        | cityName  | stateName   | zipCode | cardType         | cardNo           | cardExpDate | expectedName        |
      | Familybea   | 2        | Sherlock Holmes        | 221B Baker Street    | London    | England     | 50505   | MasterCard       | 1111222233334444 | 12/23       | Sherlock Holmes     |
      | MoneyCog    | 2        | Marie Curie         | Blocker Street       | Leicester | England     | 55444   | Visa             | 2221133443355334 | 04/27       | Marie Curie         |
      | Familybea   | 3        | Rosaline Franklin   | Durkhai Strasse      | Munich    | Deutshcland | 11333   | American Express | 3311221144115511 | 07/26       | Rosaline Franklin   |
      | MoneyCog    | 4        | Chien-Shiung Wu     | Sitting Duck Street  | Beijing   | China       | 00447   | Visa             | 6655775588559955 | 04/25       | Chien-Shiung Wu     |
      | Screenable  | 5        | Barbara Macclintock | Blendering Street 44 | New York  | USA         | 55444   | MasterCard       | 4477558866994411 | 03/29       | Barbara Macclintock |
    @maleScientists
    Examples: Famous male scientists
      | productType | quantity | customerName    | streetAddress        | cityName  | stateName   | zipCode | cardType         | cardNo           | cardExpDate | expectedName    |
      | Familybea   | 2        | Charles Darwin  | 221B Baker Street    | London    | England     | 50505   | MasterCard       | 1111222233334444 | 12/23       | Charles Darwin  |
      | MoneyCog    | 2        | Isaac Newton    | Blocker Street       | Leicester | England     | 55444   | Visa             | 2221133443355334 | 04/27       | Isaac Newton    |
      | Familybea   | 3        | CV Ramayana     | Durkhai Strasse      | Munich    | Deutshcland | 11333   | American Express | 3311221144115511 | 07/26       | CV Ramayana     |
      | MoneyCog    | 4        | Galileo Galilei | Sitting Duck Street  | Naples    | Italy       | 00447   | Visa             | 6655775588559955 | 04/25       | Galileo Galilei |
      | Screenable  | 5        | Albert Einstein | Blendering Street 44 | New York  | USA         | 55444   | MasterCard       | 4477558866994411 | 03/29       | Albert Einstein |