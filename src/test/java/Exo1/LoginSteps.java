package Exo1;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class LoginSteps {

    private final UserService userService = new UserService();
    private boolean loginResult;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
    }

    @When("the user enters a valid username and password")
    public void theUserEntersValidCredentials() {
        userService.registerUser("test@example.com", "testuser", "password123");
        loginResult = userService.loginUser("testuser", "password123");
    }

    @When("the user enters an invalid username or password")
    public void theUserEntersInvalidCredentials() {
        loginResult = userService.loginUser("testuser", "wrongpassword");
    }

    @When("the user submits the login form")
    public void theUserSubmitsTheLoginForm() {
        // This step is handled in the previous steps
    }

    @Then("the user should be redirected to the homepage")
    public void theUserShouldBeRedirectedToTheHomepage() {
        assertTrue("User should be logged in successfully", loginResult);
    }
}
