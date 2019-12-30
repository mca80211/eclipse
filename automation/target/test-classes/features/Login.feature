Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "xyz" and password "1232334"
Then Home page is populated
And Cards displayed "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "abc" and password "1234"
Then Home page is populated
And Cards displayed "false"