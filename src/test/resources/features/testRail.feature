Feature: Testing TestRail
  Scenario: Registration on TestRail
    Given At Home page
    Then click button "Try TestRail for Free"
  // слетает тест не пойму почему

    And input Web Address
    And input First Name
    And input Last Name
    And in the field Your Country choose a value ""
    And input Work Email
    And input Organization
    And in the field Expected Users choose a value "1"
    Then choose input with text "I agree to the TestRail Cloud Terms of Service"
    When User clicks button 'Create TestRail Trial'
    Then Verify

    