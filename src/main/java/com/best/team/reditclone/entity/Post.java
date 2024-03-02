package com.best.team.reditclone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdDate;
    private int voteCount;
    private SubRedit subRedit;
    private User user;

}