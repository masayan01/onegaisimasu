package com.example.samuraitravel.samuraitravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.samuraitravel.samuraitravel.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {	
    public User findByEmail(String email);
}
