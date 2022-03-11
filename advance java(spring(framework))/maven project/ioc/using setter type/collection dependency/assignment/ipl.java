package com.jspiders.mavenproject5;

import java.util.Map;

public class ipl {
	private String game;
	private Map<String,String> teamandcolour;
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public Map<String, String> getTeamandcolour() {
		return teamandcolour;
	}
	public void setTeamandcolour(Map<String, String> teamandcolour) {
		this.teamandcolour = teamandcolour;
	}
	@Override
	public String toString() {
		return "ipl [game=" + game + ", teamandcolour=" + teamandcolour + "]";
	}
	
	
	
	
	

}
