package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.service.Authservice;
import com.service.OtpService;

@RestController
@RequestMapping("/auth")
public class AuthController {

 @Autowired
 private Authservice authService;

 @Autowired
 private OtpService otpService;

 @PostMapping("/generate-otp")
 public ResponseEntity<String> generateOTP(@RequestParam String phoneNumber) {
     String otp = otpService.generateOTP(phoneNumber);
     return ResponseEntity.ok("OTP generated successfully");
 }

 @PostMapping("/login")
 public ResponseEntity<String> login(@RequestParam String phoneNumber, @RequestParam String otp) {
     if (authService.validateOTP(phoneNumber, otp)) {
         User user = authService.getUserByPhoneNumber(phoneNumber);
         	return ResponseEntity.ok("Login successful");
     }
     return ResponseEntity.badRequest().body("Invalid OTP");
 }
}

