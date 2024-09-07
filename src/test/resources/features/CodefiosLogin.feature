@LoginFeature @Regression @Sanity
Feature: Codefios login functionality validation


Background:
Given User is on the codefios login page
When User enters username as "demo@codefios.com"


@LoginScenario1 @smoke
Scenario: User should be able to login with valid credential
When User enters password as "abc123"
When User clicks into login button
Then User should land on dashboard page


@LoginScenario2
Scenario: User should not be able to login with invalid credential
When User enters password as "abc124"
When User clicks into login button
Then User should land on dashboard page