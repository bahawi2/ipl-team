package com.bahawi.services.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahawi.entities.Team;
import com.bahawi.repositories.TeamRepository;
import com.bahawi.services.Iteam;

@Service
public class ITeamImpl implements Iteam {
	@Autowired
	private TeamRepository teamrepository;
	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		//Team t=teamrepository.findById(1L).orElse(null);
		List<Team> teams=new ArrayList<>();
		teamrepository.findAll().forEach(teams::add);
		return teams;
		//return (List<Team>) teamrepository.findAll();
	}

}
