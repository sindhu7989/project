package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
 @Id
 @GeneratedValue
 private Long id;
 private String phoneNumber;
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
 
}



