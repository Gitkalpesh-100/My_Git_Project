Feature: User Registration

  Scenario: User registration with various data
    Given User is on registration page
    When User enters following details
      | Raman  | Manual     | raman@gmail.com  | 77777 | Bengaluru |
      | John   | Developer  | john@gmail.com   | 99977 | Hyderabad |
      | Mukund | Automation | mukund@gmail.com | 88777 | Chennai   |
    Then user registration should be successful
