package com.spring.postservice.client;

import com.spring.postservice.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

@Component
public class ApiFeignFactory implements ApiFeignClient {




    final ApiFeignClient apiFeignClient;

    public ApiFeignFactory(    @Qualifier("com.spring.postservice.client.ApiFeignClient") ApiFeignClient apiFeignClient) {
        this.apiFeignClient = apiFeignClient;
    }

    @Override
    public User getUser(String token,String firstName) {

        return apiFeignClient.getUser(token,firstName);
    }


}