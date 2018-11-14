package com.bahawi.controllers;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bahawi.entities.Player;
import com.bahawi.services.IPlayer;

@RestController
@RequestMapping(value="/players")
public class PlayerController {
	@Autowired
	private IPlayer iplayer;
	
	@GetMapping
	public List<Player> getAllPlayesr(){
		return iplayer.getAllPlayers();
	}
	
	@GetMapping("/{playerid}")
	public Optional<Player> getAllPlayeById(@PathVariable Long playerid){
		return iplayer.getPlayerById(playerid);
	}
	
	@PostMapping
	public void SavePlayer(@RequestBody Player player) {
		iplayer.SavePlayer(player);
	}
	
	@PutMapping
	public void updatePlayer(@RequestBody Player player) {
		iplayer.SavePlayer(player);
	}
	@DeleteMapping("/{playerid}")
	public void deletePlayer(@PathVariable Long playerid) {
		iplayer.deletePlayer(playerid);
	}
	

}
