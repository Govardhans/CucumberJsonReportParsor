package com.practice.cucumberJava.teststeps;

import cucumber.api.java.Before;

public class LoginSteps extends BaseClass {
	
	public LoginSteps() {
		System.out.println("LoginSteps constructor");
	}
	
	@Before
	public void before() {
		System.out.println("LoginStep before");
	}
	
	
}
