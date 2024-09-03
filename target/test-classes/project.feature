Feature: Contact Us Form Submission

  Scenario: User submits the contact us form successfully
    Given the user is on the home page
    When the user navigates to the About Us page
    And the user scrolls down and selects the Hotel, Office, and Healthcare tabs
    And the user navigates to the Our Services page
    And the user navigates to the Contact Us page
    And the user fills out the contact form
    And the user submits the contact form
    Then the user should see a confirmation message
