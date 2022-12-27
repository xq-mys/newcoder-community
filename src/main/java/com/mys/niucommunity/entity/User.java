package com.mys.niucommunity.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author mys
 * @date 2022/12/26 14:50
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
