Feature: Belly

  Scenario: a few cukes
    Given Web Browser is open
    When Flight type is RoundTrip
    Then Search flights from Dal to MCO
    #And Close Browser
    #And I have 42 cukes in my belly
    #When I wait 1 hour
    #Then my belly should growl
