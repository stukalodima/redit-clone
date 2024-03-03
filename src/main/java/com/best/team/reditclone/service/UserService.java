package com.best.team.reditclone.service;

import com.best.team.reditclone.dto.UserDTO;
import com.best.team.reditclone.entity.User;
import com.best.team.reditclone.mapper.UserMapper;
import com.best.team.reditclone.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public void save(UserDTO userDTO) {
        User user = userMapper.map(userDTO);
        userRepository.save(user);
    }

    public List<User> list() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        return userRepository.findById(id);
    }
}
