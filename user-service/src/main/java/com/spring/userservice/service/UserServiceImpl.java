package com.spring.userservice.service;

import com.spring.userservice.domain.User;
import com.spring.userservice.model.UserRequestDto;
import com.spring.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserRequestDto userRequestDto) {
        User user =new User();
        user.setFirstName(userRequestDto.getFirstName());

        return userRepository.save(user);
    }

    @Override
    public User get(String firstName) {

        User existUser = userRepository.findByFirstName(firstName);

        if (existUser==null) return new User();
        return existUser;
    }
}
