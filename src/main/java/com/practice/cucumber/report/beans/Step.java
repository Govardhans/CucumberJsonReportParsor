package com.practice.cucumber.report.beans;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"result",
"line",
"name",
"match",
"keyword"
})
public class Step {

@JsonProperty("result")
private Result_ result;
@JsonProperty("line")
private Integer line;
@JsonProperty("name")
private String name;
@JsonProperty("match")
private Match_ match;
@JsonProperty("keyword")
private String keyword;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("result")
public Result_ getResult() {
return result;
}

@JsonProperty("result")
public void setResult(Result_ result) {
this.result = result;
}

@JsonProperty("line")
public Integer getLine() {
return line;
}

@JsonProperty("line")
public void setLine(Integer line) {
this.line = line;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("match")
public Match_ getMatch() {
return match;
}

@JsonProperty("match")
public void setMatch(Match_ match) {
this.match = match;
}

@JsonProperty("keyword")
public String getKeyword() {
return keyword;
}

@JsonProperty("keyword")
public void setKeyword(String keyword) {
this.keyword = keyword;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}