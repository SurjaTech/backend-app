package com.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String fullName;
	private String email;
	private String password;
	private String role;
	private String status;
	private String cratedDate;
	private String updateDate;
	private String cratedBy;
	private String updatedBy;
	
	public User() 
	{
		super();
	}

	public User(int userId, String userName, String email, String password, String role, String cratedDate, String updateDate, String cratedUser, String updateUser) 
	{
		super();
		this.userId = userId;
		this.fullName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.cratedDate = cratedDate;
		this.updateDate = updateDate;
		this.cratedBy = cratedUser;
		this.updatedBy = updateUser;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCratedDate() {
		return cratedDate;
	}

	public void setCratedDate(String cratedDate) {
		this.cratedDate = cratedDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getCratedBy() {
		return cratedBy;
	}

	public void setCratedBy(String cratedBy) {
		this.cratedBy = cratedBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}