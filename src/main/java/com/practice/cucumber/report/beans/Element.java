package com.practice.cucumber.report.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "before", "line", "name", "description", "id", "type", "keyword", "steps", "tags" })
public class Element {

	@JsonProperty("before")
	private List<Before> before = null;
	@JsonProperty("line")
	private Integer line;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("id")
	private String id;
	@JsonProperty("type")
	private String type;
	@JsonProperty("keyword")
	private String keyword;
	@JsonProperty("steps")
	private List<Step> steps = null;
	@JsonProperty("tags")
	private List<Tag> tags = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("before")
	public List<Before> getBefore() {
		return before;
	}

	@JsonProperty("before")
	public void setBefore(List<Before> before) {
		this.before = before;
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

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("keyword")
	public String getKeyword() {
		return keyword;
	}

	@JsonProperty("keyword")
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@JsonProperty("steps")
	public List<Step> getSteps() {
		return steps;
	}

	@JsonProperty("steps")
	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> tags) {
		this.tags = tags;
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