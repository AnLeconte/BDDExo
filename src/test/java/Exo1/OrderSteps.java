package Exo1;

import io.cucumber.java.en.*;

public class OrderSteps {

    @Given("the user is on a product page")
    public void the_user_is_on_a_product_page() {
        // Simulate navigation to a product page
        System.out.println("Navigating to a product page");
    }

    @When("the user clicks {string}")
    public void the_user_clicks(String button) {
        // Simulate clicking a button, e.g., "Add to order"
        System.out.println("User clicks " + button);
    }

    @Then("the user should see a confirmation that the product was added")
    public void the_user_should_see_a_confirmation_that_the_product_was_added() {
        // Verify that a confirmation message is displayed
        System.out.println("Confirmation message displayed");
    }

    @Given("the user has products in their order")
    public void the_user_has_products_in_their_order() {
        // Simulate having products in the order
        System.out.println("User has products in their order");
    }

    @When("the user clicks {string} next to a product")
    public void the_user_clicks_next_to_a_product(String action) {
        // Simulate clicking an action next to a product, e.g., "Remove"
        System.out.println("User clicks " + action + " next to a product");
    }

    @Then("the product quantity should decrease or be removed from the order")
    public void the_product_quantity_should_decrease_or_be_removed_from_the_order() {
        // Verify that the product quantity decreases or is removed
        System.out.println("Product quantity decreased or removed");
    }

    @When("the user accesses the order form")
    public void the_user_accesses_the_order_form() {
        // Simulate accessing the order form
        System.out.println("User accesses the order form");
    }

    @When("the user submits the order")
    public void the_user_submits_the_order() {
        // Simulate submitting the order
        System.out.println("User submits the order");
    }

    @Then("the user should receive an order confirmation")
    public void the_user_should_receive_an_order_confirmation() {
        // Verify that an order confirmation is received
        System.out.println("Order confirmation received");
    }
}

