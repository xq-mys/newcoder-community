package com.mys.niucommunity.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author mys
 * @date 2022/12/26 14:50
 */
@Data
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
