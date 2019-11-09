package com.football.match.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.match.model.Standing;
import com.football.match.repositories.CountryRepository;
import com.football.match.repositories.LeagueRepository;
import com.football.match.repositories.StandingRepository;
import com.football.match.repositories.TeamRepository;

@Service
public class StandingService {
    @Autowired
	private CountryRepository countryRepository;
    @Autowired
	private LeagueRepository leagueRepository;
    @Autowired
	private TeamRepository teamRepository;
	@Autowired
	private StandingRepository standingRepository;
	
	public Standing getStanding(String countryName, String leagueName, String teamName) {
		//Integer countryId = countryRepository.getCountryByName(countryName).getId();
		//Integer leagueId = leagueRepository.getLeagueByName(leagueName, 41).getId();
		Integer teamId = teamRepository.getTeamByName(teamName, 148).getTeamId();
		return standingRepository.getStanding(148, teamId);
	}
}
