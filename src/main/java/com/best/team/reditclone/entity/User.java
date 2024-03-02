package com.best.team.reditclone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String displayName;
    private String login;
    private String firstName;
    private String lastName;
    private String password;
    private byte ava;
    private String email;
    private boolean active;

}