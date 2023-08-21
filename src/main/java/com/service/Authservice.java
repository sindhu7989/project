package com.service;

import com.entity.User;

public interface Authservice {
 String generateOTP(String phoneNumber);
 boolean validateOTP(String phoneNumber, String otp);
User getUserByPhoneNumber(String phoneNumber);
}



