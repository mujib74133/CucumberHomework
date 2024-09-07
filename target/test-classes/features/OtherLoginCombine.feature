@OtherLoginFeatureCombine
Feature: Codefios login functionality validation (Negative scenarios)

@OtherLoginScenarioCombine1
Scenario: User should be able to login with invalid credential
Given User is on the codefios login page
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks into login button
Then User should land on dashboard page
Examples:
|||