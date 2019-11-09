package com.football.match.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Standing {
	
	@JsonProperty("country_name")
	private String countryName;
	@JsonProperty("league_id")
	private Integer leagueId;
	@JsonProperty("league_name")
	private String leagueName;
	@JsonProperty("team_id")
	private Integer teamId;
	@JsonProperty("team_name")
	private String teamName;
	@JsonProperty("overall_league_position")
	private Integer overallLeaguePosition;
	@JsonProperty("overall_league_payed")
	private Integer overAllLeaguePlayed;
	@JsonProperty("overall_league_W")
	private Integer overAllLeagueWon;
	@JsonProperty("overall_league_D")
	private Integer overallLeagueDrawn;
	@JsonProperty("overall_league_L")
	private Integer overAllLeagueLost;
	@JsonProperty("overall_league_GF")
	private Integer overAllLeagueGF;
/*	overall_league_GA
	overall_league_PTS
	home_league_position
	home_league_payed
	home_league_W
	home_league_D
	home_league_L
	home_league_GF
	home_league_GA
	home_league_PTS
	away_league_position
	away_league_payed
	away_league_W
	away_league_D
	away_league_L
	away_league_GF
	away_league_GA
	away_league_PTS*/
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Integer getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getOverallLeaguePosition() {
		return overallLeaguePosition;
	}
	public void setOverallLeaguePosition(Integer overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}
	public Integer getOverAllLeaguePlayed() {
		return overAllLeaguePlayed;
	}
	public void setOverAllLeaguePlayed(Integer overAllLeaguePlayed) {
		this.overAllLeaguePlayed = overAllLeaguePlayed;
	}
	public Integer getOverAllLeagueWon() {
		return overAllLeagueWon;
	}
	public void setOverAllLeagueWon(Integer overAllLeagueWon) {
		this.overAllLeagueWon = overAllLeagueWon;
	}
	public Integer getOverallLeagueDrawn() {
		return overallLeagueDrawn;
	}
	public void setOverallLeagueDrawn(Integer overallLeagueDrawn) {
		this.overallLeagueDrawn = overallLeagueDrawn;
	}
	public Integer getOverAllLeagueLost() {
		return overAllLeagueLost;
	}
	public void setOverAllLeagueLost(Integer overAllLeagueLost) {
		this.overAllLeagueLost = overAllLeagueLost;
	}
	public Integer getOverAllLeagueGF() {
		return overAllLeagueGF;
	}
	public void setOverAllLeagueGF(Integer overAllLeagueGF) {
		this.overAllLeagueGF = overAllLeagueGF;
	}

}
