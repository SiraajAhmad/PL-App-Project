package com.example.premierleagueapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Team {

    @Id
    @Column(name="teamID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;

    @Column(name = "teamName")
    private String teamName;

    @Column(name = "totalRedCards")
    private int totalRedCardsAwarded;
    
    @Column(name = "totalPensAwarded")
    private int totalPensAwarded;
    
    @Column(name = "topSixTeam")
    private boolean isTopSixTeam;
    // Constructors, getters, setters

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTotalRedCardsAwarded() {
		return totalRedCardsAwarded;
	}

	public void setTotalRedCardsAwarded(int totalRedCardsAwarded) {
		this.totalRedCardsAwarded = totalRedCardsAwarded;
	}

	public int getTotalPensAwarded() {
		return totalPensAwarded;
	}

	public void setTotalPensAwarded(int totalPensAwarded) {
		this.totalPensAwarded = totalPensAwarded;
	}

	public boolean isTopSixTeam() {
		return isTopSixTeam;
	}

	public void setTopSixTeam(boolean isTopSixTeam) {
		this.isTopSixTeam = isTopSixTeam;
	}

}
