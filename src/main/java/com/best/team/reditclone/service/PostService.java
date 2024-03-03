package com.best.team.reditclone.service;

import com.best.team.reditclone.entity.Post;
import com.best.team.reditclone.repository.PostRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public void save(Post post){postRepository.save(post);}

    public List<Post> list(){ return postRepository.findAll();}
}
