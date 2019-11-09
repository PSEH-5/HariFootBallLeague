package com.football.match.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.football.match.model.Country;
import com.football.match.model.League;
import com.football.match.repositories.LeagueRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeagueRepositoryTest {
	
	@Autowired
	private LeagueRepository leagueRepository;
	
	@Test
	public void testCountryRepositoryTest() {
		League league = leagueRepository.getLeagueByName("Championship", 41);
		assertTrue(149==league.getId());
	}

}
