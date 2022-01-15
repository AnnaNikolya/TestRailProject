Feature: Testing TestRail
  Scenario: Registration on TestRail
    Given At Home page
    Then click button 'Try TestRail for Free' on HomePage
    And input Web Address 'testrailmailinator'
    And input First Name 'FIRST'
    And input Last Name 'LAST'
    And in the field Your Country choose a value 'Belarus'
    And input Work Email 'testrail@mailinator.com'
    And input Organization
    And in the field Expected Users choose a value '1'
    Then choose input with text "I agree to the TestRail Cloud Terms of Service"
    When User clicks button 'Create TestRail Trial'
    Then Verify text 'Waiting for email confirmation from'
    