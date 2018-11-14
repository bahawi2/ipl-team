package com.bahawi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="PLAYER_TABLE")
public class Player {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PLAYER_ID")
	private Long ID;
	
	@Column(name="PLAYER_Name")
	private String playerName;
	private String preference;
	private int match_played;
	private int runs;
	private int wickets;
	private int highest_score;
	private String best_wicket;
	private int fifties;
	private int centuries;
	private int thirties;
	private int catches;
	private int stumpings;
	private int fours;
	private int sixes;
	private double strike_rate;
	private double average;
	
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team team;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public int getMatch_played() {
		return match_played;
	}

	public void setMatch_played(int match_played) {
		this.match_played = match_played;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getHighest_score() {
		return highest_score;
	}

	public void setHighest_score(int highest_score) {
		this.highest_score = highest_score;
	}

	public String getBest_wicket() {
		return best_wicket;
	}

	public void setBest_wicket(String best_wicket) {
		this.best_wicket = best_wicket;
	}

	public int getFifties() {
		return fifties;
	}

	public void setFifties(int fifties) {
		this.fifties = fifties;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getThirties() {
		return thirties;
	}

	public void setThirties(int thirties) {
		this.thirties = thirties;
	}

	public int getCatches() {
		return catches;
	}

	public void setCatches(int catches) {
		this.catches = catches;
	}

	public int getStumpings() {
		return stumpings;
	}

	public void setStumpings(int stumpings) {
		this.stumpings = stumpings;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public double getStrike_rate() {
		return strike_rate;
	}

	public void setStrike_rate(double strike_rate) {
		this.strike_rate = strike_rate;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	@JsonIgnore
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player(String playerName, String preference, int match_played, int runs, int wickets, int highest_score,
			String best_wicket, int fifties, int centuries, int thirties, int catches, int stumpings, int fours,
			int sixes, double strike_rate, double average, Team team) {
		super();
		this.playerName = playerName;
		this.preference = preference;
		this.match_played = match_played;
		this.runs = runs;
		this.wickets = wickets;
		this.highest_score = highest_score;
		this.best_wicket = best_wicket;
		this.fifties = fifties;
		this.centuries = centuries;
		this.thirties = thirties;
		this.catches = catches;
		this.stumpings = stumpings;
		this.fours = fours;
		this.sixes = sixes;
		this.strike_rate = strike_rate;
		this.average = average;
		this.team = team;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
