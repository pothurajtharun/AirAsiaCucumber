package com.airasia.stepDefinations;

import com.airasia.base.TestBase;
import com.airasia.pages.AirasiaHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class AirasiaHomePageStepDefinations extends TestBase {
	
	AirasiaHomePage airasiahomepage;
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.initialization();
	}
	
	
	@Then("^user is on Air Asia Home Page$")
	public void user_is_on_Air_Asia_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		airasiahomepage = new AirasiaHomePage();
		String airasiatitle = airasiahomepage.validateAirasiaHomePageTitle();
		System.out.println(airasiatitle);
	}

	@Then("^click on from search field$")
	public void click_on_from_search_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		airasiahomepage.fromSearchField();
	   
	}

	@Then("^click on to search field$")
	public void click_on_to_search_field() throws Throwable {
		airasiahomepage.toSearchField();
	   
	}

	@Then("^enter the to place$")
	public void enter_the_to_place() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^click on depart date$")
	public void click_on_depart_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^click on one way$")
	public void click_on_one_way() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^click on date$")
	public void click_on_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^click on confirm button$")
	public void click_on_confirm_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}