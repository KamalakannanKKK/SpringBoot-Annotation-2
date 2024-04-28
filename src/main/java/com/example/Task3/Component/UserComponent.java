package com.example.Task3.Component;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table
public class UserComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userid;
	private String username;
	private String Address;
	private long PhoneNumber;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public UserComponent(int userid, String username, String address, long phoneNumber) {
		super();
		this.userid = userid;
		this.username = username;
		Address = address;
		PhoneNumber = phoneNumber;
	}
	public UserComponent() {
		super();
	}
	
	
	
	
	
}
