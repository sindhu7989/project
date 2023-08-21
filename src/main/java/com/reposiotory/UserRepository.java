package com.reposiotory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
 User findByPhoneNumber(String phoneNumber);
}



