package com.lee.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lee.domain.User;

public class JavaTest {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("i love idea");
        User user = new User();
        user.setId("1");
        user.setName("idea");
        String userjson = new ObjectMapper().writeValueAsString(user);
        System.out.println(userjson);
    }
}
