@OtherLoginFeatureCombine @Regression @Sanity
Feature: Codefios login functionality validation (Negative scenarios)

@OtherLoginScenarioCombine1
Scenario Outline: User should be able to login with invalid credential
Given User is on the codefios login page
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks into login button
Then User should land on dashboard page

 Examples:
| username           | password |
| demo@codefios.com  | abc123   |
| demo2@codefios.com | abc123   |
|                    |          |


#@OtherLoginScenarioCombine2
#Scenario: User should be able to login with invalid credential
#Given User is on the codefios login page
#When User enters username as "demo@codefios.com"
#When User enters password as "abc124"
#When User clicks into login button
#Then User should land on dashboard page

#@OtherLoginScenarioCombine3
#Scenario: User should be able to login with invalid credential
#Given User is on the codefios login page
#When User enters username as "demo2@codefios.com"
#When User enters password as "abc123"
#When User clicks into login button
#Then User should land on dashboard page
