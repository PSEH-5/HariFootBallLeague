package com.football.match.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.football.match.model.Country;
import com.football.match.repositories.CountryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryRepositoryTest {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Test
	public void testCountryRepositoryTest() {
		Country country = countryRepository.getCountryByName("France");
		assertTrue(46==country.getId());
	}

}
