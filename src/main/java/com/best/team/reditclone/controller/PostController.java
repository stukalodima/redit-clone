package com.best.team.reditclone.controller;

import com.best.team.reditclone.dto.PostDTO;
import com.best.team.reditclone.entity.Post;
import com.best.team.reditclone.service.PostService;
import com.best.team.reditclone.service.SubReditService;
import com.best.team.reditclone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    private final SubReditService subReditService;
    private final UserService userService;
    @PostMapping("/add")
    public String add(@RequestBody PostDTO ignoredPostDTO) {
        Post post = Post.with()
                .name("Test")
                .description("Test")
                .createdDate(LocalDateTime.now())
                .voteCount(0)
                .subRedit(subReditService.findById(3L))
                .user(userService.findById(1L))
                .build();

        postService.save(post);
        return String.valueOf(new ResponseEntity<>("Post registration successful", OK));
    }

    @GetMapping("/list")
    public String list() {
        return String.valueOf(new ResponseEntity<>(postService.list().toString(), OK));
    }
}
