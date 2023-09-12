package com.training.steps;

import org.openqa.selenium.WebElement;



import com.training.base.BasePage;
import com.training.base.BaseStep;
import com.training.pagefactory.PageFactory;
import com.training.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseStep{

	PageFactory  pageFactory = new PageFactory();
	BasePage page;
	String parentwindow;
	
	@Before
	public void setup()
	{
		launchapplication();
	}



@Given("User is in the {string}")
public void user_is_in_the(String PageName) 
{
   page = pageFactory.initialize(PageName);
   parentwindow = driver.getWindowHandle();
}

@When("User enter into Textbox {string} {string}")
public void user_enter_into_textbox(String LogicalName, String value) 
{
    page.enterintoTextBox(LogicalName, value);
}

@Then("User Clicks on Button {string}")
public void user_clicks_on_button(String LogicalName) 
{
    page.clickonButton(LogicalName);
}

@Then("Error Message is displayed {string} {string}")
public void error_message_is_displayed(String LogicalName, String Message) 
{
   page.getmessage(LogicalName, Message);
}

@Then("Check for Display of Title {string} {string}")
public void check_for_display_of_title(String LogicalName, String Message)
{
	page.gettitle(LogicalName, Message);
}


@And("Check for text displayed {string} {string}")
public void check_for_text_displayed(String LogicalName, String Text) 
{
    page.gettext(LogicalName, Text);
}

@Then("Check for DropDown UserList {string}")
public void check_for_drop_down_userlist(String LogicalName) 
{
	page.displayUserlist(LogicalName);
}

@Then("Check for DropDown ViewList {string}")
public void check_for_drop_down_viewlist(String LogicalName) 
{
	page.displayOpplist(LogicalName);
}

@Then("User Clicks on image {string}")
public void user_clicks_on_image(String LogicalName) 
{
	page.clickonimage(LogicalName);
}

@Then("User Clicks on {string}")
public void user_clicks_on(String LogicalName)
{
	
	page.clickontext(LogicalName);
}

@Then("User Clicks on Tab {string}")
public void user_clicks_on_tab(String LogicalName) 
{
    page.ClickonTab(LogicalName);
}

@Then("User Closes PromptDisplay {string}")
public void user_closes_prompt_display(String LogicalName) 
{
    page.promptclose(LogicalName);
}

@Then("Validate value in List {string} {string}")
public void validate_value_in_list(String LogicalName, String Value) 
{
    page.getValuefromlist(LogicalName, Value);
}

@Then("User selects value from Dropdown {string} {string}")
public void user_selects_value_from_dropdown(String LogicalName, String Value) 
{
    page.selectvaluedropdown(LogicalName,Value);
}

@Then("User selects value from {string}")
public void user_selects_value_from(String LogicalName) 
{
    page.selectvalue(LogicalName);
}

@Then("User Accepts alert")
public void user_accepts_alert()
{
    page.acceptalert();
}

@Then("User sets Todays date in {string}")
public void user_sets_todays_date_in(String LogicalName) 
{
    page.setTodaysDate(LogicalName);
}

@Then("User Switches to {string}")
public void user_switches_to(String LogicalName) 
{
   page.SwitchTo(LogicalName);
}

@Then("User Switches back to MainWindow")
public void user_switches_back_to_mainwindow()
{
   page.SwitchToWindow(parentwindow);
}

@Then("User Uploads File {string} {string}")
public void user_uploads_file(String LogicalName, String Path) 
{
   page.UploadFile(LogicalName, Path);
}


@When("User Moves Mouse to Moderator {string}")
public void user_moves_mouse_to_moderator(String LogicalName) 
{
   page.movetomoderator(LogicalName);
}

@And("User shift to NewWindow Popup")
public void user_shift_to_newwindow_popup()
{
	page.NewWindowHandle();
}

@And("User closes NewWindow Popup")
public void closedriver()
{
	page.close();
}



/*@After
public void closedriver()
{
	page.close();
}
*/

}
