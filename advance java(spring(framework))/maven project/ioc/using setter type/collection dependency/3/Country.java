package com.jspiders.mavenproject4;

import java.util.Map;

public class Country {
	private String countryname;
	private Map<String,String> stateandlanguage;
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public Map<String, String> getStateandlanguage() {
		return stateandlanguage;
	}
	public void setStateandlanguage(Map<String, String> stateandlanguage) {
		this.stateandlanguage = stateandlanguage;
	}
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", stateandlanguage=" + stateandlanguage + "]";
	}
	

}
