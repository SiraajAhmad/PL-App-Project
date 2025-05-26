package com.example.premierleagueapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playerID")
    private Long playerId;

    @Column(name = "playerFirstName")
    private String playerFirstName;

    @Column(name = "playerSurname")
    private String playerSurname;
    
    @Column(name = "totalYellowCards")
    private int totalYellowCards;
    
    @Column(name = "totalRedCards")
    private int totalRedCards;

    @Column(name = "goalsScored")
    private int goalsScored;
    
    @ManyToOne
    @JoinColumn(name = "teamID")
    private Team team; 

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}

	public String getPlayerSurname() {
		return playerSurname;
	}

	public void setPlayerSurname(String playerSurname) {
		this.playerSurname = playerSurname;
	}

	public int getTotalYellowCards() {
		return totalYellowCards;
	}

	public void setTotalYellowCards(int totalYellowCards) {
		this.totalYellowCards = totalYellowCards;
	}

	public int getTotalRedCards() {
		return totalRedCards;
	}

	public void setTotalRedCards(int totalRedCards) {
		this.totalRedCards = totalRedCards;
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	  public Team getTeam() {
	        return team;
	    }

	    public void setTeam(Team team) {
	        this.team = team;
	    }

}
