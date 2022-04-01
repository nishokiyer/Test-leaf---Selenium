Feature: Duplicate Lead in Leaf taps

Scenario Outline: TC003_DuplicateLead positive flow
Given valid username 'Demosalesmanager'
And Valid password 'crmsfa'
When login button clicked
Then new window gets loaded 
When click CRM/SFA link
Then TestLeaf Home page loaded successfully
Given click Leads link 
And Leads menu expands
When click create leads from left menu
And Fill the mandatory filed in the form <Companyname> <first name> <last name> <fullname> <dept> <comment> <email> <state>
When Submit button clicked 
Then New Lead number gets generated successfully
Given Click the Duplicate Lead link
And Clear the current company name field
And update new company name 'MPower'
And Clear first name
And update new first name 'Padhmapriyaa'
When Submit button clicked 
Then Duplicate Lead number gets generated successfully


Examples:
|Companyname|first name|last name|fullname|dept|comment|email|state|
|'CTS'|'Nishok'|'Iyer'|'Nishokiyer'|'Administration'|'Business administration to build your skills and advance your career. Learn business administration from top universities and institutions around the world'|'nishok@rediffmail.com'|'New York'|
