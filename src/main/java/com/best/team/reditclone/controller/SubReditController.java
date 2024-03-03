package com.best.team.reditclone.controller;


import com.best.team.reditclone.dto.SubReditDTO;
import com.best.team.reditclone.dto.UserDTO;
import com.best.team.reditclone.entity.SubRedit;
import com.best.team.reditclone.entity.User;
import com.best.team.reditclone.service.SubReditService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/subRedit")
@RequiredArgsConstructor
public class SubReditController {
    private final SubReditService subReditService;

    @PostMapping("/signup")
    public String signup(@RequestBody SubReditDTO ignoredSubReditDTO) {
        SubRedit subRedit = SubRedit.with()
                .name("test")
                .createdDate(LocalDateTime.now())
                .user(User.with().build())
                .build();
        subReditService.save(subRedit);
        return String.valueOf(new ResponseEntity<>("SubRedit registration successful", OK));
    }

    @GetMapping("/list")
    public String list() {
        List<SubRedit> list = subReditService.list();
        return String.valueOf(new ResponseEntity<>(list.toString(), OK));
    }
}
