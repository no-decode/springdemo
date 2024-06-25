package com.example.demo;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class UserController {
public List<User> users() {
    return List.of(new User("marco",25));


    }
}
