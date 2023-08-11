package com.player.crud.main.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayerRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Recordid;
	private int totalRun;
	private int toatalWickets;
	private int totalSix;
	private int totalFour;
	public int getId() {
		return Recordid;
	}
	public void setId(int id) {
		this.Recordid = id;
	}
	public int getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}
	public int getToatalWickets() {
		return toatalWickets;
	}
	public void setToatalWickets(int toatalWickets) {
		this.toatalWickets = toatalWickets;
	}
	public int getTotalSix() {
		return totalSix;
	}
	public void setTotalSix(int totalSix) {
		this.totalSix = totalSix;
	}
	public int getTotalFour() {
		return totalFour;
	}
	public void setTotalFour(int totalFour) {
		this.totalFour = totalFour;
	}
	

}
