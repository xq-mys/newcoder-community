package com.mys.niucommunity.service;

import com.mys.niucommunity.dao.UserMapper;
import com.mys.niucommunity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mys
 * @date 2022/12/26 16:59
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
