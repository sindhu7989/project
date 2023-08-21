package com.service;

import org.springframework.stereotype.Service;

import com.entity.User;

@Service
public class AuthServiceImpl implements Authservice {

	@Override
	public String generateOTP(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateOTP(String phoneNumber, String otp) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public User getUserByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}
}