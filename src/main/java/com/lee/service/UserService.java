package com.lee.service;

import com.lee.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author fzbin
 * @title: UserService
 * @projectName springboot_demo
 * @description: 用户相关的业务写于此
 * @date 2021/4/1820:52
 */
@Service
public class UserService {
    public User getUserById(){
        return new User();
    }
}
