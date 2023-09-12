Feature: Login scenarios of SalesForce application

@TC01
Scenario: Login into application with valid username
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
Then User Clicks on Button "Login"
Then Error Message is displayed "PasswordErrorMessage" "Please enter your password."

@TC02
Scenario: Login into application with valid username and password
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
And Check for Display of Title "Title" "Home Page ~ Salesforce - Developer Edition"

@TC03
Scenario: Check RememberMe and validate user name feild
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "RememberMe"
Then User Clicks on Button "Login"
Then User Clicks on Button "UsernameMenu"
Then User Clicks on Button "Logout"
And Check for text displayed "ValidateUsername" "myself@homecomp.org"

@TC4A
Scenario: To check Forgot Password option
Given User is in the "LoginPage"
Then User Clicks on Button "ForgotPassword"
When User enter into Textbox "UsernameAgain" "Myself@HomeComp.org"
Then User Clicks on Button "Continue"
And Check for text displayed "ForgotPasswordMessage" "Check Your Email"

@TC4B
Scenario: Check the application with wrong username and password
Given User is in the "LoginPage"
When User enter into Textbox "IncorrectUsername" "123"
When User enter into Textbox "IncorrectUsernamePassword" "12231"
Then User Clicks on Button "Login"
And Check for text displayed "ValidateLoginCredentials" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."
