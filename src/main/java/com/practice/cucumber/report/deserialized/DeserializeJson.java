package com.practice.cucumber.report.deserialized;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.cucumber.report.beans.CucumberReport;

public class DeserializeJson {
	
	public static void deserialize(String filePath, String filePath2) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File(filePath);		
		CucumberReport[] ele = objectMapper.readValue(file, CucumberReport[].class);
		
		File file2 = new File(filePath2);		
		CucumberReport[] ele2 = objectMapper.readValue(file, CucumberReport[].class);
		
		List<CucumberReport> reportList = Arrays.asList(ele2);
		
		for (CucumberReport cucumberReport : reportList) {
			cucumberReport.getName();
			
//			
//			 "name": "Title of your feature",
//			    "description": "Feature1 description",
//			    "id": "title-of-your-feature",
//			    "keyword": "Feature",
//			    "uri": "features/test.feature",
//			    "tags": [
//			      {
//			        "line": 1,
//			        "name": "@tagTest1"
//			      }
		}
		
	}
	
	public static void main(String[] args) {
		try {
			deserialize("cucumberReport/cucumber.json", "cucumberReport/cucumber2.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
