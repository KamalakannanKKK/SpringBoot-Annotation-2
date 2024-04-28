package com.example.Task3.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Task3.Component.UserComponent;
import com.example.Task3.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public List<UserComponent> listallUser(){
		return userRepo.findAll();
	}
}
