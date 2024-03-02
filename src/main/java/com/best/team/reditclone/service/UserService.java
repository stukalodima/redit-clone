package com.best.team.reditclone.service;

import com.best.team.reditclone.entity.User;
import com.best.team.reditclone.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public List<User> list() {
        return userRepository.findAll();
    }
}
