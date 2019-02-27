package com.practice.cucumberJava.api;

import java.util.List;

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

public class BddCustomFormatter implements Formatter, Reporter {

	public void before(Match match, Result result) {
		// TODO Auto-generated method stub
		
	}

	public void result(Result result) {
		
		
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
	}

	public void endOfScenarioLifeCycle(Scenario scenario) {
		// TODO Auto-generated method stub
		
	}

	public void done() {
		
		
	}

	public void close() {
		
	}

	public void eof() {
		
	}

}
