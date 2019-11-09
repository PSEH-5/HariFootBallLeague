package com.football.league.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.football.league.api.config.FootBallDataConfiguration;
import com.football.league.api.pojo.Country;

@Component
public class CountryRepository {

	@Autowired
	FootBallDataConfiguration config;
	/**
	 *
	 */
	
	public ResponseEntity<Country[]>  getCountryId(String countryName)   {

		RestTemplate resttemplate = new RestTemplate();
		ResponseEntity<Country[]> responsecountryList = resttemplate.getForEntity(config.getGetCountriesUrl(),
				Country[].class);
	return responsecountryList;

	}
}
