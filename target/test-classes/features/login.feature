Feature: Application Login

@smoketest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "jin" and password "1234"
Then Home page is populated
And Cards are displayed

@regtest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with following details
| jessy | 12345 | jessy@smail.com | India | 8976543210 | 
Then Home page is populated
And Cards are displayed

@regtest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to the application with <Username> and <password> 
Then Home page is populated
And Cards are displayed

Examples:
|Username|password|
|user1   |pass1   |
|user2   |pass2   |
|user3   |pass3   |