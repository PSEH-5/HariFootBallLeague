package com.football.match.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.football.match.repositories.StandingRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StandingRepositoryTest {
	
	@Autowired
	private StandingRepository standingRepository;
	
	@Test
	public void testStandingRepositoryTest() {
		assertTrue(0==standingRepository.getStanding(148, 2621).getOverallLeagueDrawn());
	}

}
