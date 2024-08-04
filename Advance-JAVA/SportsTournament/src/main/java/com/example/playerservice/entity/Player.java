package com.example.playerservice.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerId;

    @NotBlank
    private String playerName;

    @Enumerated(EnumType.STRING)
    private SportType sportType;

    @NotBlank
    private String contact;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String address;

    @Min(value = 250)
    @Max(value = 300)
    private int sportsPoints;

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public SportType getSportType() {
		return sportType;
	}

	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSportsPoints() {
		return sportsPoints;
	}

	public void setSportsPoints(int sportsPoints) {
		this.sportsPoints = sportsPoints;
	}

    // Getters and setters, constructors
}

