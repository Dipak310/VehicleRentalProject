package com.app.vehicleRental.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vehicleRental.model.User;
import com.app.vehicleRental.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		users = userRepository.findAll();
		return users;
	}
	
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}
	
	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}
	
	public void delete(int id) {
		userRepository.deleteById(id);
	}
	
	public void update(User user, int id) {
		userRepository.save(user);
	}
	
}
