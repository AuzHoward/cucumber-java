Feature: Belly

  Scenario: a few cukes
    Given Web Browser is open
    And I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl
