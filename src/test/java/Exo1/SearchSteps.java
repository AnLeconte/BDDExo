package Exo1;

import io.cucumber.java.en.*;

public class SearchSteps {

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        // Simulate navigation to the homepage
        System.out.println("Navigating to the homepage");
    }

    @When("the user enters a keyword in the search bar")
    public void the_user_enters_a_keyword_in_the_search_bar() {
        // Simulate entering a keyword in the search bar
        System.out.println("User enters a keyword in the search bar");
    }

    @When("the user submits the search")
    public void the_user_submits_the_search() {
        // Simulate submitting the search
        System.out.println("User submits the search");
    }

    @Then("the user should see a list of relevant search results")
    public void the_user_should_see_a_list_of_relevant_search_results() {
        // Verify that relevant search results are displayed
        System.out.println("Relevant search results displayed");
    }
}

