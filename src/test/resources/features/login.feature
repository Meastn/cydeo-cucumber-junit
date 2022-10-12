@Regression
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  After that dashboard should be displayed
  Accounts are : librarian, student, admin
@librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

@Admin
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

@Student
  Scenario: Login as mtudent
    When user enters mtudent username
    And user enters mtudent password
    Then user should see the dashboard