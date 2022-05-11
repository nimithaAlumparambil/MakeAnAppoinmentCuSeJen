package org.example.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

    @Given("User login with valid credentials")
    public void user_login_with_valid_credentials() {
        System.out.println("Logged in ");
    }

    @When("User fills the appointment form")
    public void user_fills_the_appointment_form() {
        System.out.println("fill the appoinment");
    }

    @Then("Appointment confirmation message is displayed")
    public void appointment_confirmation_message_is_displayed() {
        System.out.println("confirmation message");
    }
}
