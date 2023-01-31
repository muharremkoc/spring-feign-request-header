package com.spring.userservice.service;

import com.spring.userservice.domain.User;
import com.spring.userservice.model.UserRequestDto;

public interface UserService {

    User create(UserRequestDto userRequestDto);

    User get(String firstName);
}
