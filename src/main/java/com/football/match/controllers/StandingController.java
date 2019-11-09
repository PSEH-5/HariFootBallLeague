package com.football.match.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.football.match.model.Standing;
import com.football.match.services.StandingService;

@RestController

public class StandingController {
	
	@Autowired
	private StandingService service;
	@RequestMapping("/standing")
	    public Standing greeting(@RequestParam("countryName") String countryName,
	    		                 @RequestParam("leagueName") String leagueName,
	    		                 @RequestParam("teamName") String teamName) {
		
		
	        return service.getStanding(countryName, leagueName, teamName);
	    }
   
}
