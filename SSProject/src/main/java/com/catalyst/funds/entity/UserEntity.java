package com.catalyst.funds.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity // This tells Hibernate to make a table out of this class
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;

	private String userName;

	private String email;
	
	private Long phoneNo;
	
	
	@ManyToMany
	private Set<TeamsEntity> teamEntities;



public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer id) {
    this.userId = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String name) {
    this.userName = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  public Long getPhoneNo() {
	return phoneNo;
  }
  
  public void setPhoneNo(Long phoneNo) {
	this.phoneNo = phoneNo;
  }

  public Set<TeamsEntity> getTeamEntities() {
		return teamEntities;
	}

	public void setTeamEntities(Set<TeamsEntity> teamEntities) {
		this.teamEntities = teamEntities;
	}

}