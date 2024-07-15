package com.jpafrota.demo.services;

import com.jpafrota.demo.entities.User;
import com.jpafrota.demo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
}
