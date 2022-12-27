package com.mys.niucommunity.mapper;

import com.mys.niucommunity.NiuCommunityApplication;
import com.mys.niucommunity.dao.DiscussPostMapper;
import com.mys.niucommunity.entity.DiscussPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author mys
 * @date 2022/12/26 15:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NiuCommunityApplication.class)
public class DiscussPostMapperTest {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectPosts() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPorts(0, 0, 5);
        for (DiscussPost post : list) {
//            System.out.println(post);
        }

        System.out.println("============================");
        int rows = discussPostMapper.selectDiscussPostRows(101);
        System.out.println(rows);
    }
}
