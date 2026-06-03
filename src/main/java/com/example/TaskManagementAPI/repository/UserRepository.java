package com.example.TaskManagementAPI.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TaskManagementAPI.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByUsername(String username);
}
