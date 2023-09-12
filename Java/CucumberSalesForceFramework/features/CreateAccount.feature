Feature: Create Account scenarios of SalesForce application

@TC10
Scenario: Checking New CreateAccount
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "CreateAccountPage"
Then User Clicks on Tab "Accounts"
Then User Closes PromptDisplay "Prompt"
Then User Clicks on Button "New"
And Check for Display of Title "Title" "Account Edit: New Account ~ Salesforce - Developer Edition"

@TC11
Scenario: Checking New CreateView
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "CreateAccountPage"
Then User Clicks on Tab "Accounts"
Then User Closes PromptDisplay "Prompt"
Then User Clicks on Button "CreateNewView"
When User enter into Textbox "ViewName" "NewViewName"
When User enter into Textbox "UniqueViewName" "NewUniqueViewName"
Then User Clicks on Button "Save"
Then Validate value in List "ListView" "NewViewName"

@TC12
Scenario: Checking On Edit View
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "CreateAccountPage"
Then User Clicks on Tab "Accounts"
Then User Closes PromptDisplay "Prompt"
Then User selects value from Dropdown "value" "View1"
Then User Clicks on "Edit"
When User enter into Textbox "ViewName" "NewView1"
Then User selects value from Dropdown "feild" "Account Name"
Then User selects value from Dropdown "operator" "contains"
When User enter into Textbox "Value" "a"
Then User selects value from Dropdown "AvailableFields" "Last Activity"
Then User Clicks on Button "Add"
Then User Clicks on Button "Save"
Then Validate value in List "ListView" "NewView1"

@TC13
Scenario: Checking On Merge Accounts
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "CreateAccountPage"
Then User Clicks on Tab "Accounts"
Then User Closes PromptDisplay "Prompt"
Then User Clicks on "MergeAccounts" 
When User enter into Textbox "AccountName" "Naidu"
Then User Clicks on Button "FindAccounts"
Then User Clicks on "Checkbox"
Then User Clicks on Button "Next"
Then User Clicks on Button "Merge"
Then User Accepts alert
Then Validate value in List "RecentlyView" "Naidu"

@TC14
Scenario: Checking On Creating Account Report
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "CreateAccountPage"
Then User Clicks on Tab "Accounts"
Then User Closes PromptDisplay "Prompt"
Then User Clicks on "lastactivity" 
Then User Clicks on "datefield" 
Then User selects value from "datefieldValue" 
Then User sets Todays date in "FromDate"
Then User sets Todays date in "ToDate"
Then User Clicks on Button "Save"
#Then User Switches to "SaveReport"
Then User enter into Textbox "ReportName" "Report One"
And User enter into Textbox "UniqueReportName" "UniqueReportOne"
#Then User Clicks on Button "PopUpSave"
#Then User Clicks on Button "RunReport"
Then User Clicks on Button "SaveRunRport"
And Check for Display of Title "Title" "Report One ~ Salesforce - Developer Edition"
And Check for text displayed "PageReportName" "Report One"
#Should work on TC14 (Bugs)





