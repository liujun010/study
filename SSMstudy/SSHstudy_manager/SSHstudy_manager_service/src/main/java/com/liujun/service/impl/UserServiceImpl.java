package com.liujun.service.impl;

import com.liujun.mapper.UserMapper;
import com.liujun.pojo.User;
import com.liujun.pojo.UserExample;
import com.liujun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liujun on 2019/3/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);

        List<User> userList = userMapper.selectByExample(userExample);

        if (userList != null) {
            return userList.get(0);
        }

        return null;
    }
}
