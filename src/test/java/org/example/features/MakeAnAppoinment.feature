Feature: Validating End to End Appoinment

  Scenario: Verify the confirmation message of an appointment
    Given User login with valid credentials
    When User fills the appointment form
    Then Appointment confirmation message is displayed
