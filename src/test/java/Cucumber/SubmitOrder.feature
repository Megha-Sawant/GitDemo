@tag
  Feature:Purchase the order from webcommerce site
    I want to use this template for my feature file

  Background:
    Given I landed on ecommerce page

    @Regression
    Scenario Outline: Positive test of Submitting the order

      Given Logged in to given userID <userID> and pasword <pwd>
      When  I add product <productName> to cart
      And   Checkout <productName> and submit the order
      Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage

      Examples:
        | userID                  | pwd    | productName     |
        | rahulshetty@gmail.com | Iamking@000 | ZARA COAT 3     |
        | shetty@gmail.com      | Iamking@000 | ADIDAS ORIGINAL |

