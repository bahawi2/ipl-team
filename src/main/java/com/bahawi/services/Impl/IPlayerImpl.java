package com.bahawi.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahawi.entities.Player;
import com.bahawi.repositories.PlayerRepository;
import com.bahawi.services.IPlayer;
@Service
public class IPlayerImpl implements IPlayer{
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return (List<Player>) playerRepository.findAll();
	}

	@Override
	public Optional<Player> getPlayerById(Long playerid) {
		// TODO Auto-generated method stub
		return  playerRepository.findById(playerid);
	}

	@Override
	public void SavePlayer(Player player) {
		playerRepository.save(player);
		
	}

	@Override
	public void updatePlayer(Player player) {
		playerRepository.save(player);
		
	}

	@Override
	public void deletePlayer(Long playerid) {
		playerRepository.deleteById(playerid);
		
	}

}
