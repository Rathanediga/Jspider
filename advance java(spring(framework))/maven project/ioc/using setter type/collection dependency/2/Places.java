package com.jspiders.mavenproject3;

import java.util.Set;

public class Places {
	private int number;
	private String district;
	Set<String> taluks;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Set<String> getTaluks() {
		return taluks;
	}
	public void setTaluks(Set<String> taluks) {
		this.taluks = taluks;
	}
	@Override
	public String toString() {
		return "Places [number=" + number + ", district=" + district + ", taluks=" + taluks + "]";
	}
	

}
