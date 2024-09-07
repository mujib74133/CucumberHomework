@OtherLoginFeature @Regression
Feature: Codefios login functionality validation (Negative scenarios)

@OtherLoginScenario1
Scenario: User should be able to login with invalid credential
Given User is on the codefios login page
When User enters username as "demo2@codefios.com"
When User enters password as "abc123"
When User clicks into login button
Then User should land on dashboard page


@OtherLoginScenario2 @smoke
Scenario: User should not be able to login with invalid credential
Given User is on the codefios login page
When User enters username as "demo@codefios.com"
When User enters password as "abc124"
When User clicks into login button
Then User should land on dashboard page


@OtherLoginScenario3
Scenario: User should not be able to login with invalid credential
Given User is on the codefios login page
When User enters username as "demo3@codefios.com"
When User enters password as "abc124"
When User clicks into login button
Then User should land on dashboard page


@OtherLoginScenario4
Scenario: User should not be able to login with invalid credential
Given User is on the codefios login page
When User enters username as ""
When User enters password as ""
When User clicks into login button
Then User should land on dashboard page
