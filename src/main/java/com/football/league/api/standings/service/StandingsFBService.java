package com.football.league.api.standings.service;

import java.util.List;

import com.football.league.api.standings.pojo.StandingsFBLeagueResponse;

public interface StandingsFBService {
	String getCountryId(String countryName) ;

	String getLeagueId(String leagueName) ;

	List<StandingsFBLeagueResponse> getStandingsData(String countryName, String leagueName, String teamName,String leaguePosition)
			;
}
