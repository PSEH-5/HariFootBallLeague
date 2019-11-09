package com.football.match.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.football.match.repositories.TeamRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamRepositoryTest {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Test
	public void testTeamRepo() {
		assertTrue(2611==teamRepository.getTeamByName("Leicester", 148).getTeamId());
	}

}
