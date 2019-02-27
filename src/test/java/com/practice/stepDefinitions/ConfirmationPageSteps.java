package com.practice.stepDefinitions;

import org.junit.Assert;

import com.practice.cucumber.TestContext;
import com.practice.enums.Context;
import com.practice.pageObjects.ConfirmationPage;

import cucumber.api.java.en.Then;

public class ConfirmationPageSteps {
	
	TestContext testContext;
	ConfirmationPage confirmationPage;
	
	public ConfirmationPageSteps(TestContext context) {
		testContext = context;
		confirmationPage = testContext.getPageObjectManager().getConfirmationPage();
	}
	
	@Then("^verify the order details$")
	public void verify_the_order_details(){
		String productName = (String)testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
		Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()>0);		
	}

}
