package com.example.app.repository;
import com.example.app.model.User;
import org.springframework.stereotype.Repository;
import java.util.*;


@Repository
public class UserRepository {
    private final Map<Long, User> store = new HashMap<>();
    public List<User> findAll(){ return new ArrayList<>(store.values()); }
    public User save(User u){ store.put(u.getId(), u); return u; }
}