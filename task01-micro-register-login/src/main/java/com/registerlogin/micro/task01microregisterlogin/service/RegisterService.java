package com.registerlogin.micro.task01microregisterlogin.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registerlogin.micro.task01microregisterlogin.Repository.RegisterRepository;
import com.registerlogin.micro.task01microregisterlogin.domain.Users;

@Service
public class RegisterService {

	@Autowired
	RegisterRepository repo;
	
	
	public List<Users> getUsersByEmail(String email){
		
		return  repo.findByEmail(email);
	}


	public void saveUser(@Valid Users user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}
	
	public List<Users> getAllUsers(){
		
		System.out.println("get all users into the users");
		List<Users> u= repo.findAll();
		System.out.println("get all users into the users"+u.get(0));
		return u;
	}
	
}
