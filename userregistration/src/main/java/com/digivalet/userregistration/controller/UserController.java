package com.digivalet.userregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digivalet.userregistration.repository.UserRepository;
import com.digivalet.userregistration.user.User;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/")
public class UserController {

	@Autowired
    private UserRepository repo;
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUser()
	{
		return (List<User>)repo.findAll();
	}
	@GetMapping("/getUser/{id}")
	public ResponseEntity.BodyBuilder geUserById(@PathVariable(name = "id") Long id)
	{
	       repo.findById(id);
		return ResponseEntity.ok();
	}
	
	public void updateUser()
	{
		
	}
	public void createUser()
	{
		
	}
	public void deleteUser()
	{
		
	}
}
