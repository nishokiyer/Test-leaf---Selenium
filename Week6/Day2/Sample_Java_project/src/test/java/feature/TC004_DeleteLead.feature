Feature: Delete Lead in Leaf taps



Scenario: TC004_DeleteLead positive flow
Given valid username 'Demosalesmanager'
And Valid password 'crmsfa'
When login button clicked
Then new window gets loaded 
When click CRM/SFA link
Then TestLeaf Home page loaded successfully
Given click Leads link 
And Leads menu expands
When Delete button clicked 
