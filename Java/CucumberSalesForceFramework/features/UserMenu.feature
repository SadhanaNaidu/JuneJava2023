Feature: UserMenu scenarios of SalesForce application


@TC05
Scenario: Checking UserMenu Drop down list
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Then User Clicks on Button "UsernameMenu"
Given User is in the "UserMenuPage"
Then Check for DropDown UserList "UserMenuList"
#|My Profile|
#|My Settings|
#|Developer Console|
#|Switch to Lightning Experience|
#|Logout|

@TC06
Scenario: Checking MyProfile under UserMenu
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Then User Clicks on Button "UsernameMenu"
Given User is in the "UserMenuPage"
Then User Clicks on Button "MyProfile"
#EditProfileAbout-Acttions
Then User Clicks on image "EditProfile" 
Then User Switches to "EditProfileFrame"
Then User Clicks on Button "About"
Then User enter into Textbox "LastName" "Naidu"
Then User Clicks on Button "saveAll"
#PostLink-Actions
Then User Clicks on "Post"
Then User Switches to "Frame"
And User enter into Textbox "enterText" "Hello, Welcome"
Then User Switches back to MainWindow
Then User Clicks on Button "share"
#FileLink-Actions
Then User Clicks on "File"
Then User Clicks on "UploadFromComputer"
Then User Uploads File "chooseFile" "filepath"
Then User Clicks on Button "share"
#PhotoLink-Actions
When User Moves Mouse to Moderator "moderator"
Then User Clicks on "AddPhoto"
Then User Switches to "UploadPhotoFrame"
Then User Uploads File "choosePhoto" "photopath"
Then User Clicks on Button "Save"
#Then User Switches to "photoFrame"
Then User Clicks on Button "SaveAgain"
Then User Switches back to MainWindow


@TC07
Scenario: Checking MySettings under UserMenu
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Then User Clicks on Button "UsernameMenu"
Given User is in the "UserMenuPage"
Then User Clicks on Button "MySettings"
#Personal Actions
Then User Clicks on "Personal"
Then User Clicks on "LoginHistory"
Then User Clicks on "DownloadLoginHistory"
#Display Layout Actions
Then User Clicks on "Display&Layout"
Then User Clicks on "CustomizemyTabs" 
Then User selects value from Dropdown "CustomAppValue" "Salesforce Chatter"
Then User selects value from Dropdown "AvailableTabs" "Reports" 
Then User Clicks on Button "Add"
#Then User Clicks on Button "savebutton"
#Email Actions     
Then User Clicks on "Email"
Then User Clicks on "EmailSettings" 
When User enter into Textbox "EmailName" "Naidu"
When User enter into Textbox "Emailaddress" "Myself@gmail.com"
Then User Clicks on Button "clickOnBcc"
Then User Clicks on Button "SaveEmail"
Then User Accepts alert
#Calendar Actions
Then User Clicks on "Calendar&Reminders"
Then User Clicks on "ActivityReminders"
Then User Clicks on Button "TestReminders"
And User shift to NewWindow Popup



@TC08
Scenario: Checking MySettings under UserMenu
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Then User Clicks on Button "UsernameMenu"
Given User is in the "UserMenuPage"
Then User Clicks on Button "DeveloperConsole"
And User shift to NewWindow Popup
And User closes NewWindow Popup

@TC09
Scenario: Check RememberMe and validate user name feild
Given User is in the "LoginPage"
When User enter into Textbox "Username" "Myself@HomeComp.org"
When User enter into Textbox "Password" "Really82"
Then User Clicks on Button "Login"
Then User Clicks on Button "UsernameMenu"
Then User Clicks on Button "Logout"
And Check for Display of Title "Title" "Login | Salesforce"






