package com.example.TaskManagementAPI.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.TaskManagementAPI.entity.User;
import com.example.TaskManagementAPI.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

    private UserRepository userRepository;
	
	public CustomUserDetailsService(UserRepository userRepository)
	{
		this.userRepository = userRepository;
	}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User databaseUser = this.userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found"));

        return org.springframework.security.core.userdetails.User
                .withUsername(databaseUser.getUsername())
                .password(databaseUser.getPassword()) // Must be BCrypt hashed in the DB!
                .authorities("ROLE_USER")              // Gives the user a default role
                .build();
    }
    
}
