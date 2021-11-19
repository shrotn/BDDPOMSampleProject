Feature: Contact Management

Scenario: Create a Contact
Given User is on login page
When User enters login credential
    | username | password |
    | corpdevops@gmail.com | CrmPro123 |
        
Then User navigates to Home Page
And User Clicks Contact link