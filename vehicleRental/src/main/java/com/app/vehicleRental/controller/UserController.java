package com.app.vehicleRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.vehicleRental.model.User;
import com.app.vehicleRental.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable("userId") int userId) {
        return userService.getUserById(userId);
    }
    
    @DeleteMapping("/user/{userId}")
    public void deleteUser(@PathVariable("userId") int userId) {
        userService.delete(userId);
    }
    
    @PostMapping("/users")
    public int saveUser(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user.getId();
    }
    
    @PutMapping("/users")
    public User update(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user;
    }
	
}
