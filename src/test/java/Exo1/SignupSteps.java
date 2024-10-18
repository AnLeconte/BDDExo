package Exo1;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class SignupSteps {

    private UserService userService = new UserService();
    private boolean registrationResult;

    @Given("the user is on the signup page")
    public void theUserIsOnTheSignupPage() {
        // Simulate navigation to the signup page
    }

    @When("the user enters a valid email, username, and password")
    public void theUserEntersValidCredentials() {
        registrationResult = userService.registerUser("test@example.com", "testuser", "password123");
    }

    @When("the user enters an existing username")
    public void theUserEntersAnExistingUsername() {
        userService.registerUser("test@example.com", "existinguser", "password123");
        registrationResult = userService.registerUser("another@example.com", "existinguser", "password456");
    }

    @When("the user submits the signup form")
    public void theUserSubmitsTheSignupForm() {
        // This step is handled in the previous steps
    }

    @Then("the user should see a confirmation message")
    public void theUserShouldSeeAConfirmationMessage() {
        assertTrue("User should be registered successfully", registrationResult);
    }

    @Then("the user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        assertFalse("User registration should fail due to existing username", registrationResult);
    }
}
