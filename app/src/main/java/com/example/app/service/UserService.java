package com.example.myapp.service;
import com.example.app.model.User;
import com.example.app.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo){ this.repo = repo; }
    public List<User> list(){ return repo.findAll(); }
    public User create(User u){ return repo.save(u); }
}