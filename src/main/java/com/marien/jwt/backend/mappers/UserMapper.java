package com.marien.jwt.backend.mappers;

import com.marien.jwt.backend.dto.SignUpDto;
import com.marien.jwt.backend.dto.UserDto;
import com.marien.jwt.backend.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);



    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);
}
