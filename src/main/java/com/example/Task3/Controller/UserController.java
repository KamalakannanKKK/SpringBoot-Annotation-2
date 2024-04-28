package com.example.Task3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Task3.Component.UserComponent;
import com.example.Task3.Services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<UserComponent> getAllUser(){
		return  userservice.listallUser();
	}

}
