package com.entity;

import javax.persistence.Entity;

@Entity
public class Otp {
private String phoneNumber;
private String otp;
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getOtp() {
	return otp;
}
public void setOtp(String otp) {
	this.otp = otp;
}

}