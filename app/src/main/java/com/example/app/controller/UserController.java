package com.example.app.controller;
import org.springframework.web.bind.annotation.*;
import com.example.app.model.User;
import com.example.myapp.service.UserService;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service){ this.service = service; }


    @GetMapping
    public List<User> all(){ return service.list(); }


    @PostMapping
    public User create(@RequestBody User u){ return service.create(u); }
}