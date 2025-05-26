package com.example.premierleagueapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Referee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "officialID")
    private Long refereeId;
    
    @Column(name = "officialFirstName")
    private String refereeFirstName;

    @Column(name = "officialSurname")
    private String refereeSurname;
    
    @Column(name = "totalYellowCardsGiven")
    private int totalYellowCardsGiven;
    
    @Column(name = "totalRedCardsGiven")
    private int totalRedCardsGiven;

    @Column(name = "totalPensAwarded")
    private int totalPensAwarded;

    @Column(name = "totalGamesOfficiated")
    private int totalGamesOfficiated;

    @Column(name = "totalScoreIndex")
    private int totalScoreIndex;

    @Column(name = "averageScoreIndex")
    private int averageScoreIndex;

	public Long getRefereeId() {
		return refereeId;
	}

	public void setRefereeId(Long refereeId) {
		this.refereeId = refereeId;
	}

	public String getRefereeFirstName() {
		return refereeFirstName;
	}

	public void setRefereeFirstName(String refereeFirstName) {
		this.refereeFirstName = refereeFirstName;
	}

	public String getRefereeSurname() {
		return refereeSurname;
	}

	public void setRefereeSurname(String refereeSurname) {
		this.refereeSurname = refereeSurname;
	}

	public int getTotalYellowCardsGiven() {
		return totalYellowCardsGiven;
	}

	public void setTotalYellowCardsGiven(int totalYellowCardsGiven) {
		this.totalYellowCardsGiven = totalYellowCardsGiven;
	}

	public int getTotalRedCardsGiven() {
		return totalRedCardsGiven;
	}

	public void setTotalRedCardsGiven(int totalRedCardsGiven) {
		this.totalRedCardsGiven = totalRedCardsGiven;
	}

	public int getTotalPensAwarded() {
		return totalPensAwarded;
	}

	public void setTotalPensAwarded(int totalPensAwarded) {
		this.totalPensAwarded = totalPensAwarded;
	}

	public int getTotalGamesOfficiated() {
		return totalGamesOfficiated;
	}

	public void setTotalGamesOfficiated(int totalGamesOfficiated) {
		this.totalGamesOfficiated = totalGamesOfficiated;
	}

	public int getTotalScoreIndex() {
		return totalScoreIndex;
	}

	public void setTotalScoreIndex(int totalScoreIndex) {
		this.totalScoreIndex = totalScoreIndex;
	}

	public int getAverageScoreIndex() {
		return averageScoreIndex;
	}

	public void setAverageScoreIndex(int averageScoreIndex) {
		this.averageScoreIndex = averageScoreIndex;
	}

}
