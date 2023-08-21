package com.reposiotory;

import com.entity.Otp;

public interface OtpRepository {
Otp findByPhoneNumber(String phoneNumber);
void saveOrUpdateOTP(Otp otp);
}
