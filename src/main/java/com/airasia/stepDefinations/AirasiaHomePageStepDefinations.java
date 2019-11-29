package com.airasia.stepDefinations;

import com.airasia.base.TestBase;
import com.airasia.pages.AirasiaHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class AirasiaHomePageStepDefinations extends TestBase {
	
	AirasiaHomePage airasiahomepage;
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	   
		TestBase.initialization();
	}
	
	@Then("^user is on Air Asia Home Page$")
	public void user_is_on_Air_Asia_Home_Page() throws Throwable {
	   
		airasiahomepage = new AirasiaHomePage();
		String airasiatitle = airasiahomepage.validateAirasiaHomePageTitle();
		System.out.println(airasiatitle);
	}

	@Then("^click on from search field$")
	public void click_on_from_search_field() throws Throwable {
	  
		airasiahomepage.fromSearchField();
	   
	}

	@Then("^click on to search field$")
	public void click_on_to_search_field() throws Throwable {
		airasiahomepage.toSearchField();
	   
	}

	@Then("^click on one way$")
	public void click_on_one_way() throws Throwable {
	  
		airasiahomepage.oneWay();
	}

	@Then("^click on date$")
	public void click_on_date() throws Throwable {
	
	}

	@Then("^click on confirm button$")
	public void click_on_confirm_button() throws Throwable {
	    
		airasiahomepage.confirmbutton();
	}

	@Then("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {
	   
		airasiahomepage.submitButton();
	}

}