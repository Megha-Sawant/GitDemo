Feature:MenuPage

Scenario Outline: User choose coffees from menupage and verify the list on cartpage
  Given User is on menupage and select the <CoffeeItem> coffee
  When User check the cartpage details
  Then User selected list should exist on cartpage
  Examples:
    | CoffeeItem |
    | Espresso   |
