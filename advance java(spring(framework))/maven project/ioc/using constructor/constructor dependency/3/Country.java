package com.jspiders.mavenproject10;

import java.util.Map;

public class Country {
	private String name;
	Map<String,String> statesandlanguage;
	public Country(String name, Map<String, String> statesandlanguage) {
		super();
		this.name = name;
		this.statesandlanguage = statesandlanguage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStatesandlanguage() {
		return statesandlanguage;
	}
	public void setStatesandlanguage(Map<String, String> statesandlanguage) {
		this.statesandlanguage = statesandlanguage;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", statesandlanguage=" + statesandlanguage + "]";
	}
	
}
