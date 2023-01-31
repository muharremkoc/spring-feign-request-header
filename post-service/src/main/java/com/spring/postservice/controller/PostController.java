package com.spring.postservice.controller;

import com.spring.postservice.client.ApiFeignClient;
import com.spring.postservice.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/post")
public class PostController {


    private final ApiFeignClient apiFeignClient;


    public PostController(@Qualifier("apiFeignFactory") ApiFeignClient apiFeignClient) {
        this.apiFeignClient = apiFeignClient;
    }


    @GetMapping(value = "/getUser")
    public User user(@RequestParam String firstName){

        return apiFeignClient.getUser("Bearer",firstName);
    }
}
