Feature: order feature verification
  TC #: Order place scenario
  https://web-table-2.cydeo.com/login
  1- Given user is already logged in to web table app
  2- When user is on the “Order” page
  3- Then user enters appropriate test data
  a. Product
  b. Quantity
  c. Customer name
  d. Street
  e. City
  f. State
  g. Zip
  h. Payment info:
  i. Card type: Visa/MasterCard/American Express
  ii. Card No
  iii. Expire date
  4- And user clicks to “Process Order”
  5- Then user should see new order in the table on “View all orders”
  page
  Note: Follow POM
#1- Parameterize scenario
#2- Scenario Outline after.

  Scenario: Login Verification
    When user is on the login page
  And user clicks to login button
  And user logouts
#    And user enters valid username as "Test" and password as "Tester"
#    And user clicks login buttonn
#    Then user see "order" at the end of url
