Feature: Oppurtunities scenarios of SalesForce application

@TC15
Scenario: Checking Oppurtunity dropdown
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "OppurtunitiesPage"
Then User Clicks on Tab "Oppurtunities"
Then User Closes PromptDisplay "Prompt"
Then Check for DropDown ViewList "OppViewList"


@TC16
Scenario: Creating New Oppurtunity
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "OppurtunitiesPage"
Then User Clicks on Tab "Oppurtunities"
Then User Closes PromptDisplay "Prompt"
Then User Clicks on Button "New"
Then User enter into Textbox "OppName" "Oppurtunity6"
Then User enter into Textbox "AccName" "Naidu"
Then User Clicks on "CloseDateField"
Then User selects value from Dropdown "SelectMonth" "December"
Then User selects value from Dropdown "SelectYear" "2024"
Then User Clicks on "Date"
Then User selects value from Dropdown "Stage" "Qualification"
Then User enter into Textbox "Probability" "90"
Then User selects value from Dropdown "LeadSource" "Web"
Then User Clicks on Button "Save"


@TC17
Scenario: Test Oppurtunity PipeLine
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "OppurtunitiesPage"
Then User Clicks on Tab "Oppurtunities"
Then User Closes PromptDisplay "Prompt"
Then User Clicks on "OppurtunityPipeline"
And Check for text displayed "PipeLinePageText" "Opportunity Pipeline"

@TC18
Scenario: Test Stuck Oppurtunity 
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "OppurtunitiesPage"
Then User Clicks on Tab "Oppurtunities"
Then User Closes PromptDisplay "Prompt"
Then User Clicks on "StuckOppurtunity"
And Check for text displayed "StuckOppurtunityText" "Stuck Opportunities"

@TC19
Scenario: Testing Quarterly Summary
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Given User is in the "OppurtunitiesPage"
Then User Clicks on Tab "Oppurtunities"
Then User Closes PromptDisplay "Prompt"
Then User selects value from Dropdown "Interval" "Current and Next FQ"
Then User selects value from Dropdown "Include" "All Opportunities"
Then User Clicks on Button "RunReport"
