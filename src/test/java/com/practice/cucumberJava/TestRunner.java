package com.practice.cucumberJava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features",
		glue="com.practice.cucumberJava.teststeps",
		dryRun=false,
		plugin = { "pretty", "com.practice.cucumberJava.api.BddCustomFormatter", "json:cucumberReport/cucumber.json" },
		monochrome = true,
		snippets= SnippetType.CAMELCASE
		)

public class TestRunner {

}




