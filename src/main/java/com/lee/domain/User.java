package com.lee.domain;

import lombok.Data;

import java.util.Date;
@Data
public class User {


    private String id;
    private String name;
    private  String password;
    private Date createTime;
    private Date updateTime;
}
