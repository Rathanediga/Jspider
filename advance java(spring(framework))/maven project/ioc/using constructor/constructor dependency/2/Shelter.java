package com.jspiders.mavenproject09;

import java.util.Set;

public class Shelter {
	private String state;
	private String language;
	Set<String> district;
	public Shelter(String state, String language, Set<String> district) {
		super();
		this.state = state;
		this.language = language;
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Set<String> getDistrict() {
		return district;
	}
	public void setDistrict(Set<String> district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Shelter [state=" + state + ", language=" + language + ", district=" + district + "]";
	}
	

}
