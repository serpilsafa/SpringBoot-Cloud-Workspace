package com.safa.mongo.api;

import com.safa.mongo.entity.User;
import com.safa.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        User user = new User();
        user.setName("Serpil");
        user.setLastName("Safa");
        userRepository.save(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userRepository.findAll());

    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }
}
