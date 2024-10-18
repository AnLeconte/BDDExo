Feature: Order Placement

  Scenario: Add product to order
    Given the user is on a product page
    When the user clicks "Add to order"
    Then the user should see a confirmation that the product was added

  Scenario: Remove product from order
    Given the user has products in their order
    When the user clicks "Remove" next to a product
    Then the product quantity should decrease or be removed from the order

  Scenario: Place an order
    Given the user has products in their order
    When the user accesses the order form
    And the user submits the order
    Then the user should receive an order confirmation