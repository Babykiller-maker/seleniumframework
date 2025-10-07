Feature: Login Functinality
Scenario: Check  whether user can Login with Valid credentials
Given User should be on login page
When Enter valid username and password
And Click on loginButton
Then Validate HomePage