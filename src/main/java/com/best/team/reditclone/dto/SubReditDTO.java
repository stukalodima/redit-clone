package com.best.team.reditclone.dto;

import com.best.team.reditclone.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class SubReditDTO {

    private String name;
    private LocalDateTime createdDate;
    private User user;
}
