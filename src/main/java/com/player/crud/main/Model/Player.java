package com.player.crud.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String playerName;
	private int playerAge;
	private String playerState;
	private long playerContactno;
	private String playerEmail;
	 
	@OneToOne(cascade = CascadeType.ALL)
	private PlayerRecord playerRecord;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerState() {
		return playerState;
	}

	public void setPlayerState(String playerState) {
		this.playerState = playerState;
	}

	public long getPlayerContactno() {
		return playerContactno;
	}

	public void setPlayerContactno(long playerContactno) {
		this.playerContactno = playerContactno;
	}

	public String getPlayerEmail() {
		return playerEmail;
	}

	public void setPlayerEmail(String playerEmail) {
		this.playerEmail = playerEmail;
	}

	public PlayerRecord getPlayerRecord() {
		return playerRecord;
	}

	public void setPlayerRecord(PlayerRecord playerRecord) {
		this.playerRecord = playerRecord;
	}
	
	

}
