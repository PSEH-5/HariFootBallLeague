package com.football.league.api.service;

import java.util.List;

import com.football.league.api.pojo.FootBallLeagueResponse;

public interface FootBallService {
	String getCountryId(String countryName);

	String getLeagueId(String leagueName);

	List<FootBallLeagueResponse> getFootBallStandingsData(String countryName, String leagueName, String teamName,String leaguePosition)
			;
}
