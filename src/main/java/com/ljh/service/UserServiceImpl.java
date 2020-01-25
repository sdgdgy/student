package com.ljh.service;

import com.ljh.dao.UserMapper;
import com.ljh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int addUser(User user) {
        userMapper.addUser(user);
        return 1;
    }

    public int updateUser(User user) {
        userMapper.updateUser(user);
        return 1;
    }

    public int deleteUser(String id) {
        userMapper.deleteUser(id);
        return 1;
    }

    public List<User> queryUserById(String id) {
        return userMapper.queryUserById(id);
    }

    public List<User> queryUserAll() {
        return userMapper.queryUserAll();
    }
}
