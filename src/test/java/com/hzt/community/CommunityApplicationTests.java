package com.hzt.community;

import com.hzt.community.dao.DiscussPostMapper;
import com.hzt.community.dao.UserMapper;
import com.hzt.community.entity.DiscussPost;
import com.hzt.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void selectUser() {
        User user = userMapper.selectById(101);
        System.out.println(user);

        User user2 = userMapper.selectByName("hzt");
        System.out.println(user2);
    }

    @Test
    void insertUser() {
        User user = new User();
        user.setUsername("yzy");
        userMapper.insertUser(user);
    }

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    void selectPost() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        System.out.println(list.size());
        for (DiscussPost post : list) {
            System.out.println(post);
        }
    }






    }
