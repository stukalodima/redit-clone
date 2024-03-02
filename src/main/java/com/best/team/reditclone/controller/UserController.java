package com.best.team.reditclone.controller;

import com.best.team.reditclone.dto.UserDTO;
import com.best.team.reditclone.entity.User;
import com.best.team.reditclone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody UserDTO ignoredUserDTO) {
        User user = User.with()
                .displayName("test")
                .login("test")
                .firstName("test")
                .lastName("test")
                .password("test")
                .ava(null)
                .email("test")
                .active(true)
                .build();
        userService.save(user);
        return String.valueOf(new ResponseEntity<>("User registration successful", OK));
    }

    @GetMapping("/list")
    public String list() {
        List<User> list = userService.list();
        return String.valueOf(new ResponseEntity<>(list.toString(), OK));
    }
}
