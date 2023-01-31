package com.spring.postservice.client;

import com.spring.postservice.model.User;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletResponse;

@FeignClient(value = "user-service", url = "http://localhost:2000/api/user")
public interface ApiFeignClient {


    @GetMapping(value = "/{firstName}")
    User getUser(@RequestHeader(value = "Auth") String token , @PathVariable String firstName);
}