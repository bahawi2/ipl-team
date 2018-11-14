package com.bahawi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
@Entity
@Table(name="TEAM_TABLE")
public class Team {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TEAM_ID")
	private Long ID;
	
	private String team;
	private String description;
	private String owner;
	private int total_played;
	private int total_won;
	private int total_lost;
	private int no_result;
	
	@OneToMany(mappedBy = "team", cascade = CascadeType.MERGE, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<Player> players=new ArrayList<Player>();

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getTotal_played() {
		return total_played;
	}

	public void setTotal_played(int total_played) {
		this.total_played = total_played;
	}

	public int getTotal_won() {
		return total_won;
	}

	public void setTotal_won(int total_won) {
		this.total_won = total_won;
	}

	public int getTotal_lost() {
		return total_lost;
	}

	public void setTotal_lost(int total_lost) {
		this.total_lost = total_lost;
	}

	public int getNo_result() {
		return no_result;
	}

	public void setNo_result(int no_result) {
		this.no_result = no_result;
	}
	@JsonIgnore
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Team(String team, String description, String owner, int total_played, int total_won, int total_lost,
			int no_result) {
		super();
		this.team = team;
		this.description = description;
		this.owner = owner;
		this.total_played = total_played;
		this.total_won = total_won;
		this.total_lost = total_lost;
		this.no_result = no_result;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
