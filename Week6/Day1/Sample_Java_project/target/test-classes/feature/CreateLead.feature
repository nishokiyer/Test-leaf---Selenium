Feature: Create Lead in Leaf taps
Background: 
Given A chrome browser is lanched 
And Load Leaf taps URL 'http://leaftaps.com/opentaps/control/main'
And Maximize the browser
Given valid username 'Demosalesmanager'
And Valid password 'crmsfa'
When login button clicked
Then new window gets loaded 
When click CRM/SFA link
Then TestLeaf Home page loaded successfully



Scenario Outline: TC001_CreateLead positive flow
Given click Leads link 
And Leads menu expands
When click create leads from left menu
And Fill the mandatory filed in the form <Companyname> <first name> <last name> <fullname> <dept> <comment> <email> <state>
When Submit button clicked 
Then New Lead number gets generated successfully
Then Close the browser

Examples:
|Companyname|first name|last name|fullname|dept|comment|email|state|
|'CTS'|'Nishok'|'Iyer'|'Nishokiyer'|'Administration'|'Business administration to build your skills and advance your career. Learn business administration from top universities and institutions around the world'|'nishok@rediffmail.com'|'New York'|

Scenario Outline: TC002_EditLead positive flow
Given click Leads link 
And Leads menu expands
When click create leads from left menu
And Fill the mandatory filed in the form <Companyname> <first name> <last name> <fullname> <dept> <comment> <email> <state>
When Submit button clicked 
Then New Lead number gets generated successfully
Given Click the Edit Lead link
And Clear the Decription field
And update new description details in the description field 'This is really a good practice'
When Update button clicked
Then get the Title details
Then Close the browser

Examples:
|Companyname|first name|last name|fullname|dept|comment|email|state|
|'CTS'|'Nishok'|'Iyer'|'Nishokiyer'|'Administration'|'Business administration to build your skills and advance your career. Learn business administration from top universities and institutions around the world'|'nishok@rediffmail.com'|'New York'|

Scenario Outline: TC003_DuplicateLead positive flow
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
Then Close the browser

Examples:
|Companyname|first name|last name|fullname|dept|comment|email|state|
|'CTS'|'Nishok'|'Iyer'|'Nishokiyer'|'Administration'|'Business administration to build your skills and advance your career. Learn business administration from top universities and institutions around the world'|'nishok@rediffmail.com'|'New York'|

Scenario: TC004_DeleteLead positive flow
Given click Leads link 
And Leads menu expands
When Delete button clicked 
Then Close the browser

