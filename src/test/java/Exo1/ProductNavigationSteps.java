package Exo1;

import io.cucumber.java.en.*;

public class ProductNavigationSteps {

    @Given("the user is on the categories page")
    public void the_user_is_on_the_categories_page() {
        System.out.println("Navigating to the categories page");
    }

    @When("the user clicks on a category")
    public void the_user_clicks_on_a_category() {
        System.out.println("User clicks on a category");
    }

    @Then("the user should see products corresponding to that category")
    public void the_user_should_see_products_corresponding_to_that_category() {
        System.out.println("Displaying products for the selected category");
    }
}

