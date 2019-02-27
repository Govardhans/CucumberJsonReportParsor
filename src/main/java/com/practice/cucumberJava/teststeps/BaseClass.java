package com.practice.cucumberJava.teststeps;

import java.util.List;

import cucumber.api.java.Before;
import gherkin.formatter.Formatter;
import gherkin.formatter.Reporter;
import gherkin.formatter.model.Background;
import gherkin.formatter.model.Examples;
import gherkin.formatter.model.Feature;
import gherkin.formatter.model.Match;
import gherkin.formatter.model.Result;
import gherkin.formatter.model.Scenario;
import gherkin.formatter.model.ScenarioOutline;
import gherkin.formatter.model.Step;

public class BaseClass implements Formatter, Reporter  {
	
	public BaseClass() {
		System.out.println("BaseClass Constructor");
	}	

	public void before(Match match, Result result) {
		// TODO Auto-generated method stub
		
	}

	public void result(Result result) {
		// TODO Auto-generated method stub
		
	}

	public void after(Match match, Result result) {
		// TODO Auto-generated method stub
		
	}

	public void match(Match match) {
		// TODO Auto-generated method stub
		
	}

	public void embedding(String mimeType, byte[] data) {
		// TODO Auto-generated method stub
		
	}

	public void write(String text) {
		// TODO Auto-generated method stub
		
	}

	public void syntaxError(String state, String event, List<String> legalEvents, String uri, Integer line) {
		// TODO Auto-generated method stub
		
	}

	public void uri(String uri) {
		// TODO Auto-generated method stub
		
	}

	public void feature(Feature feature) {
		// TODO Auto-generated method stub
		
	}

	public void scenarioOutline(ScenarioOutline scenarioOutline) {
		// TODO Auto-generated method stub
		
	}

	public void examples(Examples examples) {
		// TODO Auto-generated method stub
		
	}

	public void startOfScenarioLifeCycle(Scenario scenario) {
		// TODO Auto-generated method stub
		
	}

	public void background(Background background) {
		// TODO Auto-generated method stub
		
	}

	public void scenario(Scenario scenario) {
		// TODO Auto-generated method stub
		
	}

	public void step(Step step) {
		System.out.println("Step <<"+step.getName()+">> started");
		
	}

	public void endOfScenarioLifeCycle(Scenario scenario) {
		// TODO Auto-generated method stub
		
	}

	public void done() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void eof() {
		// TODO Auto-generated method stub
		
	}

}
