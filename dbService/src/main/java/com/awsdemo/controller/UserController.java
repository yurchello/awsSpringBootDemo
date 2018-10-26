package com.awsdemo.controller;

import com.awsdemo.entities.User;
import com.awsdemo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/db")
public class UserController
{
        private UserRepository userRepository;

        public UserController(UserRepository userRepository)
        {
                this.userRepository = userRepository;
        }

        @GetMapping("/{username}")
        public User getUser(@PathVariable("username") final String username) {
                return userRepository.findOneByName(username);
        }

        @GetMapping("/all")
        public List<User> getAllUsers() {
                return userRepository.findAll();
        }


        @PostMapping("/add")
        public User addUser(@RequestBody final User user){
               return userRepository.save(user);
        }
}
