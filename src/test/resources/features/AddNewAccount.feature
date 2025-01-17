@AddAccountFeature
Feature: Codefios Other Add New Account validation

 Background: 
    Given User is on the codefios login page

@AddAccountScenario1
Scenario Outline: User should be able to loging succefully and add a new account	
	When User enters the "<username>" in the "username" field
	When User enters the "<password>" in the "password" field
	And User clicks on "login" button
	Then User should land on Dashboard page 
	And User clicks on "listAccounts"
  And User clicks on "addAccount"
	And User enters "<accountName>" in the "accountName" field in accounts page 
	And User enters "<description>" in the "description" field in accounts page
	And User enters "<initialBalance>" in the "initialBalance" field in accounts page
	And User enters "<accountNumber>" in the "accountNumber" field in accounts page
  And User enters "<contactPerson>" in the "contactPerson" field in accounts page
	And User clicks on "Save"
#	Then User should be able to validate account created successfully
	
	Examples: 
	| username          | password | accountName   | description    | initialBalance | accountNumber | contactPerson  |
	| demo@codefios.com | abc123   | MR's Account1 | MR's Test Acc1 | 100            | 123010101     | Mujibur Rahman |
	| demo@codefios.com | abc123   | MR's Account2 | MR's Test Acc2 | 100            | 123010102     | Mujibur Rahman |
	| demo@codefios.com | abc123   | MR's Account3 | MR's Test Acc3 | 100            | 123010103     | Mujibur Rahman |
	| demo@codefios.com | abc123   | MR's Account4 | MR's Test Acc4 | 100            | 123010104     | Mujibur Rahman |
	| demo@codefios.com | abc123   | MR's Account5 | MR's Test Acc5 | 100            | 123010105     | Mujibur Rahman |
	