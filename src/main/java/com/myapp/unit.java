package com.myapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class unit{
	@Id
	private Integer id;
	private String race;
	private String name;
	private Integer ATK;
	private Integer DEF;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getATK() {
		return ATK;
	}
	public void setATK(Integer aTK) {
		ATK = aTK;
	}
	public Integer getDEF() {
		return DEF;
	}
	public void setDEF(Integer dEF) {
		DEF = dEF;
	}
	
}