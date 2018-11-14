package com.bahawi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bahawi.entities.Team;
import com.bahawi.services.Iteam;

@RestController
@RequestMapping(value="/teams")
public class TeamController {
	
	@Autowired
	private Iteam iteam;
	
	@GetMapping
	public List<Team> getAllTeams() {
		return iteam.getAllTeams();
	}

}
