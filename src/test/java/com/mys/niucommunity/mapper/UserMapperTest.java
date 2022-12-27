package com.mys.niucommunity.mapper;

import com.mys.niucommunity.NiuCommunityApplication;
import com.mys.niucommunity.dao.UserMapper;
import com.mys.niucommunity.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author mys
 * @date 2022/12/26 16:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NiuCommunityApplication.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(1);
        System.out.println(user);

        user = userMapper.selectByName("aaa");
        System.out.println(user);

        user = userMapper.selectByEmail("nowcoder137@sina.com");
        System.out.println(user);
    }
}
