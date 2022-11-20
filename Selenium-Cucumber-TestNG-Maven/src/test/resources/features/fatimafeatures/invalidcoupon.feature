Feature: Test working of entering of invalid coupon

  Scenario Outline: The user gets an error message on invalid coupon code
    Given the cart is not empty
    And the user is on the Cart page
    When the user adds the <invalidInput>
    Then the user gets an <errorMessage>

    Examples: 
      | invalidInput | errorMessage                                                 |
      | FLAT50       | Coupon code FLAT50 cannot currently be added to your cart.   |
      | null         | Please enter a coupon code.                                  |