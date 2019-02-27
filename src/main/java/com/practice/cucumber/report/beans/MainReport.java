package com.practice.cucumber.report.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MainReport {
	@JsonProperty("cucumberReport")
	private List<CucumberReport> cucumberReport = null;

	public List<CucumberReport> getCucumberReport() {
		return cucumberReport;
	}

	public void setCucumberReport(List<CucumberReport> cucumberReport) {
		this.cucumberReport = cucumberReport;
	}

}
