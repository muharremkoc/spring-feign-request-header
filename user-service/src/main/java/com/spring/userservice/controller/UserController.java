package com.spring.userservice.controller;

import com.spring.userservice.domain.User;
import com.spring.userservice.model.UserRequestDto;
import com.spring.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User create(@RequestBody UserRequestDto userRequestDto){
        return userService.create(userRequestDto);
    }

    @GetMapping("/{firstName}")
    public User get(@PathVariable("firstName") String firstName){
        return userService.get(firstName);
    }
}
