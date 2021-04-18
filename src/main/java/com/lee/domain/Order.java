package com.lee.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author fzbin
 * @title: Order
 * @projectName springboot_demo
 * @description: 订单表对应的实体
 * @date 2021/4/1816:10
 */
@Data
public class Order {
    private String id;
    private String createId;
    private Date crateTime;
    private Date updateTime;

}
