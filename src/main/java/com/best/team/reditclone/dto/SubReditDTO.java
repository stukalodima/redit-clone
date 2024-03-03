package com.best.team.reditclone.dto;

import com.best.team.reditclone.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SubReditDTO {

    private String name;
    private User user;
}
