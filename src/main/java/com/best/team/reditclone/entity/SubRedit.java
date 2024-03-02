package com.best.team.reditclone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubRedit {

    private Long id;
    private String name;
    private LocalDateTime createdDate;
    private User user;

}