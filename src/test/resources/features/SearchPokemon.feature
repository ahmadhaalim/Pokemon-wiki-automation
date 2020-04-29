Feature: Search Pokemon
  Scenario: Search "Pikachu" on Bulbapedia
    Given User in the bulbapedia homepage
    When User input "Pikachu" on input search and press enter
    Then User get into the "Pikachu" article page
    And with number "#025"

  Scenario: Search "Bulbasaur" on Bulbapedia
    Given User in the bulbapedia homepage
    When User input "Bulbasaur" on input search and press enter
    Then User get into the "Bulbasaur" article page
    And with number "#001"

  Scenario: Search "Empoleon" on Bulbapedia
    Given User in the bulbapedia homepage
    When User input "Empoleon" on input search and press enter
    Then User get into the "Empoleon" article page
    And with number "#395"