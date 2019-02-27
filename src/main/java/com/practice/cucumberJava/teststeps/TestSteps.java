package com.practice.cucumberJava.teststeps;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.formatter.model.Step;

public class TestSteps {
	
	Scenario scenario;
	Step step;
	
	public TestSteps() {
		System.out.println("TestSteps constructor");
	}
	
	@Given("^I want to write a step with precondition$")
	public void iWantToWriteAStepWithPrecondition(){
		System.out.println("###### step exectution started");	
	    
	}

	@Given("^user is logged in$")
	public void userIsLoggedIn()  {
	    
	    
	}

	@Then("^User place an order$")
	public void userPlaceAnOrder()  {	    
	    
	}

}
