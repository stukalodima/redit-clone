package com.best.team.reditclone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "with")
@Entity
@Table(name = "post")
public class Post {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdDate;
    private int voteCount;
    private SubRedit subRedit;
    private User user;

}