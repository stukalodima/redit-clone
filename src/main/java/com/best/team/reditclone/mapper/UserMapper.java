package com.best.team.reditclone.mapper;

import com.best.team.reditclone.dto.UserDTO;
import com.best.team.reditclone.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "login", target = "username")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    UserDTO map(User user);

    @Mapping(source = "username", target = "login")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(target = "ava", ignore = true)
    @Mapping(target= "id", ignore = true)
    @Mapping(target = "displayName", expression = "java(userDTO.getFirstName() + \" \" + userDTO.getLastName())")
    @Mapping(target = "active", constant = "true")
    User map(UserDTO userDTO);

}
