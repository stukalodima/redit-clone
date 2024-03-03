package com.best.team.reditclone.mapper;

import com.best.team.reditclone.dto.UserDTO;
import com.best.team.reditclone.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "login", source = "username")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    @Mapping(target ="displayName", expression = "java(userDTO.getFirstName() + \" \" + userDTO.getLastName())")
    @Mapping(target = "ava", constant = "null")
    @Mapping(target = "active", constant = "true")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    UserDTO map(User user);

    User map(UserDTO userDTO);

}
