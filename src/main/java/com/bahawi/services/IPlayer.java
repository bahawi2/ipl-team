package com.bahawi.services;

import java.util.List;
import java.util.Optional;

import com.bahawi.entities.Player;

public interface IPlayer {
	
	List<Player> getAllPlayers();
	Optional<Player> getPlayerById(Long playerid);
	void SavePlayer(Player player);
	void updatePlayer(Player player);
	void deletePlayer(Long playerid);
	
	

}
